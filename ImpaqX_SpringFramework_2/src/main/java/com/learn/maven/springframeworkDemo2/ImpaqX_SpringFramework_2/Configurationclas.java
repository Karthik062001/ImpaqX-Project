package com.learn.maven.springframeworkDemo2.ImpaqX_SpringFramework_2;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Configurationclas {

	@Bean
	public Payment  getupi()
	{
		return new Payment();
	}
	@Bean
	@Qualifier("Paytm")
	public Paytm getPytm()
	{
		return new Paytm();
	}
	@Bean
	public GooglePay getPaytm()
	{
		return new GooglePay();
	}
	
}
