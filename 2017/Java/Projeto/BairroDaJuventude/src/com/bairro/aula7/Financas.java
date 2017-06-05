package com.bairro.aula7;

public class Financas {
	
	double saldo = 1000;
	
	public double receber(double valorRecebido){
		this.saldo = this.saldo + valorRecebido;
		return this.saldo;
	}
	
	public double pagar(double valorPagar){
		
		if (this.saldo >= valorPagar){
			this.saldo = this.saldo - valorPagar;
			return this.saldo;
		}
		
		System.out.println("Não temos saldo suficiente para compra.");
		System.out.println("Saldo Atual R$: " + this.saldo);
		System.out.println("Valor da Compra R$: " + valorPagar);
		return this.saldo;
		
		
		
		
	}
	
	public void demonstraExtrato(){
		System.out.println("Saldo da Minha Conta R$: " + this.saldo);
	}

}
