package com.androidatc;

public class Principal {
	public static void main(String[] args){
		Vehiculo ferrari = new Vehiculo();
		
		//ferrari.cambio = 2;
		//ferrari.velocidad = 120;
		
		ferrari.imprimir();
		
		//Utilizando getters y setters
		ferrari.setCambio(3);
		ferrari.setVelocidad(50);
		System.out.println("Vehiculo Ferrari");
		ferrari.imprimir();
		
		ferrari.aumentarVelocidadTurbo(50);
		System.out.println("... cambiando a turbo! ");
		ferrari.imprimir();
		
		System.out.println();
		
		//Creamos un tractor
		Tractor fiat = new Tractor(100);
		System.out.println("Tractor Fiat");
		fiat.imprimir();
		
		System.out.println("Aumentando a turbo");
		fiat.aumentarVelocidadTurbo(10);
		fiat.imprimir();
		
		System.out.println();
		
		//Creamos un kia utilizando el constructor sobrecargado
		Vehiculo kia = new Vehiculo(30, 1);
		System.out.println("Kia");
		kia.imprimir();
	}
}
