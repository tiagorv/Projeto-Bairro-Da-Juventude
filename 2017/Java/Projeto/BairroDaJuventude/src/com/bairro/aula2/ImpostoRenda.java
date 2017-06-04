package com.bairro.aula2;

public class ImpostoRenda {
	public static void main(String[] args) {
		double meuSalario = 2000;
		double impostoRenda = 0;
		double salarioFinal = 0;
		
		if (meuSalario > 3000){
			impostoRenda = meuSalario * .1;
		}else{
			impostoRenda = meuSalario * .05;
		}
		salarioFinal = meuSalario - impostoRenda;
		System.out.println("Salário Bruto R$: " + meuSalario);
		System.out.println("Impostos R$: " + impostoRenda);
		System.out.println("Salário R$: " + salarioFinal);
	}
}
