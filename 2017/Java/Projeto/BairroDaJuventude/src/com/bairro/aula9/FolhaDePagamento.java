package com.bairro.aula9;

public class FolhaDePagamento {
	public static void main(String[] args) {
		Funcionario estagiario = new Funcionario();
		
		estagiario.nome = "Zé Pequeno";
		estagiario.depto = "Desenvolvimento de Software";
		estagiario.criarDataEntrada(10, 1, 2010);
		
		estagiario.rg = "3.999.909";
		estagiario.salario = 2500.99;
		
		estagiario.mostra();
		estagiario.recebeAumento(300);
		estagiario.mostra();
	}

}
