package com.anderson.TesteAssustadus.controller;

import com.anderson.TesteAssustadus.exception.ResourceNotFoundException;
import com.anderson.TesteAssustadus.repository.AlunoRepository;
import com.anderson.TesteAssustadus.model.Aluno;
import com.anderson.TesteAssustadus.model.Curso;
import com.anderson.TesteAssustadus.repository.CursoRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/cursos")
class CursoController {

    private final CursoRepository cursoRepository;
    private final AlunoRepository alunoRepository;

    public CursoController(CursoRepository cursoRepository, AlunoRepository alunoRepository) {
        this.cursoRepository = cursoRepository;
        this.alunoRepository = alunoRepository;
    }

    @GetMapping
    public List<Curso> getAllCursos() {
        return cursoRepository.findAll();
    }

    @PostMapping
    public ResponseEntity<Curso> createCurso(@RequestBody Curso curso) {
        if (curso.getDuracao() == null) {
            throw new ResourceNotFoundException("Tempo de duração do curso não fornecido");
        }

        Curso novoCurso = cursoRepository.save(curso);
        return ResponseEntity.status(HttpStatus.CREATED).body(novoCurso);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Curso> getCursoById(@PathVariable Long id) {
        Optional<Curso> curso = cursoRepository.findById(id);
        if (curso.isPresent()) {
            return ResponseEntity.ok(curso.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Curso> updateCurso(@PathVariable Long id, @RequestBody Curso cursoDetails) {
        Optional<Curso> curso = cursoRepository.findById(id);
        if (curso.isPresent()) {
            Curso cursoAtualizado = curso.get();
            cursoAtualizado.setNome(cursoDetails.getNome());
            cursoRepository.save(cursoAtualizado);
            return ResponseEntity.ok(cursoAtualizado);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/{cursoId}/alunos/{alunoId}")
    public ResponseEntity<?> adicionarAlunoAoCurso(@PathVariable Long cursoId, @PathVariable Long alunoId) {
        Curso curso = cursoRepository.findById(cursoId)
                .orElseThrow(() -> new ResourceNotFoundException("Curso não encontrado com o ID: " + cursoId));

        Aluno aluno = alunoRepository.findById(alunoId)
                .orElseThrow(() -> new ResourceNotFoundException("Aluno não encontrado com o ID: " + alunoId));

        curso.adicionarAluno(aluno);
        cursoRepository.save(curso);

        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCurso(@PathVariable Long id) {
        Optional<Curso> curso = cursoRepository.findById(id);
        if (curso.isPresent()) {
            cursoRepository.delete(curso.get());
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
