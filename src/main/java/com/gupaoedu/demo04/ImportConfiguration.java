package com.gupaoedu.demo04;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ImportConfiguration {

//	@Scope //改变bean的生命周期
	@Bean
	public ImportService importService(){
		return new ImportService();
	}
}
