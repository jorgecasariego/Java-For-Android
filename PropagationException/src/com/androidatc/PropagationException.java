package com.androidatc;

public class PropagationException {
	public void metodo1() {
		this.metodo2();
		System.out.println("Despues de completarse el metodo2");
		
		//Agregando un try - catch
//		try {
//			this.metodo2();
//			System.out.println("Despues de completarse el metodo2");
//		} catch (Exception e) {
//			// TODO: handle exception
//			System.out.println(e.getMessage());
//		}
	}
	
	public void metodo2() {
		this.metodo3();
		System.out.println("Despues de completarse el metodo3");
	}
	
	public void metodo3() {
		this.metodo4();
		System.out.println("Despues de completarse el metodo4");
	}
	
	public void metodo4() {
		int a = 7;
		int b = 0;
		int c = a/b;
	}
}
