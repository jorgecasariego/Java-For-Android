package com.androidatc;

public class Vehiculo {
	int velocidad = 0;
	int cambio = 1;
	
	void cambiar(int nuevoCambio){
		cambio = nuevoCambio;
	}
	
	void aumentarVelocidad(int nuevaVelocidad){
		velocidad = velocidad + nuevaVelocidad;
	}
	
	void imprimirPropiedades(){
		System.out.println("Velocidad: " + velocidad + " con cambio: " + cambio);
	}
}
