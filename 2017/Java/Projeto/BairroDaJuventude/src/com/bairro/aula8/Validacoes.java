package com.bairro.aula8;

public class Validacoes {
	
	public boolean validaPessoa(Pessoas minhaPessoaPorParametro){
		
		if (minhaPessoaPorParametro.idade == 0){
			System.out.println("Deve ser informada a idade da pessoa!!");
			return false;
		}
		
		if (minhaPessoaPorParametro.cpf.trim().length() < 14){
			System.out.println("CPF deve possuir 14 caracterres!!");
			return false;
		}
		
		return true;
	}
	
	
	public boolean validaBairro(Bairros bairroParametro){
		if (bairroParametro.nomeEstado.trim().length() != 2){
			System.out.println("Estado Inválido!");
			return false;
		}
		return true;
	}

}
