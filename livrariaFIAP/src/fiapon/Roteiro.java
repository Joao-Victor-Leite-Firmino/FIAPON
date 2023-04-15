package fiapon;

public class Roteiro {
	
	String disciplina;
	String aula;
	String conteudo;
	

	public Roteiro(String disciplina, String nomeDaAula, String conteudoAula) {
		this.disciplina = disciplina;
		this.aula = nomeDaAula;
		this.conteudo = conteudoAula;
		
	}


	public void exibir() {
		System.out.println("Disciplina: " + disciplina + "\n"
				+ "Aula: " + aula + "\n" + 
				"Conteudo: " + conteudo);
		
		
	}
	

}
