package com.bairro.aula7;

public class PartidaFactory {
	
	public static void main(String[] args) {
		PartidaFutebol partida = new PartidaFutebol();
		
		partida.novaPartida("Crici�ma", "Internacional");
		
		partida.marcarGolTimeA();
		partida.marcarGolTimeB();
		partida.marcarGolTimeA();
		
	}

}
