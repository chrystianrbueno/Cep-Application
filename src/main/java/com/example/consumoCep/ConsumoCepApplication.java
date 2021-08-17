package com.example.consumoCep;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.example.consumoCep.model.CepModel;

@SpringBootApplication
public class ConsumoCepApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumoCepApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
		return args -> {
			CepModel cep = restTemplate.getForObject("https://viacep.com.br/ws/92031030/json/", CepModel.class);
			System.out.println(cep.toString());
		};
	}

}