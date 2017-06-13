package com.bairro.aula10;

public class LigaDaJustica {
	public static void main(String[] args) {
		
		SuperHeroi[] ligaDaJustica = new SuperHeroi[3];
		
		SuperHeroi batman = new SuperHeroi();
		batman.nome = "Batman";
		batman.valorAtaque = 10;
		batman.valorDefesa = 6;
		
		SuperHeroi mulherMaravilha = new SuperHeroi();
		mulherMaravilha.nome = "Mulher Maravilha";
	    mulherMaravilha.valorAtaque = 12;
	    mulherMaravilha.valorDefesa = 8;
	    
	    SuperHeroi superHomem = new SuperHeroi();
	    superHomem.nome = "Super Homem";
	    superHomem.valorAtaque = 30;
	    superHomem.valorDefesa = 1;
		
		ligaDaJustica[0] = batman;
		ligaDaJustica[1] = mulherMaravilha;
		ligaDaJustica[2] = superHomem;
		
		
		for (SuperHeroi heroiGenerico : ligaDaJustica){
			heroiGenerico.ataque();
			heroiGenerico.defesa();
			heroiGenerico.mostrarDadosHeroi();
		}
	}
}
