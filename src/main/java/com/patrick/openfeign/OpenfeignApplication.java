package com.patrick.openfeign;

import com.patrick.openfeign.client.ViaCepClient;
import com.patrick.openfeign.model.Endereco;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableFeignClients
public class OpenfeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(OpenfeignApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(ViaCepClient viaCepClient) {
		return args -> {
			Endereco endereco = viaCepClient.obterEnderecoPorCep("41750200");
			System.out.println(endereco);
		};
	}
}
