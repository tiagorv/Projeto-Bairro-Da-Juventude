package com.bairro.aula11;

public class Funcionario {
	
	private String nome;
	private String cargo;
	private double salario;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	public void aumentaSalario(double valorAumento){
		if (valorAumento < 0){
			System.out.println("Não pode dar um aumento negativo!!!");
		}else{
			this.salario = this.salario + valorAumento;
		}
	}
	
	public void mostraFolhaDePagamento(){
		System.out.println("DADOS DO FUNCIONÁRIO");
		System.out.println("Nome: " + this.nome);
		System.out.println("Cargo: " + this.cargo);
		System.out.println("Salário R$: " + this.salario);
	}
}
