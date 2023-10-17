## 前言
### 🍊缘由
####  图片识别文字，咱用java也可以

通过**java+百度ocr**，实现一个截图或上传图片，**图片识别文字的小工具**。并通过**exe4j工具**将jar包封装成exe可执行桌面文件，方便使用及学习。

![](https://img.javadog.net/blog/ocr-java/b78594c06972484a9a57f287f749fe42.png)

******
### 🍍 Tip
一位特别的老友即将**在2023年10月26日**年满**30周岁**，愿**平安喜乐**
![](https://img.javadog.net/blog/ocr-java/f3d2b9de136a493fb854b0721ff22496.png)

******
### 🎁快速链接
公众号：【JavaDog程序狗】
**关注公众号，发送 ocr ，无任何套路即可获得**
![](https://img.javadog.net/blog/ocr-java/08f99c192bc450038478765fc9ee787.png)

******
### 🥝成果初展
#### 可执行的ocr-java.exe文件
![](https://img.javadog.net/blog/ocr-java/f7947fb36050478781401a5466af3d63.png)

#### 图片识别
![](https://img.javadog.net/blog/ocr-java/ffcdd1ee82e34d68ad5813b11a51353e.png)

#### 选择图片
![](https://img.javadog.net/blog/ocr-java/0c678b5cc3ad459699b4fcc44fa543f7.png)

#### 截图
![](https://img.javadog.net/blog/ocr-java/28abe0225e5d4baab90109c46256d970.png)

******
### 🎯主要目标
#### 实现3大重点
##### 1. Java Swing页面基础布局
##### 2. 百度ocr使用方法
##### 3. exe4j工具如何将jar打成exe文件

******

##  正文
### 🍋前置条件
#### Java环境（必备）
后端以**Java Swing**为框架基础，所以Java基础是前置条件

![](https://img.javadog.net/blog/ocr-java/8ff1eceb7729482ca70822d6490853d2.png)

#### 百度ocr（必须）
- 登录百度云官网，点击【立即使用】

> [https://cloud.baidu.com/product/ocr.html](https://cloud.baidu.com/product/ocr.html)

![](https://img.javadog.net/blog/ocr-java/09664d0aee224988a0cc4e7e9193b634.png)

- 根据提示步骤进行**无脑申请**，**免费试用**

![](https://img.javadog.net/blog/ocr-java/110ff819632146348d3059f7ea6f5c91.png)

- 申请完成，可**在线调试**

![](https://img.javadog.net/blog/ocr-java/02a7ec7d51804184a08b661d4891cf22.png)

![](https://img.javadog.net/blog/ocr-java/af6caa0e537c4ab39c9d45136e5d1bee.png)

- 【通用文字识别-标准版】在线测试

![](https://img.javadog.net/blog/ocr-java/da657e5fc4494aba9fe71cef82260d7e.png)

#### exej（非必须）
将jar打包成可直接运行的exe文件，如果不打包可以不掌握

******
### 🔆技术栈
#### 后端
| 插件 | 版本 | 用途 |
| --- | ----- |  ----- |
| jdk |  1.8 |java环境 |
| lombok | 1.18.12 |代码简化插件 |
| maven | 3.6.3 |包管理工具 |
| BeautyEye| 1.0.0 | Java Swing 跨平台外观实现 |
| hutool| 5.5.8 | Java工具类库|
| okhttp3| 4.9.3 | 网络请求框架|
| json| 20160810 | JSON解析工具 |
| slf4j| 2.0.7 | 日志类库|

******

### 🌽重点解析
#### Java Swing页面基础布局
##### 1. 代码结构

![](https://img.javadog.net/blog/ocr-java/3fbbe8ce80d744c6a65e064ccfc72b5d.png)

##### 2. 初始化容器

![](https://img.javadog.net/blog/ocr-java/601cfae89ac349b29bef92914912a72b.png)

##### 3. 屏幕选择截图

![](https://img.javadog.net/blog/ocr-java/33dca65e68394607bf1734f664d6f2a0.png)

##### 4. 选择图片文件

![](https://img.javadog.net/blog/ocr-java/5c79ba92a6b3403aa2950339d2d3b63f.png)

##### 5. 图片识别文字

![](https://img.javadog.net/blog/ocr-java/030e745c8cff4920ad5041f1bc73b785.png)

******
#### 百度ocr配置
##### 1. 获取应用配置参数
> [https://console.bce.baidu.com/ai/#/ai/ocr/app/list](https://console.bce.baidu.com/ai/#/ai/ocr/app/list)

![](https://img.javadog.net/blog/ocr-java/af03706bfd9e4f2ea0f1b24a12e8ce17.png)

##### 2. 设置参数
将上方的找到的**API_KEY**和**SECRET_KEY**放置OcrUtil工具类中

![](https://img.javadog.net/blog/ocr-java/e2532d0601ff43bfbc9b978a78b35700.png)

##### 3. 运行调试
启动java程序即可

![](https://img.javadog.net/blog/ocr-java/b57b09ae7f3e4f389208d1f4d1b6d635.png)

4. 启动成果

![](https://img.javadog.net/blog/ocr-java/a06fa7beeefd4eed847c4636296e8dad.png)

******
#### 将java项目打包成jar
##### 1. 模块设置
【右击】项目根目录**ocr-java-master**，【点击】选中**Open Module Settings**

![](https://img.javadog.net/blog/ocr-java/fdaa57932e3b46249e0dfb41bcfdf057.png)

##### 2. 打包配置
- 【点击】左侧**Artifacts**，新增打包配置

![](https://img.javadog.net/blog/ocr-java/a444c58b09964b1096af5f638ddfdea8.png)

- 配置主启动类，并【点击】**OK**

![](https://img.javadog.net/blog/ocr-java/ebe883b0ba4a488297aae575c86b0668.png)

- 指定jar输出路径**Output directory**【点击】**OK**或者**Apply**即可配置成功

![](https://img.javadog.net/blog/ocr-java/adb67067bf3248d38be28a7489605629.png)

##### 3. 测试打包
- 点击idea工具栏，**Build=>Build Artifacts**

![](https://img.javadog.net/blog/ocr-java/f25944fa5f15439b88da499bda64067a.png)

- Action选择**Build**即可

![](https://img.javadog.net/blog/ocr-java/ac06425be33449e6926a8619da8c89b1.png)

##### 4. 查看打包结果
- 到上方配置的输出路径查看jar包

![](https://img.javadog.net/blog/ocr-java/cf3af7e35abd44eaab47fd70c72490c7.png)

##### 5. 测试jar包是否可用
在当前路径下，使用命令启动，展示页面即可
```shell
java -jar ocr-java-master.jar
```

![](https://img.javadog.net/blog/ocr-java/80b9e936e9a94a3cbef00e814b32eb23.png)


******
#### exe4j将jar打包exe
##### 1. 什么是exe4j

**exe4j** 是一个帮助你集成 **Java 应用程序到 Windows 操作环境的 java 可执行文件生成工具**，无论这些应用是用于服务器，还是图形用户界面（GUI）或命令行的应用程序。exe4j 帮助你以一种安全的方式启动你的 java 应用程序，来显示本地启动画面，**检测及发布合适的 JRE 和 JDK**，以及进行启动时所发生的错误处理等。

##### 2. 下载exe4j

>[https://exe4j.apponic.com/download/](https://exe4j.apponic.com/download/)

![](https://img.javadog.net/blog/ocr-java/c8d05986d37c4f21b4c0065d42667fcc.png)

##### 3. 安装exe4并打开

- 无脑安装就可，然后打开软件

![](https://img.javadog.net/blog/ocr-java/86ef6ddbe35a46c89353276401d4121e.png)

##### 4. 将jar打包成exe
按照exe4j左测步骤进行打包流程

![](https://img.javadog.net/blog/ocr-java/456a063d79da45849f76c117f2ccbe7a.png)

- 1.Welcome
姓名、公司随便录入，**许可证密钥，网上百度一个即可**，填完即可【点击】下一步

![](https://img.javadog.net/blog/ocr-java/c558153335d54caea9e25e570ac8bb45.png)

- 2.Project type
选择项目类型，**JAR in EXE mode**，【点击】下一步

![](https://img.javadog.net/blog/ocr-java/c68f8bdbea094a148cb975accdaa4840.png)

- 3.Application info
**录入应用名**，并**设置输出路径**，【点击】下一步

![](https://img.javadog.net/blog/ocr-java/c99163d0dddb47899d55f3060b349aa3.png)

- 4.Executable info
配置**对应文件名、打包后图、选择64-bit可执行文件的体系结构、配置可执行清单的选项**，【点击】下一步

![](https://img.javadog.net/blog/ocr-java/8d580bbd46b14fc1a982b042cc435cb1.png)

![](https://img.javadog.net/blog/ocr-java/66447265ff90479a85652a3ec206ca86.png)

![](https://img.javadog.net/blog/ocr-java/387659b2ef39426fa6d139b81ef0e196.png)

- 5.Java invocation
选择**生成的jar包路径、设置主启动类、设置exe输出位置、并配置是否加载三方依赖**，【点击】下一步

![](https://img.javadog.net/blog/ocr-java/9e1fc9d53cf64dc7a5853f3534f48ae4.png)

- 6.JRE
设置jre版本为1.8，并选择本机JRE环境，无脑默认【点击】下一步

![](https://img.javadog.net/blog/ocr-java/654d2f4cceec4cfdb589bdf3164e8e2a.png)

![](https://img.javadog.net/blog/ocr-java/077d56b18b67462e88a4767aa91dbf42.png)

![](https://img.javadog.net/blog/ocr-java/eb920eec50e94966be2271783fa5d7a7.png)

![](https://img.javadog.net/blog/ocr-java/c0549ca2e8a948b99814439db4370f11.png)

- 7.Splash screen
无脑默认【点击】下一步

![](https://img.javadog.net/blog/ocr-java/40e3b914e6ba4c80bfaa7752fd2be9be.png)

- 8.Messages
无脑默认【点击】下一步

![](https://img.javadog.net/blog/ocr-java/81218dee14e94783ab68fded6e827750.png)

- 9.Compile executable

这一步将会自动生成exe可执行文件

![](https://img.javadog.net/blog/ocr-java/c252ae9d0f46472d8f63258511bc16a5.png)

##### 5. 查看打包结果

![](https://img.javadog.net/blog/ocr-java/19e39de2d4f4408da9b9c30ae6e7b094.png)

## 总结
本文通过Java+百度ocr，实现图片识别文字小工具。从**Java Swing页面基础布局，百度ocr配置，将java项目打包成jar，exe4j将jar打包exe**四个方面入手，实现功能的同时，也熟悉了其他工具的使用，学以致用特来分享一下。

### 🍈猜你想问
####  如何与狗哥联系进行探讨
##### 关注公众号【JavaDog程序狗】
公众号回复【入群】或者【加入】，便可成为【程序员学习交流摸鱼群】的一员，问题随便问，牛逼随便吹。

![](https://img.javadog.net/blog/ocr-java/e55c65b223664e6dbed5961ecea0d270.png)

**此群优势：**
1. 技术交流随时沟通
2. 任何私活资源免费分享
3. 实时科技动态抢先知晓
4. CSDN资源免费下载
5. 本人一切源码均群内开源，可免费使用
##### 2.踩踩狗哥博客
[javadog.net](https://www.javadog.net/)
>大家可以在里面留言，随意发挥，有问必答

![](https://img.javadog.net/blog/ocr-java/b98f327f0a078f13b2b80f064914d622.png)

******
###  🍯猜你喜欢
####  文章推荐
[【苹果】SpringBoot监听Iphone15邮件提醒，Selenium+Python自动化抢购脚本](https://mp.weixin.qq.com/s/JR1ZLhYTXw5C2Tr1BY86hg)

[【项目实战】SpringBoot+uniapp+uview2打造H5+小程序+APP入门学习的聊天小项目](https://mp.weixin.qq.com/s/g7AZOWLgW5vcCahyJDEPKA)

[【项目实战】SpringBoot+uniapp+uview2打造一个企业黑红名单吐槽小程序](https://mp.weixin.qq.com/s/t_qwF_HvkdW-6TI3sYUHrA)

[【模块分层】还不会SpringBoot项目模块分层？来这手把手教你！](https://mp.weixin.qq.com/s/fpkiNR2tj832a6VxZozwDg)

[【ChatGPT】手摸手，带你玩转ChatGPT](https://mp.weixin.qq.com/s/9wEelbTN6kaChkCQHmgJMQ)

[【ChatGPT】SpringBoot+uniapp+uview2对接OpenAI，带你开发玩转ChatGPT](https://mp.weixin.qq.com/s/b19J36Eo3-ba7bHbWzoZYQ)
******
 
 ![](https://img.javadog.net/blog/ocr-java/e74f3636c05a430eab8819333fa004eb.jpg)
