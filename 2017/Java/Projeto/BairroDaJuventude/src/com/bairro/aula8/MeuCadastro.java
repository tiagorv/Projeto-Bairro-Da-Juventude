package com.bairro.aula8;

public class MeuCadastro {
	
	public static void main(String[] args) {
		
		Pessoas minhaPessoa = new Pessoas();
		
		minhaPessoa.nome = "Tiago da Rosa Valério";
		minhaPessoa.cpf = "333.333.333-33";
		minhaPessoa.idade = 36;
		minhaPessoa.numero = "S/N";
		minhaPessoa.rua = "Rua Olivio Pavei";
		minhaPessoa.bairro = "Centro";
		minhaPessoa.cidade = "Içara - Capital do Mundo.";
		
		Validacoes validacoesCadastrais = new Validacoes();
		
		if (validacoesCadastrais.validaPessoa(minhaPessoa) == true){
			BancoDeDados meuBanco = new BancoDeDados();
			meuBanco.gravarPessoa(minhaPessoa);
		}else{
			System.out.println("NOSSA VALiDAÇÃO RETORNOU FALSO");
		}
	}

}
