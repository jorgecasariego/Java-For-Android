package com.androidatc;

import java.util.ArrayList;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Main {
	public static void main(String[] args){
		ArrayList<String> abecedario = new ArrayList<String>();
		
		abecedario.add("A");
		abecedario.add("B");
		abecedario.add("C");
		abecedario.add("D");
		abecedario.add("E");
		
		System.out.println("Abecedario es " + abecedario);
		
		System.out.println("Iterando...");
		iterar(abecedario);
		
		//Removiendo datos del abecesario
		abecedario.remove(2);
		System.out.println("Despues de remover el 2do elemento es " + abecedario);
		
		//Obteniendo el 2do valor de la coleccion
		System.out.println("El 2do valor del abecesario es " + abecedario.get(2));
		
		//Probando el metodo contain
		if(abecedario.contains("Z")){
			System.out.println("El abecedario contiene la letra Z");
		}
		else{
			System.out.println("El abecedario no contiene la letra Z");
		}
		
		//Obteniendo longitud de la coleccion
		System.out.println("La coleccion tiene una longitud de " + abecedario.size());
		
		//Obteniendo el indice a partir del valor
		int resultado = abecedario.indexOf("B");
		System.out.println("El indice de B es " + resultado);
	}

	//Tenemos 4 maneras de iterar a traves de los arrayList
	private static void iterar(ArrayList<String> abecedario) {
		//Metodo 1: For loop
		System.out.println("For loop:");
		for(int i=0; i<abecedario.size(); i++){
			System.out.println("- " + abecedario.get(i));
		}
		
		//Metodo 2: Advance for loop
		System.out.println("Advance for loop");
		for(String temporal : abecedario){
			System.out.println(" - " + temporal);
		}
		
		//Metodo 3: Iterator
		System.out.println("Iterator: ");
		java.util.Iterator<String> i = abecedario.iterator();
		while(i.hasNext()){
			System.out.println(" - " + i.next());
		}
		
		//Metodo 4: While
		System.out.println("While");
		int j = 0;
		while(j < abecedario.size()){
			System.out.println(" - " + abecedario.get(j));
			j++;
		}
		
	}
}
