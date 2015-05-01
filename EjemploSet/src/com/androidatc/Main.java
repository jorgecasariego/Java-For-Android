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

	private static void ejemploIterator(Set<String> setA) {
		Iterator<String> i = setA.iterator();
		
		while(i.hasNext()){
			System.out.println("Valor de la coleccion es " + i.next());
		}
	}

	
}
