package com.atgugui.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MainApp84 {
    public  static void main(String[] args){
        SpringApplication.run(MainApp84.class,args);
    }
}
