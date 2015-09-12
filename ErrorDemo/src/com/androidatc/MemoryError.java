package com.androidatc;

public class MemoryError {
	static final int SIZE = 2 * 1024 * 1024;
	
	public void metodo3(){
		
		//Tamaño de nuestro array
		int tamanhoArray = 20;
		System.out.println("\n=================> Comenzar test de OOM..\n");
		
		for (int i = 1; i < 20; i++) {
			
			System.out.println("Iteración " + i + " Memoria Libre: " + Runtime.getRuntime().freeMemory());
			//int cantidad = 2;
			int[] arrayEjemplo = new int[tamanhoArray];
			// feel memoryFillIntVar array in loop..
			//do {
			//	arrayEjemplo[cantidad] = 0;
			//	cantidad--;
			//} while (cantidad > 0);
			
			tamanhoArray = tamanhoArray * 5;
			System.out.println("\n Memoria requeridad para el siguiente loop: " + tamanhoArray);
		}
	}

}
