package com.gupaoedu.demo03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo03Main {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		System.out.println(context.getBean(Demo03Service.class));
		System.out.println(context.getBean(Demo04Service.class).getDemo03Service());
		System.out.println(context.getBean(Demo04Service.class));
	}
}
