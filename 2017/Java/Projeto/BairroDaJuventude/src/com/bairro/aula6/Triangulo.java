package com.bairro.aula6;

public class Triangulo {
	
	public void calculaArea(double base, double altura){
		if (base == 0 || altura == 0){
			System.out.println("Deve ser informado "
					+ "base e altura para calculo da area!!! ");
		}else{
			double area = (base * altura) / 2;
			System.out.println("Area do Triangulo = " + area);
		}
	}
	
	public void tipoTriangulo(int lado1, int lado2, int lado3){
		if (lado1 == 0 || lado2 == 0 || lado3 == 0){
			System.out.println("Devem ser informados os lados "
					+ "do triangulo, antes de verificarmos"
					+ " o seu tipo!!!");
		}else{
			if (lado1 == lado2 && lado2 == lado3){
				System.out.println("Triangulo Equilatero");
			}else{
				if (lado1 == lado2 || 
					lado2 == lado3 || 
					lado1 == lado3){
					System.out.println("Triangulo Isosceles");
				}else{
					System.out.println("Triangulo Escaleno");
				}
			}
		}
	}
}
