package com.bairro.aula3;

public class TestaEscopo {
	public static void main(String[] args) {
		
		int idade = 18;
		if (idade >= 18){
			//Variavel salarioEstagiario criada em memoria
			int salarioEstagiario = 700;			
			idade = 11;
			if (salarioEstagiario < 100){
				salarioEstagiario = 1111;
			}
			/*
			 * Variavel salarioEstagiario excluida da memoria
			 * pois a mesma foi criada dentro do IF			
			 */
		}
		idade = 19;
	}
}