package com.fibonacci;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


@SuppressWarnings("unused")
@SpringBootApplication
@EnableWebMvc
public class FiboApplication {

	public static void main(String[] args) {
		SpringApplication.run(FiboApplication.class, args);
	}
	
	@Bean
    public CommandLineRunner run(ApplicationContext appContext) {
        return args -> {
 
            String[] beans = appContext.getBeanDefinitionNames();
            Arrays.stream(beans).sorted().forEach(System.out::println);
        };
    }

}
