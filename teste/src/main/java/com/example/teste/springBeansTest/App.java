package com.example.teste.springBeansTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App {

    public static void main(String[] args){

        ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);

        Livro livro = factory.getBean(Livro.class);
        livro.setName("Spring Framework");
        livro.setCode("123456");
        livro.exibir();

        Autor autor = factory.getBean(Autor.class);
        autor.setName("Rodrigo");
        autor.exibirAutor();

    }
}
