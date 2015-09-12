package com.androidatc;

public class ControlFlow {
	public static void main(String[] args){
		int puntuacion = 80;
		String nota = "";
		
		// ***************** Utilizando if ***************** 
		if (puntuacion >= 90) {
			nota = "Sobresaliente";
		} else if (puntuacion >= 80) {
			nota = "Notable";
		} else if (puntuacion >= 70) {
			nota = "Bien";
		} else if (puntuacion >= 60) {
			nota = "Suficiente";
		} else {
			nota = "Insuficiente";
		}
		
		System.out.println("Utilizando if");
		System.out.println("Puntuacion: " + puntuacion + " Nota: " + nota);
		
		// ***************** Utilizando switch ***************** 
		int diaSemanaInt = 1;
		String diaSemanaString = "";
		
		switch (diaSemanaInt) {
		case 1:
			diaSemanaString = "Lunes";
			break;
		case 2:
			diaSemanaString = "Martes";
			break;
		case 3:
			diaSemanaString = "Miercoles";
			break;
		case 4:
			diaSemanaString = "Jueves";
			break;
		case 5:
			diaSemanaString = "Viernes";
			break;
		default:
			break;
		}
		
		System.out.println();
		System.out.println("Utilizando switch");
		System.out.println("Dia de la semana en entero: " + diaSemanaInt+ " es en letra: " + diaSemanaString);
		
		// ***************** Utilizando while ***************** 
		int dolares = 5350;
		
		System.out.println();
		System.out.println("Utilizando while");
		while(dolares < 5400){
			System.out.println("consumiendo: " + dolares);
			dolares++;
		}
		
		System.out.println("Sin dinero");
		
		// ***************** Utilizando for ***************** 
		System.out.println();
		System.out.println("Utilizando For");
		for (int i = 0; i < 10; i++) {
			System.out.println("Valor es " + i);
		}
		
		int valor = 62;
		if((valor % 2) == 0){
			System.out.println("Par");
		} else{
			System.out.println("Impar");
		}
		int aNumber = 3;
		
		if(aNumber >= 0)
			   if(aNumber == 0)
				System.out.println("First String");
			else System.out.println("Second String");
			System.out.println("Third String");
		
	}
}
