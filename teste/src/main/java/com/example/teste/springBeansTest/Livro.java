package com.example.teste.springBeansTest;

public class Livro {

    private String name;
    private String code;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void exibir(){
        System.out.println(this.name + " - " + this.code);
    }
}
