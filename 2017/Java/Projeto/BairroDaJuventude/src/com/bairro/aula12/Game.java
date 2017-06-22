package com.bairro.aula12;

public class Game {
	
	private String nome;
	private String console;
	private double valorAluguel;
	private boolean disponivel = true;
	private int codigo;	
	private static int qtdJogos;
	private static int qtdeAlugados;
	private static double valorTotalAluguel;

	public Game(String nome, String console, double valorAluguel) {
		this.nome = nome;
		this.console = console;
		this.valorAluguel = valorAluguel;
		qtdJogos = qtdJogos + 1;
		this.codigo = qtdJogos;
	}
	
	public void alugarJogo(){
		if (this.disponivel == true){
			this.disponivel = false;
			qtdeAlugados = qtdeAlugados + 1;
			valorTotalAluguel = valorTotalAluguel + this.valorAluguel;
			System.out.println("Loca��o realizada!!!!");
		}else{
			System.out.println("Jogo j� est� alugado!!!");
		}
	}
	
	public void devolverJogo(){
		if (this.disponivel == false){
			this.disponivel = true;
			System.out.println("Devolu��o Realizada!!!");
		}else{
			System.out.println("Jogo n�o est� alugado para ser devolvido!");
		}
	}
	
	public void mostrarJogo(){
		System.out.println("C�digo: " + this.codigo);
		System.out.println("Nome: " + this.nome);
		System.out.println("Console: " + this.console);
		System.out.println("Valor Aluguel R$: " + this.valorAluguel);
		System.out.println("Dispon�vel: " + this.disponivel);
		System.out.println("Quantidade de Jogos: " + qtdJogos);
		System.out.println("Quantidade de Loca��es: " + qtdeAlugados);
		System.out.println("Valor das Loca��es R$: " + valorTotalAluguel);
		System.out.println("--------------------------");
	}
}
