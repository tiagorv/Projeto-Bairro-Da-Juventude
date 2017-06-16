package com.bairro.aula10;

public class BancoDeDados {
	
	public void gravarJogadores(Jogador[] meusJogadores){
		
		for (Jogador jogador : meusJogadores) {
			
			String comandoSQL;
			
			comandoSQL = "insert into jogadores " +
			" (nome, posicao, forca) values (" +
			jogador.nome + "," +
			jogador.posicao + "," +
			jogador.forca + ");";
			
			System.out.println("INSERINDO NO BANCO DE DADOS");
			System.out.println(comandoSQL);
		}
	}
}
