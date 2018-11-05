package com.lvmama.dubbo.demo;


public class DubboDemoServiceImpl implements DubboDemoService {
    public String sayHello(String name) {
        return "Hello" + name;
    }
}
