package com.bairro.aula4;

public class Cachorro {
	
	String nome;
	String raca;
	int energia = 100;
	
	public void mostraDadosCachorro(){
		System.out.println("Nome do Cachorro: " + this.nome);
		System.out.println("Raça: " + this.raca);
		System.out.println("Energia Atual: " + this.energia);
	}
	
	public void brincar(){
		System.out.println(this.nome + " gastou 3 de energia brincando!");
		this.energia = this.energia - 3;
	}
	
	public void correr(){
		System.out.println(this.nome + " gastou 6 de energia correndo!");
		this.energia = this.energia - 6;
	}
	
	public void andar(){
		System.out.println(this.nome + " gastou 1 de energia andando!");
		this.energia = this.energia - 1;
	}
	
	public void comer(){
		System.out.println(this.nome + " recuperou 5 de energia comendo!");
		this.energia = this.energia + 5;
	}	
	
	public void beber(){
		System.out.println(this.nome + " recuperou 3 de energia bebendo!");
		this.energia = this.energia + 3;
	}	
	
	public void dormir(){
		System.out.println(this.nome + " recuperou 3 de energia dormindo!");
		this.energia = this.energia + 3;
	}	
	
}
