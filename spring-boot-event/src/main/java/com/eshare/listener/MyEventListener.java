package com.eshare.listener;

import com.eshare.event.MyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Configuration;

/**
 * 事件监听器
 * Created by liangyh on 2018/7/31.
 * Email:10856214@163.com
 */
@Configuration
public class MyEventListener implements ApplicationListener<MyEvent> {
    @Override
    public void onApplicationEvent(MyEvent event) {
        System.out.println("MyEvent:"+event.getSource());
    }
}
