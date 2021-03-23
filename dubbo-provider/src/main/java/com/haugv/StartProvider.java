package com.haugv;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class StartProvider {

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("dubbo-provider.xml");
        ioc.start();
        System.out.println("provider start success...");
        System.in.read();
    }
}
