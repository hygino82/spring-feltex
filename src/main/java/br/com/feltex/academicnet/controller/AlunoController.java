package br.com.feltex.academicnet.controller;

import java.time.Instant;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.feltex.academicnet.modelo.Aluno;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

	@GetMapping
	public Aluno getInfo() {
		Aluno aluno = new Aluno(1L, "José da Silva", "3333-4444", "jose@feltex.com.br", Instant.now());
		return aluno;
	}

}