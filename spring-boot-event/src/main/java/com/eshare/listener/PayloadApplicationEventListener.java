package com.eshare.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.context.PayloadApplicationEvent;
import org.springframework.context.annotation.Configuration;

/**
 * Payload事件监听器
 * Created by liangyh on 2018/7/31.
 * Email:10856214@163.com
 */
@Configuration
public class PayloadApplicationEventListener implements ApplicationListener<PayloadApplicationEvent> {
    @Override
    public void onApplicationEvent(PayloadApplicationEvent event) {
        System.out.println("Payload:"+event.getPayload());
    }
}
