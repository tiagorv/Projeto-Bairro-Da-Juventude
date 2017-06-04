package com.bairro.aula3;

public class TestaBreak {
	
	public static void main(String[] args) {
		for (int i = 0; i <= 10; i++) {
			System.out.println("I : " + i);
			if (i == 3){
				break;
			}
			System.out.println("POS BREAK");
		}
		System.out.println("DEPOIS DO FOR");
	}
}
