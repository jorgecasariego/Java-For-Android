package com.androidatc;

public class TestErrorDemo {
	public static void main(String[] args){
		//StackOverflow test = new StackOverflow();
		
		//test.metodo1(); //Ocurre un error StackOverflowError
		
		/**
		 * StackOverflowError
		 * 
		 * Un StackOverFlow se produce cuando el tamaño de la memoria requerida
		 * por la pila del progama Java es mayor de lo que se configuró el entorno
		 * de ejecución Java(Java Runtine Enviroment) para la aplicación. 
		 * 
		 * Hay que tener en cuenta que cada vez que se llama a una función se reservan 
		 * 4 bytes de la memoria que se liberarán cuando finalice su ejecución.
		 * 
		 * method1 llama a la función method2, es decir que se reservan 4 bytes nuevamente
		 * por cada llamada. Se ejecuta nuevamente una instancia de la función method1 o method2
		 * y así sucesivamente hasta que la pila estática se colme y se cuelgue el programa.
		 */
		
		
		MemoryError testMemory = new MemoryError();
		testMemory.metodo3();
	}
}
