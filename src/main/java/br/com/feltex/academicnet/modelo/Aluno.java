package br.com.feltex.academicnet.modelo;

import java.time.Instant;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Aluno {

	private Long matricula;
	private String nome;
	private String telefone;
	private String email;
	private Instant dataCadastro;
}
