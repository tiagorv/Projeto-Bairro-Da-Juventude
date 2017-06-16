package com.bairro.aula11;

public class FolhaDePagamento {
	
	public static void main(String[] args) {
		
		Funcionario programador = new Funcionario();
		
		programador.setNome("Tiago da Rosa Valério");
		programador.setCargo("Analista de Sistemas");
		
		programador.aumentaSalario(-120);
		programador.aumentaSalario(1200);
		programador.aumentaSalario(899);
		programador.mostraFolhaDePagamento();
	}
}
