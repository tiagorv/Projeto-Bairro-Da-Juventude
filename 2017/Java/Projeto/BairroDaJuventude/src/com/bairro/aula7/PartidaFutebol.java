package com.bairro.aula7;

public class PartidaFutebol {
	
	String timeA, timeB;
	int placarTimeA, placarTimeB;
	
	public void novaPartida(String time1, String time2){
		this.timeA = time1;
		this.timeB = time2;
	}
	
	public void marcarGolTimeA(){
		this.placarTimeA = this.placarTimeA + 1;
		System.out.println(placarDoJogo());
	}
	
	public void marcarGolTimeB(){
		this.placarTimeB = this.placarTimeB + 1;
		System.out.println(placarDoJogo());
	}
	
	public String placarDoJogo(){
		String mensagemPlacar = "";
		
		mensagemPlacar += this.timeA + " - " + 
		                  this.placarTimeA + " X " +
				          this.timeB + " - " +
		                  this.placarTimeB;
		
		return mensagemPlacar;
	}
}
