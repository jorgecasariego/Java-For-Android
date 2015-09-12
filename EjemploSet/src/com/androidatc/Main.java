package com.androidatc;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
	public static void main(String[] args){
		Set<String> setA = new HashSet<String>();
		
		//Añadimos elementos a la coleccion
		setA.add("Elemento 1");
		setA.add("Elemento 2");
		setA.add("Elemento 3");
		
		//Imprime en forma desordenada
		System.out.println("setA es "+ setA);
		
		//Removemos un elemento de la coleccion
		setA.remove("Elemento 1");
		System.out.println("setA es "+ setA);
		
		//Ejemplo de iterator
		ejemploIterator(setA);
	}

	/**
	 * Casos en los que definimos un metodo static:
	 * 1. Si estamos escribiendo una clase Utilitaria y suponemos que esta no debe ser cambiada
	 * 2. Si el metodo no esta usando una variable de instancia
	 * 3. Si la operación no depende de la creación de alguna instancia
	 * 4. Si hay alguna parte de un codigo que puede ser facilmente compartida entre varios metodos entonces
	 *    podemos extraer ese codigo en un metodo estatico
	 * 5. Si estamos seguros que la definición del metodo no será cambiada o sobreescrita. Un metodo estatico
	 *    no puede ser sobreescrita
	 * @param setA
	 */
	private static void ejemploIterator(Set<String> setA) {
		Iterator<String> i = setA.iterator();
		
		while(i.hasNext()){
			System.out.println("Valor de la coleccion es " + i.next());
		}
	}

	
}
