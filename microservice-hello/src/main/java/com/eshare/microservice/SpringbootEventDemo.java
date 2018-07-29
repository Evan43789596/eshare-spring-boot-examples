package com.eshare.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.event.ApplicationEventMulticaster;
import org.springframework.context.event.SimpleApplicationEventMulticaster;

/**
 * Created by liangyh on 2018/7/30.
 * Email:10856214@163.com
 */
@SpringBootApplication
public class SpringbootEventDemo {


    public static void main(String[] args){
        ApplicationEventMulticaster applicationEventMulticaster = new SimpleApplicationEventMulticaster();
        applicationEventMulticaster.multicastEvent();


        SpringApplication.run(SpringbootEventDemo.class);
    }
}
