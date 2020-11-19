package com.gupaoedu.demo03;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration //相当于applicationContext.xml文件
public class SpringConfiguration {

	@Bean //相当于<bean />
	public Demo03Service demo03Service(){
		return new Demo03Service();
	}
}
