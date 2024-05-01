package com.co.bonilla.curso;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableDiscoveryClient
@SpringBootApplication
@ComponentScan ({"com.co.bonilla.common.usuario.models.entity.*", "com.co.bonilla.curso.models.entity.*"})
@EnableJpaRepositories({"com.co.bonilla.common.usuario.models.entity.*", "com.co.bonilla.curso.models.entity.*"})
@EntityScan({"com.co.bonilla.common.usuario.models.entity.*", "com.co.bonilla.curso.models.entity.*"})
public class MicroservicioSpringCursoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicioSpringCursoApplication.class, args);
	}

}