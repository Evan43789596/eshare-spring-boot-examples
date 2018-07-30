package com.eshare;

import com.eshare.event.MyEvent;
import com.eshare.model.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.PayloadApplicationEvent;

@SpringBootApplication
public class SpringBootEventApplication {

	public static void main(String[] args) {

		ApplicationEventPublisher publisher = SpringApplication.run(SpringBootEventApplication.class, args);
		publisher.publishEvent(new MyEvent("sayHello"));
		publisher.publishEvent(new PayloadApplicationEvent<User>("user",new User("wangba",8)));
	}
}
