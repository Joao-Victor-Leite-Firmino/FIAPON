package fiapon;

import java.util.Scanner;

public class fiaponline {
	
	public static void main(String[] args) {
	Scanner leitor = new Scanner(System.in);
	System.out.println("Bem vindo Professor! Por favor, digite seu nome: ");
	String nomeProfessor = leitor.nextLine();
	
	Professor umProfessor = new Professor(nomeProfessor);
	
	System.out.println("Ol� " + umProfessor.exibir() +  " ! ");
	
	int resposta = 1;
	while(resposta == 1){
		System.out.println("Digite a disciplina a ser ministrada: ");
		String disciplina = leitor.nextLine();
	
		System.out.println("Informe tamb�m o nome da aula: ");
		String nomeDaAula = leitor.nextLine();
	
		System.out.println("Por �ltimo, informe o conte�do da aula: ");
		String conteudoAula = leitor.nextLine();
		
		Roteiro umRoteiro = new Roteiro(disciplina, nomeDaAula, conteudoAula);
		umProfessor.adicionar(umRoteiro);
		
		
		System.out.println("Roteiro cadastrado " + umProfessor.exibir() + "." + " Deseja cadastrar mais um roteiro? 1 - Sim  2 - N�o" );
		resposta = leitor.nextInt();
	
		
		
		
	}
	
	umProfessor.exibirRoteiros();
	
	leitor.close();
		
	}

}
