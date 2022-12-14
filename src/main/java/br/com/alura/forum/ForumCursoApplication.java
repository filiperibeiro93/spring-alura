package br.com.alura.forum;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.data.web.config.EnableSpringDataWebSupport;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableSpringDataWebSupport
@EnableCaching
@EnableWebSecurity
public class ForumCursoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ForumCursoApplication.class, args);
	}

}
