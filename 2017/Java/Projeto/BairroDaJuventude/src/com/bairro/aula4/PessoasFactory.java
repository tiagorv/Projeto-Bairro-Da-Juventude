package com.bairro.aula4;

public class PessoasFactory {

	public static void main(String[] args) {
		Pessoa tiago = new Pessoa();
		tiago.nome = "Tiago da Rosa Valério";
		tiago.idade = 36;
		
		Pessoa daniel = new Pessoa();
		daniel.nome = "Daniel Patrocínio";
		daniel.idade = 32;
		
		Pessoa renato = new Pessoa();
		renato.nome = "Renato Darolt";
		renato.idade = 33;
		
		Pessoa natan = new Pessoa();
		natan.nome = "Natan Ramos";
		natan.idade = 30;
		
		tiago.andar();
		daniel.andar();
		renato.andar();
		natan.andar();
	}
}
