package com.formation.demo.config;

import javax.sql.DataSource;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PersistenceConfiguration {

	@Bean
	public DataSource dataSource() {
		DataSourceBuilder builder = DataSourceBuilder.create();
		builder.url("jdbc:postgresql://localhost:5432/formation-springboot");
		builder.username("postgres");
		builder.password("admin");
		System.out.println("Custom datasource bean has been initialized and set !");
		return builder.build();
	}
	
}
