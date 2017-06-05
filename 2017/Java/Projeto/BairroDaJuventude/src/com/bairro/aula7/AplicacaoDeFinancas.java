package com.bairro.aula7;

public class AplicacaoDeFinancas {
	public static void main(String[] args) {
		
		Financas financialBairro = new Financas();
		
		double saldoAtual = financialBairro.receber(100);
		saldoAtual = financialBairro.pagar(1200);
		saldoAtual = financialBairro.pagar(133.45);
		financialBairro.demonstraExtrato();
		
	}
}
