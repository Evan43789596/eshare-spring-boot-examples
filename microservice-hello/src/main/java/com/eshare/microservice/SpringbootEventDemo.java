package com.eshare.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.PayloadApplicationEvent;
import org.springframework.context.event.ApplicationEventMulticaster;
import org.springframework.context.event.SimpleApplicationEventMulticaster;

/**
 * SpringbootBoot事件demo
 * Created by liangyh on 2018/7/30.
 * Email:10856214@163.com
 */
@SpringBootApplication
public class SpringbootEventDemo {


    public static void main(String[] args){
        ApplicationEventMulticaster applicationEventMulticaster = new SimpleApplicationEventMulticaster();
        //监听事件,默认监听全部事件
        applicationEventMulticaster.addApplicationListener(new ApplicationListener<ApplicationEvent>() {
            @Override
            public void onApplicationEvent(ApplicationEvent event) {
                System.err.println(event);
            }
        });
        //监听事件,只监听PayloadApplicationEvent
        applicationEventMulticaster.addApplicationListener(new ApplicationListener<PayloadApplicationEvent>() {
            @Override
            public void onApplicationEvent(PayloadApplicationEvent event) {
                System.err.println(event.getPayload());
            }
        });

        //发布广播
        applicationEventMulticaster.multicastEvent(new MyEvent("helloworld"));
        applicationEventMulticaster.multicastEvent(new PayloadApplicationEvent<>(1,"helloworld"));

        SpringApplication.run(SpringbootEventDemo.class);
    }
}
class MyEvent extends ApplicationEvent{

    /**
     * Create a new ApplicationEvent.
     *
     * @param source the object on which the event initially occurred (never {@code null})
     */
    public MyEvent(Object source) {
        super(source);
    }
}