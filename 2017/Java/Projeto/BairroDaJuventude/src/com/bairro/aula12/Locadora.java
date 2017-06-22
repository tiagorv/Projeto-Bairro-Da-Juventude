package com.bairro.aula12;

public class Locadora {
	
	public static void main(String[] args) {
		
		Game jogo01 = new Game("Super Mário", "SNES", 2.50);
		Game jogo02 = new Game("Sonic", "Mega Drive", 3.50);
		Game jogo03 = new Game("BomberMan", "SNES", 2.50);
		
		
		jogo02.alugarJogo();
		jogo02.devolverJogo();
		jogo02.alugarJogo();
		
		jogo01.alugarJogo();
		
		jogo01.mostrarJogo();
		jogo02.mostrarJogo();
		jogo03.mostrarJogo();
	}
}