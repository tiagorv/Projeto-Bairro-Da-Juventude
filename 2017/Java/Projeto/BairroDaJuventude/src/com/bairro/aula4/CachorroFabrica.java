package com.bairro.aula4;

public class CachorroFabrica {
	
	public static void main(String[] args) {
		Cachorro toto = new Cachorro();
		
		toto.nome = "Totó da Silva";
		toto.raca = "Tomba";
		
		toto.mostraDadosCachorro();
		toto.brincar();
		toto.mostraDadosCachorro();
		toto.correr();
		toto.mostraDadosCachorro();
		toto.andar();
		toto.mostraDadosCachorro();
		toto.comer();
		toto.mostraDadosCachorro();
		toto.beber();
		toto.mostraDadosCachorro();
		toto.dormir();
		toto.mostraDadosCachorro();
	}
}
