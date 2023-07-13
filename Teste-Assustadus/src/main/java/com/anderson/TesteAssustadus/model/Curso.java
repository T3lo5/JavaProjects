package com.anderson.TesteAssustadus.model;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "curso")
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @Column(name = "duracao")
    private String duracao;

    @ManyToMany(mappedBy = "cursos")
    private List<Aluno> alunos;

    public Curso() {
        alunos = new ArrayList<>();
    }

    public Curso(String nome) {
        this.nome = nome;
        alunos = new ArrayList<>();
    }

    // Getters e Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
        aluno.getCursos().add(this);
    }

    public void removerAluno(Aluno aluno) {
        alunos.remove(aluno);
        aluno.getCursos().remove(this);
    }
}
