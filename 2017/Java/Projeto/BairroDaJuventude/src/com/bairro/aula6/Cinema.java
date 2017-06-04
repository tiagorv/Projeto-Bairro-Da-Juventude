package com.bairro.aula6;

public class Cinema {
	
	double valorIngresso = 20;
	int capacidadeMaxima = 150;
	int quantidadeEstudantes = 0;
	int quantidadeInteira = 0;
	
	public void comprarEstudante(int quantidade){
		int lugaresOcupados = quantidadeEstudantes + 
							  quantidadeInteira + 
							  quantidade;
		
		if (lugaresOcupados > capacidadeMaxima){
			System.out.println("Não é possível adicionar "
					+ quantidade + " de pessoas!");
		}else{
			quantidadeEstudantes = quantidadeEstudantes + 
					               quantidade;
		}
	}
	
	public void comprarInteira(int quantidade){
		int lugaresOcupados = quantidadeEstudantes +
							  quantidadeInteira +
							  quantidade;
		
		if (lugaresOcupados > capacidadeMaxima){
			System.out.println("Não foi possível "
					+ " adicionar " + quantidade + 
					" de pessoas ");
		}else{
			quantidadeInteira = quantidadeInteira + quantidade;
		}
	}
	
	public void lucroDoCinema(){
		double valorEstudante = quantidadeEstudantes * (valorIngresso / 2);
		double valorInteira = quantidadeInteira * valorIngresso;
		double valorTotal = valorEstudante + valorInteira;
		
		System.out.println("Relatório do Meu Cinema");
		System.out.println("Estudantes " + 
		quantidadeEstudantes + " R$: " + valorEstudante);
		
		System.out.println("Inteira " +
		quantidadeInteira + " R$: " + valorInteira);
		
		System.out.println("Renda Total R$: " + valorTotal);
	}
}
