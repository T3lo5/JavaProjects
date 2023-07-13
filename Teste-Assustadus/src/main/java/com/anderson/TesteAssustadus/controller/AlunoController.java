package com.anderson.TesteAssustadus.controller;

import com.anderson.TesteAssustadus.exception.ResourceAlreadyExistsException;
import com.anderson.TesteAssustadus.model.Aluno;
import com.anderson.TesteAssustadus.repository.AlunoRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    private final AlunoRepository alunoRepository;

    public AlunoController(AlunoRepository alunoRepository) {
        this.alunoRepository = alunoRepository;
    }

    @GetMapping
    public List<Aluno> getAllAlunos() {
        List<Aluno> alunos = alunoRepository.findAll();

        // Remova a lista de cursos dos alunos para evitar a serialização recursiva
        alunos.forEach(aluno -> aluno.setCursos(null));

        return alunos;
    }


    @PostMapping
    public ResponseEntity<Aluno> createAluno(@RequestBody Aluno aluno) {
        if (alunoRepository.existsByCpf(aluno.getCpf())) {
            throw new ResourceAlreadyExistsException("Já existe um aluno cadastrado com o CPF: " + aluno.getCpf());
        }

        Aluno novoAluno = alunoRepository.save(aluno);
        return ResponseEntity.status(HttpStatus.CREATED).body(novoAluno);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Aluno> getAlunoById(@PathVariable Long id) {
        Optional<Aluno> aluno = alunoRepository.findById(id);
        return aluno.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Aluno> updateAluno(@PathVariable Long id, @RequestBody Aluno alunoDetails) {
        Optional<Aluno> alunoOptional = alunoRepository.findById(id);
        if (alunoOptional.isPresent()) {
            Aluno alunoAtualizado = alunoOptional.get();
            alunoAtualizado.setNome(alunoDetails.getNome());
            alunoRepository.save(alunoAtualizado);
            return ResponseEntity.ok(alunoAtualizado);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAluno(@PathVariable Long id) {
        Optional<Aluno> aluno = alunoRepository.findById(id);
        if (aluno.isPresent()) {
            alunoRepository.delete(aluno.get());
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}

