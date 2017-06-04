package com.bairro.aula7;

public class SaqueMaroto {
	
	public static void main(String[] args) {
		
		CaixaEletronico caixa = new CaixaEletronico();
		
		int valorSacado = 123;
		int valorOriginal = valorSacado;
		
		valorSacado = caixa.calculaNotas100(valorSacado);
		valorSacado = caixa.calculaNotas50(valorSacado);
		valorSacado = caixa.calculaNotas20(valorSacado);
		valorSacado = caixa.calculaNotas10(valorSacado);
		valorSacado = caixa.calculaNotas5(valorSacado);
		valorSacado = caixa.calculaNotas2(valorSacado);
		valorSacado = caixa.calculaNotas1(valorSacado);	
		caixa.mostraNotasCaixa(valorOriginal);
		
	}

}
