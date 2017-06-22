package com.bairro.aula13;

public class Cardapio {
	
	public static void mistoQuente(){
		System.out.println("Pedido: Misto Quente");
		System.out.println("2 fatias de pão");
		System.out.println("1 fatia de presunto");
		System.out.println("1 fatia de queijo");
	}
	
	public static void XBurguer(){
		System.out.println("Pedido: X-Burguer");
		System.out.println("1 pão");
		System.out.println("1 fatia de presunto");
		System.out.println("1 fatia de queijo");
		System.out.println("1 hamburguer");
	}
	
	public static double valorConta(int qtdeLanches){
		double valorLanche = 2.50;
		double valorConta = valorLanche * qtdeLanches;
		return valorConta;
	}
}
