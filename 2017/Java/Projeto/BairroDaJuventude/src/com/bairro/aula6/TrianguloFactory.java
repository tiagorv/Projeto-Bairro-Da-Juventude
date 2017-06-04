package com.bairro.aula6;

public class TrianguloFactory {
	
	public static void main(String[] args) {
		Triangulo nossoTri = new Triangulo();
		
		nossoTri.calculaArea(12, 5);
		
		nossoTri.tipoTriangulo(0, 2, 2);
		nossoTri.tipoTriangulo(10, 8, 8);
	}
}
