package com.bairro.aula8;

public class CadastroDeBairros {
	public static void main(String[] args) {
		
		Bairros cadastroBairro = new Bairros();
		
		cadastroBairro.nomeBairro = "Centro";
		cadastroBairro.nomeCidade = "Criciúma";
		cadastroBairro.nomeEstado = "SC";
		
		Validacoes validaBairro = new Validacoes();
		
		if (validaBairro.validaBairro(cadastroBairro)){
			BancoDeDados banco = new BancoDeDados();
			banco.gravarBairro(cadastroBairro);
		}
	}

}
