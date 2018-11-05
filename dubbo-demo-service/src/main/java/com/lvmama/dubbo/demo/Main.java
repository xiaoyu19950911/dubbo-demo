package com.lvmama.dubbo.demo;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.alibaba.dubbo.config.ServiceConfig;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        ServiceConfig<DubboDemoService> serviceConfig = new ServiceConfig<DubboDemoService>();
        serviceConfig.setApplication(new ApplicationConfig("dubbo-demo-service"));
        serviceConfig.setRegistry(new RegistryConfig("zookeeper://47.98.108.55:2181"));
        serviceConfig.setInterface(DubboDemoService.class);
        serviceConfig.setRef(new DubboDemoServiceImpl());
        serviceConfig.export();
        System.in.read();

    }
}
