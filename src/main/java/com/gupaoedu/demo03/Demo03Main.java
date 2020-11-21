package com.gupaoedu.demo03;

import com.gupaoedu.demo04.ImportConfiguration;
import com.gupaoedu.demo04.ImportService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo03Main {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class, ImportConfiguration.class);
		System.out.println(context.getBean(Demo03Service.class));
		System.out.println(context.getBean(Demo04Service.class).getDemo03Service());
		System.out.println(context.getBean(Demo04Service.class));
		System.out.println(context.getBean(ImportService.class));
	}
}
