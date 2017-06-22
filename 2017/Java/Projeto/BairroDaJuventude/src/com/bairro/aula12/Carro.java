package com.bairro.aula12;

public class Carro {
	
	private String descricao;
	private double valor;
	private boolean impostoPago = false;
	private int codigo;
	private static int qtdeAutomoveis;
	private static int qtdeImpostoPago;
	
	public Carro(String descricao, double valor) {
		this.descricao = descricao;
		this.valor = valor;
		qtdeAutomoveis = qtdeAutomoveis + 1;
		this.codigo = qtdeAutomoveis;
	}
	
	public void pagarImposto(){
		if (this.impostoPago == false){
			this.impostoPago = true;
			qtdeImpostoPago = qtdeImpostoPago + 1;
		}
	}
	
	public void venderCarro(){
		if (this.impostoPago){
			System.out.println("Realizada a venda de:");
			System.out.println("Carro: " + this.descricao);
			System.out.println("Valor R$: " + this.valor);
		}else{
			System.out.println("Impostos Atrasados - não é possível efetuar a venda do carro!!!");
		}
	}
	
	public void mostrarDados(){
		System.out.println("Código: " + this.codigo);
		System.out.println("Descrição: " + this.descricao);
		System.out.println("Valor R$: " + this.valor);
		System.out.println("Imposto Pago: " + this.impostoPago);
		System.out.println("Quantidade de Carros: " + qtdeAutomoveis);
		System.out.println("Quantidade de Carros com imposto Pago: " + qtdeImpostoPago);
		System.out.println("----------------------------");
	}
}
