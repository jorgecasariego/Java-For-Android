package com.androidatc;

public class Vehiculo implements IVehiculo{
	// Creando propiedades
	int velocidad = 0;
	int cambio = 1;
	
	// Creando un constructor que inicializa velocidad en 0 y cambio en 1
	public Vehiculo() {
		velocidad = 0;
		cambio = 1;
	}
	
	//Sobre cargamos el constructor de Vehiculo
	public Vehiculo(int velocidad, int cambio){
		this.velocidad = velocidad;
		this.cambio = cambio;
	}
	
	
	void imprimir(){
		System.out.println("Velocidad: " + getVelocidad() + " con cambio: " + getCambio());
	}

	// Creando getters y setters
	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public int getCambio() {
		return cambio;
	}

	public void setCambio(int cambio) {
		this.cambio = cambio;
	}
	
	public void aumentarVelocidadTurbo(int nuevaVelocidad){
		setVelocidad(nuevaVelocidad * 2);
	}
}
