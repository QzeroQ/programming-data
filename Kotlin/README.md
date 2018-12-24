## 1 Kotlin 简介

Kotlin主要是由俄罗斯圣彼得堡的JetBrains开发团队所发展出来的编程语言，其名称来自于圣彼得堡附近的科特林岛。Kotlin是一门 **静态的强类型编程语言**，可以运行在JVM上，但不限于JVM。Kotlin与所有基于 Java的框架完全兼容，应用领域有 **服务端开发、Android开发、Kotlin For JavaScript、Kotlin Native**，可以说是全栈语言。

Kotlin 领域：

- Kotlin Script，直接运行.kts文件
- gradle脚本
- web开发
- javaFX
- 前端开发，编译为JavaScript
- native，与c代码交互，不依赖JVM

kotlin 发展简史：

- 2010 立项
- 2011.6 公开
- 2012.2 开源
- 2013.8 支持 AndroidStudio
- 2014.4.6 全新web站点 `kotlinlang.org`
- 2016.2 发布1.0
- 2016.9 支持 apt
- kotlin 生成的字节码默认支持 java6

## 2 Kotlin 学习笔记

Kotlin 基础：

- [Kotlin 基础语法](Kotlin01-基础语法.md)
- [Kotlin 面向对象](Kotlin02-面向对象.md)
- [Kotlin 函数与扩展](Kotlin03-函数与扩展.md)
- [Kotlin Lambda编程](Kotlin04-Lambda编程.md)
- [Kotlin 类型系统](Kotlin05-类型系统.md)
- [Kotlin 运算符重载](Kotlin06-运算符重载.md)
- [Kotlin 委托](Kotlin07-委托.md)
- [Kotlin 泛型](Kotlin08-泛型.md)
- [Kotlin 与 Java 互操作](Kotlin09-与Java互操作.md)
- [Kotlin 反射](Kotlin10-反射.md)
- [Kotlin API 总结](Kotlin-API总结.md)

Kotlin Android：

- [Kotlin Android 开发实践](Kotlin-Android-开发实践.md)

Kotlin 协程：

- [Kotlin 协程概述](KotlinCoroutine01-概述.md)
- [Kotlin Guide](KotlinCoroutine02-Guide.md)
- [Kotlin 协程总结](KotlinCoroutine03-总结.md)
- [Kotlin 协程实践](KotlinCoroutine04-实践.md)

## 3 Kotlin 学习资料

### 1 文档与资料

