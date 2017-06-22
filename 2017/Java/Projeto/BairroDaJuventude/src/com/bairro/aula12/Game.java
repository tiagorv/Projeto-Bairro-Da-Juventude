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
			System.out.println("Locação realizada!!!!");
		}else{
			System.out.println("Jogo já está alugado!!!");
		}
	}
	
	public void devolverJogo(){
		if (this.disponivel == false){
			this.disponivel = true;
			System.out.println("Devolução Realizada!!!");
		}else{
			System.out.println("Jogo não está alugado para ser devolvido!");
		}
	}
	
	public void mostrarJogo(){
		System.out.println("Código: " + this.codigo);
		System.out.println("Nome: " + this.nome);
		System.out.println("Console: " + this.console);
		System.out.println("Valor Aluguel R$: " + this.valorAluguel);
		System.out.println("Disponível: " + this.disponivel);
		System.out.println("Quantidade de Jogos: " + qtdJogos);
		System.out.println("Quantidade de Locações: " + qtdeAlugados);
		System.out.println("Valor das Locações R$: " + valorTotalAluguel);
		System.out.println("--------------------------");
	}
}
