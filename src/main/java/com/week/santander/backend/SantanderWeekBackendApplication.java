package com.week.santander.backend;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SantanderWeekBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(SantanderWeekBackendApplication.class, args);
	}
	
	@Bean
	public OpenAPI customOpenAPI(
		@Value("${application.description}") String description,
		@Value("${application.version}") String version
	){
		return new OpenAPI().info(new Info()
			.title(description)
			.version(version)
			.termsOfService("http://swagger.io/terms")
			.license(new License()
				.name("Apache 2.0")
				.url("http://springdoc.org")
			)
		);
	}
}
