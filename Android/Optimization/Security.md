# 应用程序安全

---
## 1 把敏感数据写入so库

实现双向加密

1. so层通过反射获取App的签名
2. 把正式签名预配置在so层中
3. 在so加载时验证动态获取的App签名与so中预留的App签名，签名一直才允许正常加载，否则抛出异常
4. 把App用于加密的Key或者其他敏感数据放在so层中，待so层验证签名通过后才可以被获取。

这样就可以实现双向加密

---
## 2 混淆代码，防止反编译

使用proguard进行代码混淆

---
## 3 使用第三方加固

- 360加固
- 腾讯加固
- 阿里加固

---
## 4 把HTTP替换为HTTPS

HTTP本身是不安全的通讯协议，HTTPS在HTTP的基础上对双方传输数据进行了加密。

---
## 5 代码实现安全

- 日志：正式版关掉所有日志，避免泄漏敏感信息
- `WebView`：WebView防注入风险

---
## 引用

- [native层实现安全关键信息保护：把敏感数据写入so库](http://www.jianshu.com/p/2576d064baf1)
- [安卓安全开发](http://www.jianshu.com/p/500f1fd13b9b)
- [你的App正在裸奔！](https://mp.weixin.qq.com/s/Kz7XJPimggPJbk1iZ4g2RQ)