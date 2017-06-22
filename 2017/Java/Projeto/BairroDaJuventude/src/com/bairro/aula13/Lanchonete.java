package com.bairro.aula13;

public class Lanchonete {
	
	public static void main(String[] args) {
		Cardapio.mistoQuente();
		Cardapio.XBurguer();
		
		System.out.println("R$: " + Cardapio.valorConta(5));
	}

}
