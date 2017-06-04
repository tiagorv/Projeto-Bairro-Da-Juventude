package com.bairro.aula3;

public class TestaIfElseIfElse {
	public static void main(String[] args) {
		int idade = 2;
		
		if (idade < 18){
			System.out.println("Menor de Idade!!!");
		}else if (idade >= 65){
			System.out.println("Idosa!!!!");
		}else if (idade >= 60){
			System.out.println("Quase idoso!!!");
		}else{
			System.out.println("Maior de Idade!!!");
		}
	}
}
