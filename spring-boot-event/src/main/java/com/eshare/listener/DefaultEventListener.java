package com.eshare.listener;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Configuration;

/**
 * 默认事件监听器
 * Created by liangyh on 2018/7/31.
 * Email:10856214@163.com
 */
@Configuration
public class DefaultEventListener implements ApplicationListener {
    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        System.out.println("Default:"+event);
    }
}
