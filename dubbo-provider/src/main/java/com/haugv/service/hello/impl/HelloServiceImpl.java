package com.haugv.service.hello.impl;

import com.haugv.service.HelloService;

public class HelloServiceImpl implements HelloService {
    @Override
    public String hello(String name) {
        return "hello:"+name;
    }
}
