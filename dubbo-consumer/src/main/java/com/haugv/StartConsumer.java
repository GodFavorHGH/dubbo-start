package com.haugv;

import com.haugv.service.HelloService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class StartConsumer {

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("dubbo-consumer.xml");
        ioc.start();
        System.out.println("provider start success...");
        HelloService helloService = (HelloService) ioc.getBean("helloService");
        System.out.println(helloService.hello("haugv"));
        System.in.read();
    }
}
