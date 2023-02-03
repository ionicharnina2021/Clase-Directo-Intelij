package com.adorno.pruebaclaseharnina2301;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class PropiaConfiguration {
	
	@Bean
	@Scope("prototype")
	public Cosa getCosa() {
		return new Cosa();
	}

}