- [官网](https://kotlinlang.org/)
- [官方：Kotlin协程](https://github.com/Kotlin/kotlinx.coroutines)
- [官方：kotlin-examples](https://github.com/JetBrains/kotlin-examples)
- [Kotlin 中文站](https://www.kotlincn.net/)
- [Ktor 中文站](https://ktor.kotlincn.net/)
- [kymjs：Kotlin Primer](https://kymjs.com/code/2017/02/03/01/)
- [EasyKotlin](https://github.com/JackChan1999/EasyKotlin)
- [EasyKotlin-All](https://github.com/EasyKotlin)
- [《Kotlin实战》](https://panxl6.gitbooks.io/kotlin-in-action-in-chinese/content/introduction.html)
- [《Atomic Kotlin》]((https://github.com/BruceEckel/AtomicKotlinExamples))

### 2 Android

- [kotlin-for-android-developers](https://wangjiegulu.gitbooks.io/kotlin-for-android-developers-zh/guan_yu_ben_shu.html)
- [Kotlin on Android FAQ](https://developer.android.com/kotlin/faq.html)
- [官方：anko库](https://github.com/Kotlin/anko)
- [kovenant](http://kovenant.komponents.nl/)：Kotlin的简单异步库
- [Kotlin Android Extensions: Say goodbye to findViewById](https://antonioleiva.com/kotlin-android-extensions/)

### 3 项目

- [awesome-kotlin](https://github.com/KotlinBy/awesome-kotlin)
- [awesome-kotlin-cn](https://github.com/kymjs/awesome-kotlin-cn)
- [Exposed](https://github.com/JetBrains/Exposed) Kotlin SQL Framework
- [Kodein](https://github.com/SalomonBrys/Kodein/) Kotlin 依赖注入框架
- [Fuel](https://github.com/kittinunf/Fuel) Kotlin 网络请求库
- [kotlintest](https://github.com/kotlintest/kotlintest) 测试项目
- [kotlinpoet](https://github.com/square/kotlinpoet) 类似 square 的 javapoet，用于生成 kotlin 代码

### 4 协程

什么是协程：

- [我理解的协程](https://www.zybuluo.com/kuailezhishang/note/128823)
- [协程(廖雪峰)](http://www.liaoxuefeng.com/wiki/001374738125095c955c1e6d8bb493182103fac9270762a000/0013868328689835ecd883d910145dfa8227b539725e5ed000)
- [协程的好处有哪些？](https://www.zhihu.com/question/20511233/answer/24260355)

文档与示例：

- [kotlin coroutines 文档](https://www.kotlincn.net/docs/reference/coroutines.html)
- [kotlin-coroutines 描述](https://github.com/Kotlin/kotlin-coroutines)
- [kotlinx.coroutines 库](https://github.com/Kotlin/kotlinx.coroutines)
- [kotlinx.coroutines 翻译](https://saplf.gitbooks.io/kotlinx-coroutines/content/)
- [深入理解 Kotlin Coroutine](https://blog.kotliner.cn/tags/Coroutine/)
- [Kotlin Primer·协程库](https://www.kymjs.com/code/2017/11/24/01/)
- [Kotlin Coroutines(协程)](https://blog.dreamtobe.cn/kotlin-coroutines/)
- [Kotlin 协程使用手册](https://juejin.im/post/5a90e3836fb9a063592bebe2)
- [coroutine-recipes 协程风格代码](https://github.com/dmytrodanylyk/coroutine-recipes)

博客：

- [Kotlin coroutines vs RxJava: an initial performance test](https://proandroiddev.com/kotlin-coroutines-vs-rxjava-an-initial-performance-test-68160cfc6723)

### 5 kotlin 跟进...

教程

- [Kotlin 系统入门到进阶 视频教程](http://coding.imooc.com/class/108.html)
- [基于 GitHub App 业务深度讲解 Kotlin1.2高级特性与框架设计](https://coding.imooc.com/class/232.html)
- [BennyHuo github](https://github.com/enbandari)，上面两门课程作者的 Github

Google

- [31 天，从浅到深轻松学习 Kotlin](https://mp.weixin.qq.com/s?__biz=MzAwODY4OTk2Mg==&mid=2652046391&idx=1&sn=46efa48076a4533f355af6351b76c012&chksm=808ca472b7fb2d64afc89edf6beba1540e5a6ff49ad6346bd5d72b3957fa5f9323e07b8aab03&mpshare=1&scene=1&srcid=0615eHvcY8XijqYM5CH09baV#rd)
- [Kotlin 实战指南 | 如何在大型应用中添加 Kotlin](https://mp.weixin.qq.com/s?__biz=MzAwODY4OTk2Mg==&mid=2652047413&idx=1&sn=d8b248868406fc641b8a11ccc16807a5&scene=21#wechat_redirect)

Kotlin 更新

- [kotlinx.serialization 组件](https://discuss.kotliner.cn/t/topic/226)
- [NoArg 插件的 invokeInitializers 配置](https://mp.weixin.qq.com/s/0mEpsYfOrZDUdIoeKkL1xg)
- [Kotlin 1.3 RC is Here: Migrate Your Coroutines!](https://blog.jetbrains.com/kotlin/2018/09/kotlin-1-3-rc-is-here-migrate-your-coroutines/)
- [Kotlin 1.3 Released with Coroutines, Kotlin/Native Beta, and more](https://blog.jetbrains.com/kotlin/2018/10/kotlin-1-3/)
- [来看看 Kotlin 1.3-M2 都有哪些好玩的东西](https://mp.weixin.qq.com/s?__biz=MzIzMTYzOTYzNA==&mid=2247484229&idx=1&sn=39328734a73ce7033f017fdc9b0dd3a8&chksm=e8a05c78dfd7d56ebdbdce91ba8291f3678de02e522dc6f47118e01cce5335e0593c68441cf0&mpshare=1&scene=1&srcid=0917x8zBcvTHH1gFHLsD6HEI#rd)
- [Kotlin 1.3 RC 来啦：快迁移您的协程代码吧！](https://mp.weixin.qq.com/s/tYkPr6dKJA0HEAlSZ0CLkg)

