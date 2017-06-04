package com.bairro.aula3;

public class TestaUnarios {
	public static void main(String[] args) {
		
		int contador = 0;
		
		System.out.println("LINHA DO COMANDO: " + contador++);
		System.out.println("LINHA POSTERIOR: " + contador);
		
		contador = 0;
		System.out.println("LINHA 2 DO COMANDO: " + ++contador);
		System.out.println("LINHA 2 POSTERIOR: " + contador);
		
		contador = 10;
		System.out.println("LINHA 3 DO COMANDO: " + contador--);
		System.out.println("LINHA 3 POSTERIOR: " + contador);
		
		contador = 10;
		System.out.println("LINHA 4 DO COMANDO: " + --contador);
		System.out.println("LINHA 4 POSTERIOR: " + contador);		
	}
}
