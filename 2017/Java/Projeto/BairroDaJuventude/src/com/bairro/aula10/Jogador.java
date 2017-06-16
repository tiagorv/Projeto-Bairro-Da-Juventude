package com.bairro.aula10;

public class Jogador {
	
	String nome;
	String posicao;
	int forca = 100;
	int passe;
	int chute;
	
	public void chutar(){
		this.forca = this.forca - chute;
	}
	
	public void passar(){
		this.forca = this.forca - passe;
	}
	
	public void dadosJogador(){
		System.out.println("Nome: " + this.nome);
		System.out.println("Posição: " + this.posicao);
		System.out.println("Força Atual: " + this.forca);
	}
}
