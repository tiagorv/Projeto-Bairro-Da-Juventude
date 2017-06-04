package com.bairro.aula4;

public class Carro {
	
	String modelo;
	int anoFabricacao;
	int velocidade;
	int velocidadeMaxima = 100;
	
	public void aceleraCarro(){
		int velocidadeAlterada = this.velocidade + 10;
		
		if (velocidadeAlterada > this.velocidadeMaxima){
			System.out.println("Aceleração vai ultrapassar o limite.");
		}else{
			this.velocidade = this.velocidade + 10;			
		}
	}
	
	public void aceleraAyrton(){
		int velocidadeAlterada = this.velocidade + 50;
		
		if (velocidadeAlterada > this.velocidadeMaxima){
			System.out.println("Aceleração vai ultrapassar o limite.");
		}else{
			this.velocidade = this.velocidade + 50;			
		}
	}
	
	public void aceleraRubinho(){
		int velocidadeAlterada = this.velocidade + 5;
		
		if (velocidadeAlterada > this.velocidadeMaxima){
			System.out.println("Aceleração vai ultrapassar o limite.");
		}else{
			this.velocidade = this.velocidade + 5;			
		}
	}
	
	public void diminuiVelocidade(){
		int velocidadeAlterada = this.velocidade - 10;
		
		if (velocidadeAlterada < 0){
			System.out.println("Desaceleração vai ficar menor que 0(zero) por hora!!");
		}else{
			this.velocidade = this.velocidade - 10;			
		}
	}
	
	public void mostraDados(){
		System.out.println("Carro: " + this.modelo);
		System.out.println("Ano: " + this.anoFabricacao);
		System.out.println("Velocidade: " + this.velocidade);
	}
}
