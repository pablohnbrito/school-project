package com.school.vivi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class ViviApplication {

	public static void main(String[] args) {
		SpringApplication.run(ViviApplication.class, args);
	}

	@GetMapping("/")
	public String index() {return "Hello!";}

	@GetMapping("/aluno")
	public String alunoGet() {return "busca aluno";}

	@PostMapping("/cria-alunos")
	public String alunoPost() {return "cria alunos";}

	@PutMapping("/atualiza-aluno")
	public String alunoPut() {return "atualiza aluno";}

	@DeleteMapping("/deleta-aluno")
	public String alunoDelete() {return "deleta aluno";}

	@GetMapping("/professor")
	public String prof() {return "busca professor";}

	@PostMapping("/cria-professor")
	public String criaProf() {return "cria prof";}

	@PutMapping("/atualiza-professor")
	public String atualizaProf() {return "atualiza prof";}

	@DeleteMapping("/deleta-professor")
	public String deletaProf() {return "deleta prof";}

	@GetMapping("/turma")
	public String turma() {return "turma";}

	@PostMapping("/cria-turma")
	public String criaTurma() {return "cria turma";}

	@PutMapping("/atualiza-turma")
	public String atualizaTurma() {return "atualiza turma";}

	@DeleteMapping("/deleta-turma")
	public String deletaTurmaTurma() {return "deleta turma";}

	@GetMapping("/curso")
	public String curso() {return "busca curso";}

	@PostMapping("/cria-curso")
	public String criaCurso() {return "cria curso";}

	@PutMapping("/atualiza-curso")
	public String atualizaCurso() {return "atualiza curso";}

	@DeleteMapping("/deleta-curso")
	public String deletaCurso() {return "deleta curso";}

	@GetMapping("/lead")
	public String lead() {return "busca lead";}

	@PostMapping("/cria-lead")
	public String criaLead() {return "cria lead";}

	@PutMapping("/atualiza-lead")
	public String atualizaLead() {return "atualiza lead";}

	@DeleteMapping("/deleta-lead")
	public String deletaLead() {return "deleta lead";}

	@GetMapping("/feriado")
	public String feriado() {return "busca feriado";}

	@PostMapping("/cria-feriado")
	public String criaFerrado() {return "cria feriado";}

	@GetMapping("/dia-aula")
	public String diaaula() {return "dia-aula";}

	@PostMapping("/cria-dia-aula")
	public String criaDiaaula() {return "cria dia de aula";}

	@PutMapping("/atualiza-dia-aula")
	public String atualizaDiaaula() {return "atualiza dia de aula";}

	@GetMapping("/login")
	public String login() {return "login";}

}