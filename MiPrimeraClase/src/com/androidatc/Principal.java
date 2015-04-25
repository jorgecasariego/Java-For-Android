package com.androidatc;

public class Principal {
	public static void main(String[] args){
		Vehiculo ferrari = new Vehiculo();
		
		ferrari.cambio = 2;
		ferrari.velocidad = 120;
		
		ferrari.imprimirPropiedades();
	}
}
