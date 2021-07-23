package com.henrique.bookstore.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.henrique.bookstore.service.DBService;

@Configuration
@Profile("test")
public class TestCongig {
	@Autowired
	private DBService dbService;
	
	@Bean
	public void instaciaBaseDados() {
		this.dbService.InstacinaBaseDeDados();
	}
}
