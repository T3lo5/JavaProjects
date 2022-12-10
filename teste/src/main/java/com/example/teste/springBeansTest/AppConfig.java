package com.example.teste.springBeansTest;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;

@Configuration
public class AppConfig {

    @Bean
    public Livro getLivro() {
        return new Livro();
    }
}
