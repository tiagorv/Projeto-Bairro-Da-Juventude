package com.bairro.aula4;

public class CarroFactory {

	public static void main(String[] args) {
		
		Carro fusca = new Carro();
		fusca.modelo = "Fusca 1.600";
		fusca.anoFabricacao = 1969;
		
		fusca.aceleraCarro();
		fusca.aceleraAyrton();
		fusca.aceleraAyrton();
		fusca.aceleraRubinho();
		fusca.aceleraRubinho();		
		fusca.diminuiVelocidade();
		fusca.diminuiVelocidade();
		fusca.diminuiVelocidade();
		fusca.diminuiVelocidade();
		fusca.diminuiVelocidade();
		fusca.diminuiVelocidade();
		fusca.diminuiVelocidade();
		fusca.diminuiVelocidade();
		fusca.aceleraAyrton();		
		fusca.mostraDados();
	}
}
