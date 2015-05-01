package com.androidatc;

public class TestPropagation {
	public static void main(String[] args) {
		PropagationException p = new PropagationException();
		p.metodo1();
		System.out.println("Despues de completarse el metodo 1");
	}
}
