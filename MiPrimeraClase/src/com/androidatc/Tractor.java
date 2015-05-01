package com.androidatc;

public class Tractor extends Vehiculo{
	int peso;
	
	public Tractor(int peso){
		//Con this referenciamos las variables de la clase
		this.peso = peso;
	}
	
	//Sobreescribimos el metodo imprimir
	@Override
	void imprimir() {
		super.imprimir();
		System.out.println("Peso es " + peso);
	}
	
}
