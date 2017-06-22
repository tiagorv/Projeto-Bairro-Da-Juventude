package com.bairro.aula11;

public class CaixaEletronico {
	
	private String numeroConta;
	private String correntista;
	private double saldo;
	private double movimentacoesDeposito;
	private double movimentacoesSaque;
	
	
	public String getNumeroConta() {
		return numeroConta;
	}
	
	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}
	
	public String getCorrentista() {
		return correntista;
	}
	
	public void setCorrentista(String correntista) {
		this.correntista = correntista;
	}
	
	public void deposito(double valorDoDeposito){
		if (valorDoDeposito > 0){
			this.saldo = this.saldo + valorDoDeposito;
			this.movimentacoesDeposito = this.movimentacoesDeposito + valorDoDeposito;
		}else{
			System.out.println("Deve ser informado valor maior que 0(zero), para realizar depósito!!!");
		}
	}
	
	
	public void saque(double valorDoSaque){
		if (valorDoSaque > 0){
			if (valorDoSaque > this.saldo){
				System.out.println("Saldo Insuficiente para " +
					"saque. Saldo R$: " + this.saldo + 
					" - Valor Saque R$: " + valorDoSaque );
			}else{
				this.saldo = this.saldo - valorDoSaque;
				this.movimentacoesSaque = this.movimentacoesSaque + valorDoSaque;
			}
		}else{
			System.out.println("Deve ser informado valor maior que 0(zero), para realizar saque!!!");			
		}
	}
	
	public void extrato(){
		System.out.println("-----Extrato Bancário----");
		System.out.println("Conta: " + this.numeroConta);
		System.out.println("Correntista: " + this.correntista);
		System.out.println("Depósito(s) Realizado(s) R$: " + this.movimentacoesDeposito);
		System.out.println("Saque(s) Realizado(s) R$: " + this.movimentacoesSaque);		
		System.out.println("Saldo R$: " + this.saldo);
	}
}
