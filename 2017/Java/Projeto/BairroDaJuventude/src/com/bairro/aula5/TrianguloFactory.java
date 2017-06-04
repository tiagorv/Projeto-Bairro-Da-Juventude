package com.bairro.aula5;

public class TrianguloFactory {
	
	public static void main(String[] args) {
		
		Triangulo meuTriangulo = new Triangulo();
		meuTriangulo.altura = 10;
		meuTriangulo.base = 5;
		meuTriangulo.calculaArea();
		
		meuTriangulo.lado1 = 7;
		meuTriangulo.lado2 = 9;
		meuTriangulo.lado3 = 10;
		meuTriangulo.tipoTriangulo();
		
	}

}
