package com.androidatc;

public class StackOverflow {
	public void metodo1(){
		metodo2();
	}
	
	public void metodo2(){
		metodo1();
	}
}
