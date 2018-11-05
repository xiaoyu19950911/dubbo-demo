package com.lvmama.dubbo.demo;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ReferenceConfig;
import com.alibaba.dubbo.config.RegistryConfig;

public class Main {
    public static void main(String[] args) {
        ReferenceConfig<DubboDemoService> referenceConfig = new ReferenceConfig<DubboDemoService>();
        referenceConfig.setApplication(new ApplicationConfig("dubbo-demo-client"));
        referenceConfig.setRegistry(new RegistryConfig("zookeeper://47.98.108.55:2181"));
        referenceConfig.setInterface(DubboDemoService.class);
        DubboDemoService dubboDemoService =null;
        try{
            dubboDemoService = referenceConfig.get();
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(dubboDemoService.sayHello("world"));
    }
}
