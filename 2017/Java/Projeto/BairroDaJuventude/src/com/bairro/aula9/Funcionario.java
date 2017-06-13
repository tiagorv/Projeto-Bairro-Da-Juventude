package com.bairro.aula9;

public class Funcionario {
	String nome;
	String depto;
	double salario;
	double aumentos;
	Data dataEntrada;
	String rg;
	
	public void recebeAumento(double valor){
		this.salario = this.salario + valor;
		this.aumentos = this.aumentos + valor;
	}
	
	public double calculaGanhoAnual(){
		return this.salario * 12;
	}
	
	public void criarDataEntrada(int dia, int mes, int ano){
		Data dataEntrada = new Data();
		dataEntrada.dia = dia;
		dataEntrada.mes = mes;
		dataEntrada.ano = ano;
		
		this.dataEntrada = dataEntrada;
	}
	
	
	public void mostra(){
		System.out.println("---Dados do Funcionário---");
		System.out.println("Nome: " + this.nome);
		System.out.println("Departamento: " + this.depto);
		System.out.println("Salário R$: " + this.salario);
		System.out.println("Aumentos Recebidos R$: " + this.aumentos);
		System.out.println("Data de Entrada");
		this.dataEntrada.mostrarData();
		System.out.println("RG: " + this.rg);
		System.out.println("Ganho Anual R$: " + calculaGanhoAnual());
		System.out.println("--------------------------");
	}
}
