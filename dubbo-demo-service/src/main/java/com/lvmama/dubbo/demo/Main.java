package com.lvmama.dubbo.demo;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.alibaba.dubbo.config.ServiceConfig;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
       /* ServiceConfig<DubboDemoService> serviceConfig = new ServiceConfig<DubboDemoService>();
        serviceConfig.setApplication(new ApplicationConfig("dubbo-demo-service"));
        serviceConfig.setRegistry(new RegistryConfig("zookeeper://47.98.108.55:2181"));
        serviceConfig.setInterface(DubboDemoService.class);
        serviceConfig.setRef(new DubboDemoServiceImpl());
        serviceConfig.export();
        System.in.read();*/


        System.out.println("=======================");
        System.out.println("        Core包启动          ");
        System.out.println("=======================");

        getLocalip();
        // 初始化spring
        System.out.println("开始初始化core服务");
        BeanFactoryUtil.init();

        try{
            System.in.read();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private static void getLocalip() {
        try {
            System.out.println("服务暴露的ip: "
                    + java.net.InetAddress.getLocalHost().getHostAddress());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
