package com.gupaoedu.demo06;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Task02Main {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(TaskConfiguration.class);
	}
}
