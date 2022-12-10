package com.example.teste.springBeansTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.AplicationContext;

public class App {

    public static void main(String[] args){

        ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);

        Livro livro = factory.getBean(Livro.class);
        Livro.setName("Spring Framework");
        Livro.setCode("123456");
        livro.exibir();
    }
}
