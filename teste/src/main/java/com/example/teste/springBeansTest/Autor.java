package com.example.teste.springBeansTest;

public class Autor implements AutorLivro {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void exibirAutor(){
        System.out.println(this.name);
    }
}
