
# springcloud

![image-20210216110252139](E:\studyspace\java\springcloud\README.assets\image-20210216110252139.png)

### 2019版本

1、建module

2、改pom

3、些YAML

4、主启动

5、业务类

​    1、建表sql

​    2、entities

​    3、dao

​    4、service

​    5、controller

6、测试



自动部署配置

![image-20210216121027383](E:\studyspace\java\springcloud\README.assets\image-20210216121027383.png)





### Consul

 http://consul.io

http://springcloud.cc/spring-cloud-consul.html

官网安装说明：

https://learn.hashicorp.com/consul/getting-started/install.html

consul是一套开源的分布式服务发现和配置管理系统，由HashiCorp公司用go语言开发

提供了微服务系统中的服务治理、配置中心、控制总线等功能。这些功能中的每一个都可以根据需要单独使用，也可以一起使用以构建全方位的服务网格，总指Consul提供了一种完整的服务网格解决方案

它拒用很多有i但。包括：基于raft协议，比较简洁；支持健康检查，同时支持Http和DNS协议，支持跨数据中心的WAN集群，提供图形界面跨平台，支持Linux、Mac、Windows

consul --version

consul agent -dev

localhost:8500



### 三个注册中心的异同点

![image-20210305185327206](E:\studyspace\java\springcloud\README.assets\image-20210305185327206.png)