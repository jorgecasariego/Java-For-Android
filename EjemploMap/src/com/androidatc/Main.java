package com.androidatc;

import java.util.HashMap;
import java.util.Iterator;

public class Main {
	public static void main(String[] args){
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(0, "valor1");
		map.put(1, "valor2");
		map.put(2, "valor3");
		map.put(3, "valor4");
		System.out.println("Valores del map: " + map);
		
		map.remove(2);
		System.out.println("Despues de remover el  valor con key = 2: " + map);
		
		//Iterando sobre un map
		//En este caso keySet retorna todo el conjunto de claves de la colección
		Iterator<Integer> i = map.keySet().iterator();
		while(i.hasNext()){
			Integer key = (Integer) i.next();
			System.out.println("Clave: "+key+"  ---> Valor: " + map.get(key));
		}
	}
}
