package com.masai;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.masai")
@PropertySource("a1.properties")
public class AppConfig {
	
	@Bean
	public B getB() {
		B b =new B();
		return b;
	}
	
	@Bean("clist")
	public List<String> getCities(){
	List<String> cities = new ArrayList<String>();
	cities.add("delhi");
	cities.add("chennai");
	cities.add("mumbai");
	cities.add("kolkata");
	return cities;
	}


}
