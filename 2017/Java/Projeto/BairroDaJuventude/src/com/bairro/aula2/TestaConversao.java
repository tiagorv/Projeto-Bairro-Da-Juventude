package com.bairro.aula2;

public class TestaConversao {
	
	public static void main(String[] args) {
		
		byte variavelByte = 0;
		
		short variavelShort = 0;
		
		//Byte eh menor que Short, então conversão implicita
		variavelShort = variavelByte;
		
		variavelByte = (byte)variavelShort;
		
		long testaLong = 99999999L;
		variavelByte = (byte) testaLong;
		
		System.out.println(variavelByte);
	}

}
