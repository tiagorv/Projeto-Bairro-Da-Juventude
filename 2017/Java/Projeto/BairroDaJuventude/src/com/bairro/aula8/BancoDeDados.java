package com.bairro.aula8;

public class BancoDeDados {
	
	public void gravarPessoa(Pessoas pessoaBanco){
		String sql;
		
		sql = "insert into pessoas (nome, cpf) "
				+ "values (" + pessoaBanco.nome + ", " 
				+ pessoaBanco.cpf + ");";
		
		System.out.println("SQL: " + sql);
	}
	
	public void gravarBairro(Bairros bairroBanco){
		String sql;
		
		sql = "insert into bairros (bairro, cidade, estado)"
				+ " values ( " + bairroBanco.nomeBairro + "," +
				bairroBanco.nomeCidade + "," + 
				bairroBanco.nomeEstado + ");";
		
		System.out.println("Comando de Banco de Dados");
		System.out.println(sql);
	}

}
