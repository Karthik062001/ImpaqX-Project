package com.example.SpringBoot_Secuity2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class UserConfiguration {

	@Bean
	public UserDetailsService userDetailService()
	{
		var user=new InMemoryUserDetailsManager();
		
		var user1=User.withUsername("Akash").password("1234").authorities("user").build();
		user.createUser(user1);
		
		return user;
	}
	
	@Bean
	public  PasswordEncoder encoder()
	{
		return NoOpPasswordEncoder.getInstance();
	}
}
