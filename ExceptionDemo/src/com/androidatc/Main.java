package com.androidatc;

public class Main {
	public static void main(String[] args){
		System.out.println("Hola Android ATC");
		
		String nullString = null;
		
		try {
			//Ocurre un java.lang.NullPointerException
			String resultado = nullString.substring(1);
			System.out.println("Imprimiendo string: " + resultado);
		} catch (Exception e) {
			System.out.println("Ocurrio un error: " + e.getMessage());
		}
		
	}
}
