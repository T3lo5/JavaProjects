package com.anderson.TesteAssustadus.repository;
import com.anderson.TesteAssustadus.model.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Long> {

}
