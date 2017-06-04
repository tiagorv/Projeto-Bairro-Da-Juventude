package com.bairro.aula6;

public class Calculadora {

	public void soma(int valor1, int valor2){
		int resultado = valor1 + valor2;
		System.out.println("Soma: " + resultado);
	}
	
	public void subtracao(int valor1, int valor2){
		int resultado = valor1 - valor2;
		System.out.println("Subtração: " + resultado);		
	}
	
	public void multiplicacao(int valor1, int valor2){
		int resultado = valor1 * valor2;
		System.out.println("Multiplicação: " + resultado);		
	}	
	
	public void divisao(int valor1, int valor2){
		int resultado = valor1 / valor2;
		System.out.println("Divisão: " + resultado);		
	}	
}
