package br.com.feltex.academicnet.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.feltex.academicnet.modelo.Aluno;

public interface AlunoRepositorio extends JpaRepository<Aluno, Long> {

}
