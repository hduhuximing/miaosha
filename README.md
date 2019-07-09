# SpringBoot-SecondKill

#### 介绍
基于SpringBoot+Mybatis+Mysql+中间件构建的商城秒杀系统；其中，中间件主要包括：缓存中间件Redis、消息中间件RabbitMQ、统一协调调度中心中间件ZooKeeper、综合中间件Redisson等等，详细的技术列表可以参见下方“系统整体架构说明”

#### 系统整体架构说明
（1）技术列表：
![alt text](https://files.gitee.com/group1/M00/08/7C/PaAvDF0kBYCAWZORAACYT2bH4WY459.png?token=e2082cb496a17897d4eb448b3a7f36b1&ts=1562642213&attname=3.png&disposition=inline)

（2）系统整体业务流程：
![alt text](https://files.gitee.com/group1/M00/08/7C/PaAvDF0kBXGAW-SdAAH3nhiBJ5U111.png?token=8d23a9b74a10c3a88a226d6ecae101b6&ts=1562644118&attname=2.png&disposition=inline)

（3）系统实战收益：
![alt text](https://files.gitee.com/group1/M00/08/7C/PaAvDF0kBY6AHtLtAACNSer3qrA910.png?token=238ccd82971b948c87c7eb64b0016287&ts=1562644118&attname=4.png&disposition=inline)


#### 开发软件与工具
IntelliJ IDEA  
DataGrid (或者 Navicat Premium)  
SpringBoot 1.5.7  
JDK1.8  
Mysql5.6  
Tomcat7 (或者 Tomcat8)  
JMeter5.x  
PostMan  
Redis_Windows的简化安装版(Redis-x64-3.2.100)--当然，如果自己有Linux服务器，也可以连接Linux的  
ZooKeeper_Windows的简化安装版(Zookeeper-3.4.6)--当然，如果自己有Linux服务器，也可以连接Linux的  
(注意：Redis_Windows的简化安装版 和 ZooKeeper_Windows的简化安装版(Zookeeper-3.4.6) 的简化版工具可以在**“附件”**中下载)

#### 如何运行整个系统  
1.首先需要在本地开发环境启动Redis、ZooKeeper服务（假设整套系统连接的服务是本地的）:双击Redis、ZooKeeper-Windows简化安装版的bin目录，Redis找寻redis-server.exe，ZooKeeper找寻zkServer.cmd文件，双击即可启动相应的服务     
2.将数据库的DDL，即db_second_kill.sql导入到你本地数据库中（前提是你得先建好数据库db_second_kill）     
3.将项目从码云check出来，并import进IDEA中，调整IDEA的maven仓库指向，最终将所需要的jar包都下载下来！(如果有一些Jar下载不下来，自己检查一下网络原因跟maven仓库原因吧!)    
4.修改application.properties配置文件中相应的配置信息，比如数据库连接信息等等；    
5.将系统运行在Tomcat服务器上，观察控制台的输出信息，如果没有报错，那么运行之后一般会自动跳转至首页！  
6.最后，可以开心的玩耍了！  

#### 博客列表(建议按照顺序来！！)  
1.   
2.   
3.   

#### 联系Debug
对于秒杀的实现，每个人的实现方案可能会有所不同！对于本系统相关的内容，包括**源码、数据库、视频教程、资料、工具**等等有疑问的地方，均可以联系Debug或者加下面的QQ群获取相应的资料！

QQ群：Java实战基地交流1群-605610429   
Debug的微信：debug0868（加微信后，记得叫debug把你拉进微信的技术交流群）  
Debug的技术公众号：  
![alt text](https://files.gitee.com/group1/M00/08/7C/PaAvDF0kCTmAHh9jAACWhfefKaQ486.jpg?token=fd4dbdaed2838d22c6e75693834c634e&ts=1562642746&attname=15cm.jpg&disposition=inline)  


#### 视频教程
为了能更好的快速学习、掌握 **Java秒杀系统** 的构建与实战,Debug特意将该系统的整体实战流程录制成了一套视频教程，一共包含32课时（注意，课程是**收费的**！），感兴趣的小伙伴可以联系Debug，不感兴趣的小伙伴可以直接无视！  
以下为 **Java秒杀系统** 对应的视频教程目录列表：    

第一章：课程整体介绍  
1-1课程整体介绍（https://v.qq.com/x/page/m0893wxfn27.html）  
1-2核心技术列表（https://v.qq.com/x/page/o0893gk7xt9.html ）  
1-3课程要求与收益  
1-4系统的整体演示（https://v.qq.com/x/page/n0893ri19gu.html ）    
  
第二章：微服务项目的搭建  
2-1 SpringBoot搭建多模块项目一  
2-2 SpringBoot搭建多模块项目二  
2-3体验MVC的开发流程  
2-4秒杀系统整体业务流程介绍（https://v.qq.com/x/page/t0893dycllq.html ）  
2-5数据库设计与Mybatis逆向工程  
  
第三章：秒杀业务代码实战  
3-1商品列表展示一  
3-2商品列表展示二  
3-3商品详情展示  
3-4商品秒杀实战  
3-5订单编号的生成方式  
3-6整合前端实现完整的秒杀逻辑  
3-7整合RabbitMQ实现消息异步发送  
3-8邮件服务发送通知信息实战  
3-9整体再次回顾秒杀的全过程  
3-10死信队列失效超时未支付的订单一  
3-11死信队列失效超时未支付的订单二  
3-12定时任务失效超时未支付的订单  
3-13查看订单详情  
3-14 Jmeter高并发压力测试  
3-15问题分析  

第四章：秒杀逻辑优化  
4-1数据库Mysql层面优化抢单逻辑  
4-2基于Redis的分布式锁优化抢单逻辑  
4-3基于Redisson的分布式锁优化抢单逻辑  
4-4基于ZooKeeper的分布式锁优化抢单逻辑  
4-5其他优化点介绍  
4-6整合Shiro实现用户登录一  
4-7整合Shiro实现用户登录二  

第五章：课程总结  
5-1课程总结与建议  

#### 支持Debug  
开源不易，若是可以，打赏一下Debug呗！  




