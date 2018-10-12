package com.btk.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


@Configuration
@EnableWebSecurity

public class MySecurityConfiguration extends WebSecurityConfigurerAdapter {
	
	@Bean
	public BCryptPasswordEncoder Encoder() {
		return new BCryptPasswordEncoder();
	}

	// Règles de l'AUTHENTIFICATION
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth
				// enable in memory based authentication with a user named "user" and "admin"
				.inMemoryAuthentication()
				.withUser("salah").password(Encoder().encode("password")).roles("USER")
				.and()
				.withUser("nizar").password(Encoder().encode("password")).roles("USER")
				.and()
				.withUser("mohamed").password(Encoder().encode("password")).roles("VISITEUR")
				.and()
				.withUser("kamel").password(Encoder().encode("password")).roles("USER", "ADMIN");
	}

	// Règles de l'AUTHORIZATION

	
	//on peut ajouter le formulaire login personalisé dans .formLogin("url")
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
		.antMatchers("/public/**").hasRole("USER")     //.permitAll()
		.antMatchers("/secret/**").hasRole("ADMIN") 
		.and()
				// Possibly more configuration ...
				//.formLogin() // enable form based log in
				// set permitAll for all URLs associated with Form Login
				//.permitAll();
		.httpBasic();
	}

}
