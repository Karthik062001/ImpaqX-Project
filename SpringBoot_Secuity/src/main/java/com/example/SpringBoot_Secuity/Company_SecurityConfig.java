package com.example.SpringBoot_Secuity;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
@EnableMethodSecurity //@EnableGlobalMethodSecurity(prePostEnabled = true)
public class Company_SecurityConfig {

	@Bean
	public UserDetailsService userDetails(PasswordEncoder encoder)
	{
		UserDetails admin = User.withUsername("Karthik").password(encoder.encode("123")).roles("ADMIN").build();
		UserDetails user = User.withUsername("Hemanth").password(encoder.encode("123")).roles("USER").build();
		return new InMemoryUserDetailsManager(admin,user);
		
	}
	
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception
	{

		return http.csrf().disable().authorizeHttpRequests()
				.requestMatchers("/api/company/public").permitAll().anyRequest()
				.authenticated().and().build();
       
	}
	
	@Bean
	public PasswordEncoder encoder()
	{
		return new BCryptPasswordEncoder();
	}
}

