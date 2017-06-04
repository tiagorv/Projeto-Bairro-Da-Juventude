package com.bairro.aula3;

public class TestaSwitch {
	public static void main(String[] args) {
		int opcao = 1;
		
		switch (opcao) {
		case 1:
			System.out.println("OPÇÃO UM!!!");
			break;
		case 2:
			System.out.println("OPÇÂO DOIS!!!");
			break;
		case 3:
			System.out.println("OPÇÂO TRÊS!!");
			break;
		default:
			System.out.println("OPÇÃO INVÁLIDA!!");
		}

		System.out.println("DEPOIS DO SWITCH!!!");
		
		
	}

}
