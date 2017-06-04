package com.bairro.aula2;

public class TestaIfElse {

	public static void main(String[] args) {
		
		int salario = 15000;
		int idade = 19;
		
		if (salario != 15000){
			System.out.println("NÃO EH 15000");
		}else{
			System.out.println("VALOR EH 15000!!");			
		}
		
		if (salario >= 15000 && idade < 18){
			System.out.println("JOVEM MILIONARIO");
		}else{
			System.out.println("MILIONARIO, MAS NAO JOVEM!!");
		}
		
		
	}
}
