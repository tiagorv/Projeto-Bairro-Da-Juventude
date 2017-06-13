package com.bairro.aula10;

public class TestaArray {
	
	public static void main(String[] args) {
		
		String[] nome = new String[5];
		
		nome[1] = "João da Silva";		
		nome[0] = "Tiago da Rosa Valério";
		nome[2] = "Zé da Silva";
		nome[3] = "Carlos da Silva";
		nome[4] = "Silva da Silva";
		
		for (int posicao = 0; posicao < nome.length; posicao++){
			//Mostro a informação do array conforme a posição
			System.out.println("Posicao " + posicao + " = " + nome[posicao]);
		}
		
		for (String meuNome : nome){
			System.out.println(meuNome);
		}
		
		System.out.println("Tamanho do Array>: " + nome.length);
	}
}
