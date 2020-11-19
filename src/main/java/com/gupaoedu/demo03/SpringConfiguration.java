package com.gupaoedu.demo03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan("com.gupaoedu.demo03")
@Configuration //相当于applicationContext.xml文件
public class SpringConfiguration {

	@Bean
	public Demo04Service demo04Service(@Autowired Demo03Service demo03Service){
		Demo04Service demo04Service = new Demo04Service();
		demo04Service.setDemo03Service(demo03Service);
		return demo04Service;
	}

//	@Bean //相当于<bean />
//	public Demo03Service demo03Service(){
//		return new Demo03Service();
//	}
}
