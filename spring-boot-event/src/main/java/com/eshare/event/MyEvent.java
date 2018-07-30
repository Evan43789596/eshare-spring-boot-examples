package com.eshare.event;

import org.springframework.context.ApplicationEvent;

/**
 * Created by liangyh on 2018/7/31.
 * Email:10856214@163.com
 */
public class MyEvent extends ApplicationEvent {
    /**
     * Create a new ApplicationEvent.
     *
     * @param source the object on which the event initially occurred (never {@code null})
     */
    public MyEvent(Object source) {
        super(source);
    }
}
