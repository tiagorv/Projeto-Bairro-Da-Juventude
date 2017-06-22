package com.bairro.aula11;

public class CaixaEletronicoMain {
	
	public static void main(String[] args) {
		
		CaixaEletronico meuCaixa = new CaixaEletronico();
		
		meuCaixa.setNumeroConta("1234-8");
		meuCaixa.setCorrentista("Betha Sistemas");
		
		meuCaixa.deposito(-100);
		meuCaixa.deposito(1250);
		meuCaixa.deposito(25);
		
		meuCaixa.saque(-2);
		meuCaixa.saque(3000);
		meuCaixa.saque(250);
		meuCaixa.saque(100);
		
		meuCaixa.extrato();
		
	}
}
