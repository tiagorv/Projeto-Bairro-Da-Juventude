package com.bairro.aula10;

public class TimeDeFutebol {
	
	public static void main(String[] args) {
		
		Jogador jogador01 = new Jogador();
		jogador01.chute = 3;
		jogador01.passe = 1;
		jogador01.nome = "Pelé";
		jogador01.posicao = "Atacante";
		
		Jogador jogador02 = new Jogador();
		jogador02.chute = 4;
		jogador02.passe = 2;
		jogador02.nome = "Zico";
		jogador02.posicao = "Atacante";
		
		Jogador jogador03 = new Jogador();
		jogador03.chute = 6;
		jogador03.passe = 3;
		jogador03.nome = "Roberto Carlos";
		jogador03.posicao = "Lateral";
		
		Jogador jogador04 = new Jogador();
		jogador04.chute = 3;
		jogador04.passe = 1;
		jogador04.nome = "Taffarel";
		jogador04.posicao = "Goleiro";
		
		Jogador[] selecaoDoMundo = new Jogador[4];
		selecaoDoMundo[0] = jogador01;
		selecaoDoMundo[1] = jogador02;
		selecaoDoMundo[2] = jogador03;
		selecaoDoMundo[3] = jogador04;
		
		BancoDeDados meuBanco = new BancoDeDados();
		meuBanco.gravarJogadores(selecaoDoMundo);
	}

}
