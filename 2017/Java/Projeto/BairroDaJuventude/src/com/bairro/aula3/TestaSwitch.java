package com.bairro.aula3;

public class TestaSwitch {
	public static void main(String[] args) {
		int opcao = 1;
		
		switch (opcao) {
		case 1:
			System.out.println("OP��O UM!!!");
			break;
		case 2:
			System.out.println("OP��O DOIS!!!");
			break;
		case 3:
			System.out.println("OP��O TR�S!!");
			break;
		default:
			System.out.println("OP��O INV�LIDA!!");
		}

		System.out.println("DEPOIS DO SWITCH!!!");
		
		
	}

}
