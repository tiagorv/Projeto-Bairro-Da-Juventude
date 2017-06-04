package com.bairro.aula2;

public class TestaOperadorAritmetico {

	public static void main(String[] args) {
		
		int valor1 = 10;
		int valor2 = 2;
		
		int soma = valor1 + valor2;
		int subtracao = valor1 - valor2;
		int multiplicacao = valor1 * valor2;
		int divisao = valor1 / valor2;
		int resto = valor1 % valor2;
		
		System.out.println("Soma: " + soma);
		System.out.println("Subtração: " + subtracao);
		System.out.println("Multiplicação: " + multiplicacao);
		System.out.println("Divisão: " + divisao);
		System.out.println("Resto: " + resto);
	}
}
