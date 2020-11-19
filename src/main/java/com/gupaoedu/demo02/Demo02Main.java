package com.gupaoedu.demo02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Demo02Main {
	public static void main(String[] args) {
		ApplicationContext context = new FileSystemXmlApplicationContext("classpath:applicationContext.xml");
		System.out.println(context.getBean(Demo02Service.class));
	}
}
