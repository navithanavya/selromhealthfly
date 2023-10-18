package com.example.demo.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import ch.qos.logback.core.encoder.Encoder;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfig {
	@Bean
	  public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	
		@Bean
		SecurityFilterChain securityFilterChain(HttpSecurity http)throws Exception{
			http.csrf(csrf->csrf.disable())
			.authorizeHttpRequests(auth->auth.requestMatchers("/api/**").authenticated())
			.authorizeHttpRequests(auth->auth.requestMatchers("/auth/**").permitAll())              
			.httpBasic(Customizer.withDefaults());
			
			return http.build();
		}
		
		
       @Bean
       public UserDetailsService userDetailsService() {
	   UserDetails name=User.builder()
			.username("ADMIN")
			.password(passwordEncoder().encode("ADMIN"))
//			.roles("ADMIN")
			.roles("ADMIN","USER")

			.build();
	   
	   UserDetails user=User.builder()
			   .username("SELROM")
			   .password(passwordEncoder().encode("SELROM"))
			   .roles("USER")
			   .build();
	   
	   return new InMemoryUserDetailsManager(name,user);
	
	
	
	
	
		
		
}}
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	


