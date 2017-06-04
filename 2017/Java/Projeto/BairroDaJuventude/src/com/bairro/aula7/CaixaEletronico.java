package com.bairro.aula7;

public class CaixaEletronico {
	
	int notas100, notas50, notas20, notas10, notas5, 
	notas2, notas1;
	
	public int calculaNotas100(int valor){
		this.notas100 = valor / 100;
		int restoDinheiro = valor % 100;
		return restoDinheiro;
	}
	
	public int calculaNotas50(int valor){
		this.notas50 = valor / 50;
		int restoDinheiro = valor % 50;
		return restoDinheiro;
	}
	
	public int calculaNotas20(int valor){
		this.notas20 = valor / 20;
		int restoDinheiro = valor % 20;
		return restoDinheiro;
	}	
	
	public int calculaNotas10(int valor){
		this.notas10 = valor / 10;
		int restoDinheiro = valor % 10;
		return restoDinheiro;
	}	
	
	public int calculaNotas5(int valor){
		this.notas5 = valor / 5;
		int restoDinheiro = valor % 5;
		return restoDinheiro;
	}	
	
	public int calculaNotas2(int valor){
		this.notas2 = valor / 2;
		int restoDinheiro = valor % 2;
		return restoDinheiro;
	}	
	
	public int calculaNotas1(int valor){
		this.notas1 = valor;
		return 0;
	}	
	
	public void mostraNotasCaixa(int valor){
		
		System.out.println("Seu saque de R$: " + 
		                    valor + 
		                    " será realizado em:");
		if (this.notas100 > 0){
			System.out.println(this.notas100 + " nota(s) de 100 reais!");
		}
		
		if (this.notas50 > 0){
			System.out.println(this.notas50 + " nota(s) de 50 reais!");
		}		
		
		if (this.notas20 > 0){
			System.out.println(this.notas20 + " nota(s) de 20 reais!");
		}		
		
		if (this.notas10 > 0){
			System.out.println(this.notas10 + " nota(s) de 10 reais!");
		}
		
		if (this.notas5 > 0){
			System.out.println(this.notas5 + " nota(s) de 5 reais!");
		}		
		
		if (this.notas2 > 0){
			System.out.println(this.notas2 + " nota(s) de 2 reais!");
		}		
		
		if (this.notas1 > 0){
			System.out.println(this.notas1 + " nota(s) de 1 reais!");
		}		
	}
}
