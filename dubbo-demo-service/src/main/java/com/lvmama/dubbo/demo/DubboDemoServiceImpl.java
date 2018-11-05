package com.lvmama.dubbo.demo;


import org.springframework.stereotype.Service;

@Service("dubboDemoService")
public class DubboDemoServiceImpl implements DubboDemoService {
    public String sayHello(String name) {
        return "Hello " + name;
    }
}
