package com.bairro.aula10;

public class TestaArray {
	
	public static void main(String[] args) {
		
		String[] nome = new String[5];
		
		nome[1] = "Jo�o da Silva";		
		nome[0] = "Tiago da Rosa Val�rio";
		nome[2] = "Z� da Silva";
		nome[3] = "Carlos da Silva";
		nome[4] = "Silva da Silva";
		
		for (int posicao = 0; posicao < nome.length; posicao++){
			//Mostro a informa��o do array conforme a posi��o
			System.out.println("Posicao " + posicao + " = " + nome[posicao]);
		}
		
		for (String meuNome : nome){
			System.out.println(meuNome);
		}
		
		System.out.println("Tamanho do Array>: " + nome.length);
	}
}
