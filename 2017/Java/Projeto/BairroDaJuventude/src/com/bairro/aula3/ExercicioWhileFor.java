package com.bairro.aula3;

public class ExercicioWhileFor {
	public static void main(String[] args) {
		int contador = 0;
		int restoDivisao = 0;
		
		while (contador <= 200) {
			
			restoDivisao = contador % 2;
			if (restoDivisao == 0){
				System.out.println("While Par: " + contador);
			}
			contador = contador + 1;
		}
		
		for (contador = 0; contador <= 200; contador++) {
			restoDivisao = contador % 2;			
			if (restoDivisao != 0){
				System.out.println("For Impar: " + contador);
			}			
		}
	}
}
