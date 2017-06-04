package com.bairro.aula5;

public class Triangulo {
	
	double lado1, lado2, lado3;
	double base, altura;
	
	public void calculaArea(){
		if (this.base == 0 || this.altura == 0){
			System.out.println("Deve ser informado a base e "
								+ "altura do triângulo, "
								+ "antes de calcular a "
								+ "sua area!!!");
		}else{
			double area = (this.base * this.altura) / 2;
			System.out.println("Area do Triângulo = " + area);
		}
	}
	
	public void tipoTriangulo(){
		if (this.lado1 == 0 || 
			this.lado2 == 0 || 
			this.lado3 == 0){
			System.out.println("Devem ser informados todos "
					+ "os lados do triângulo, antes de "
					+ "verificarmos o seu tipo!!!");
		}else{
			if (this.lado1 == this.lado2 && 
				this.lado2 == this.lado3){
				System.out.println("Triângulo Equilátero!!!");
			}else{
				if (this.lado1 == this.lado2 || 
				    this.lado2 == this.lado3 ||
				    this.lado1 == this.lado3){
					System.out.println("Triangulo Isosceles!!!");
				}else{
					System.out.println("Triangulo Escaleno!!!!");
				}
			}
		}
	}

}
