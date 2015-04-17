package com.androidatc;

public class ArrayDemo {
	public static void main(String[] args){
		//Declaramos un array de enteros
		int[] unArray;
		
		//Asignamos memoria para 10 enteros
		unArray = new int[10];
		
		//Inicializamos el primer elemento
		unArray[0] = 100;
		
		//Inicializamos el segundo elemento
		unArray[1] = 200;
		
		//Inicializamos el resto de los elementos del array
		unArray[2] = 300;
		unArray[3] = 400;
		unArray[4] = 500;
		unArray[5] = 600;
		unArray[6] = 700;
		unArray[7] = 800;
		unArray[8] = 900;
		unArray[9] = 1000;
		
		//Imprimos los elementos del array
		System.out.println("El elemento 0 del array es: " + unArray[0]);
		System.out.println("El elemento 1 del array es: " + unArray[1]);
		System.out.println("El elemento 2 del array es: " + unArray[2]);
		System.out.println("El elemento 3 del array es: " + unArray[3]);
		System.out.println("El elemento 4 del array es: " + unArray[4]);
		System.out.println("El elemento 5 del array es: " + unArray[5]);
		System.out.println("El elemento 6 del array es: " + unArray[6]);
		System.out.println("El elemento 7 del array es: " + unArray[7]);
		System.out.println("El elemento 8 del array es: " + unArray[8]);
		System.out.println("El elemento 9 del array es: " + unArray[9]);
	}
}
