package com.lvmama.dubbo.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        DubboDemoService dubboDemoService = (DubboDemoService) ctx.getBean("dubboDemoService");
        System.out.println(dubboDemoService.sayHello("xiaoyu"));
    }
}
