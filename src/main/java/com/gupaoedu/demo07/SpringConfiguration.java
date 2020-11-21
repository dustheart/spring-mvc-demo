package com.gupaoedu.demo07;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfiguration {

	/**
	 * 在某个环境下不装载
	 * 或者不满足某个条件的时候，不装载
	 * 或者如果已经装载过了，就不重复装载
	 * ...
	 */
	@Conditional(GpCondition.class)
	@Bean
	public DemoService demoService(){
		return new DemoService();
	}
}
