1.项目说明：使用一个Dept部门模块做一个微服务通用案例Consumer消费者(Client)通过REST调用Provider提供者(Server)提供的服务。

2.准备环境
    工具：idea
    jdk版本：1.8
    
3.springcloud 父工程(Project) 下创建3个子模块(Module) 
  ① springcloud-api 【封装的整体entity/接口/公共配置等】
  ② springcloud-provider-dept-8001 【服务提供者】
  ③ springcloud-consumer-dept-80 【服务消费者】


父工程说明：父工程项目springcloud，切记Packageing是pom模式；主要是定义POM文件，将后续各个子模块公用的jar包等统一提取出来，类似一个抽象父类
