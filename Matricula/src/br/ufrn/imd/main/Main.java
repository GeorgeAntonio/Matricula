package br.ufrn.imd.main;

import java.util.Calendar;
import java.util.Scanner;

import br.ufrn.imd.domino.Aluno;
import br.ufrn.imd.domino.Curso;
import br.ufrn.imd.domino.Disciplina;

public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Olá, informe os dados do aluno:");
		Aluno aluno = new Aluno();
		System.out.println("Informe o nome do aluno:");
		aluno.setNome(sc.nextLine());
		System.out.println("Informe a matricula do aluno:");
		aluno.setMatricula(sc.nextLine());
		
		Calendar dataNascimento = Calendar.getInstance();
		dataNascimento.set(Calendar.DATE, 19);
		dataNascimento.set(Calendar.MONTH, 06);
		dataNascimento.set(Calendar.YEAR, 1988);
		aluno.setDataNascimento(dataNascimento.getTime());
		
		Curso bti = new Curso();
		System.out.println("Informe a descrição do curso:");
		bti.setDescricao(sc.nextLine());
		
		aluno.setCurso(bti);
		
		Disciplina imd0040 = new Disciplina();
		imd0040.setId(1);
		imd0040.setCurso(bti);
		imd0040.setDescricao("Linguagens de programação II");
		
		aluno.solicitarMatricula(imd0040);
		aluno.setIra(9.6);
		
		Disciplina imd0404 = new Disciplina();
		imd0404.setId(2);
		imd0404.setCurso(bti);
		imd0404.setDescricao("Web I");
		
		aluno.solicitarMatricula(imd0404);
		
		System.out.println(aluno);
		
		
		for (Disciplina d : aluno.listarDisciplinas()) {
			System.out.println(d);
		}
		
		Disciplina imd0404c = new Disciplina();
		imd0404c.setId(2);
		imd0404c.setCurso(bti);
		imd0404c.setDescricao("Web I");
		
		aluno.trancarMatricula(imd0404c);
	
		for (Disciplina d : aluno.listarDisciplinas()) {
			System.out.println(d);
		}
		//inserção interativa desses itens 
		//regras de negócio - implementação dos métodos de solicitar matrícula
		sc.close();
	}
}