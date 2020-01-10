package rx2

import io.reactivex.schedulers.Schedulers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.rx2.await
import kotlinx.coroutines.rx2.awaitFirst
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory



fun main() = runBlocking {

    println("Making GitHub API request")

    val retrofit = Retrofit.Builder().apply {
        baseUrl("https://api.github.com")
        addConverterFactory(GsonConverterFactory.create())
        addCallAdapterFactory(RxJava2CallAdapterFactory.create())
    }.build()

    val github = retrofit.create(GitHubRx::class.java)

    val launch = launch {

        //订阅与取消都在同一个线程中，订阅后发射数据会阻塞取消动作
        val contributors = github.contributors("JetBrains", "Kotlin")
                .doOnSubscribe {
                    println("up stream doOnSubscribe")
                }
                .doOnNext {
                    println("do on next ------> $it")
                }
                .doOnDispose {
                    println("doOnDispose")
                }
                .doAfterTerminate {
                    println("doAfterTerminate")
                }
                .doOnSubscribe {
                    println("down stream doOnSubscribe")
                }
                .awaitFirst()
                .take(10)

        println("contributors = $contributors")

        for ((name, contributions) in contributors) {
            println("$name has $contributions contributions, other repos: ")
            val otherRepos = github.listRepos(name).await().map(Repo::name).joinToString(", ")
            println(otherRepos)
        }

    }

    println("end...")
    delay(50)
    launch.cancel()

}

private fun rx() = runBlocking {
    println("Making GitHub API request")

    val retrofit = Retrofit.Builder().apply {
        baseUrl("https://api.github.com")
        addConverterFactory(GsonConverterFactory.create())
        addCallAdapterFactory(RxJava2CallAdapterFactory.create())
    }.build()

    val github = retrofit.create(GitHubRx::class.java)
    //订阅与取消都在不同一个线程中，订阅后发射数据不会阻塞取消动作
    val contributors = github.contributors("JetBrains", "Kotlin")
            .subscribeOn(Schedulers.io())
            .doOnSubscribe {
                println("up stream doOnSubscribe")
            }
            .doOnNext {
                println("do on next ------> $it")
            }
            .doOnDispose {
                println("doOnDispose")
            }
            .doAfterTerminate {
                println("doAfterTerminate")
            }
            .doOnSubscribe {
                println("down stream doOnSubscribe")
            }
            .subscribe(
                    {
                        println("success --> $it")
                    },
                    {
                        println("error --> $it")
                    }
            )

    delay(1000)
    println("end...")
    contributors.dispose()
}