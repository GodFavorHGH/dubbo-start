#dubbo常见问题
##1.xml配置URI文件报错
###解决：偏好设置 =》手动添加URI
##2.Dubbo启动时qos-server can not bind localhost:22222错误解决
###解决：Qos=Quality of Service，qos是Dubbo的在线运维命令，可以对服务进行动态的配置、控制及查询，Dubboo2.5.8新版本重构了telnet（telnet是从Dubbo2.0.5开始支持的）模块，提供了新的telnet命令支持，新版本的telnet端口与dubbo协议的端口是不同的端口，默认为22222，可以通过配置文件dubbo.properties修改。telnet 模块现在同时支持 http 协议和 telnet 协议，方便各种情况的使用。