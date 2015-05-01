package com.androidatc;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args){
		ArrayList<String> abecedario = new ArrayList<String>();
		
		abecedario.add("A");
		abecedario.add("B");
		abecedario.add("C");
		abecedario.add("D");
		abecedario.add("E");
		
		System.out.println("Abecedario es " + abecedario);
		
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
	}
}
