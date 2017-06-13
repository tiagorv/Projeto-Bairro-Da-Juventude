package com.bairro.aula10;

public class SuperHeroi {
	
	String nome;
	int energia = 100;
	int valorAtaque;
	int valorDefesa;
	
	public void ataque(){
		this.energia = this.energia - valorAtaque;
	}
	
	public void defesa(){
		this.energia = this.energia - valorDefesa;
	}
	
	public void mostrarDadosHeroi(){
		System.out.println("---Detalhes do Heroi---");
		System.out.println("Nome: " + this.nome);
		System.out.println("Energia Atual: " + this.energia);
	}
}
