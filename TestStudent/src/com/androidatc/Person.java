package com.androidatc;

public class Person {
	private String name;
	
	public Person(String name) {
		this.name = name;
	}
	
	public void print(){
		System.out.println("Mi nombre es " + this.name);
	}
}
