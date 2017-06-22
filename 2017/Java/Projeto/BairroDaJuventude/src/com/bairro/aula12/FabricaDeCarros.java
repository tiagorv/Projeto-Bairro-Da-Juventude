package com.bairro.aula12;

public class FabricaDeCarros {
	
	public static void main(String[] args) {
		
		Carro fusca = new Carro("Fusca 67", 8000);
		Carro brasilia = new Carro("Brasilia Amarela", 15000);
		
		fusca.pagarImposto();
		brasilia.pagarImposto();
		brasilia.pagarImposto();
		
		fusca.mostrarDados();
		brasilia.mostrarDados();
		
	}

}
