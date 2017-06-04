package com.bairro.aula3;

public class MinhaCalculadora {
	public static void main(String[] args) {
		double valor1 = 10;
		double resultado, valor2 = 2;
		char operador = '%';
		
		switch (operador) {
			case '+':
				resultado = valor1 + valor2;
				break;
			case '-':
				resultado = valor1 - valor2;
				break;
			case '*':
				resultado = valor1 * valor2;
				break;
			case '/':
				resultado = valor1 / valor2;
				break;
			default:
				resultado = valor1 % valor2;
				break;
		}
		System.out.println("Resultado: " + resultado);
	}
}
