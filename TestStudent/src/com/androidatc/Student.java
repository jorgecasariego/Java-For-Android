package com.androidatc;

public class Student extends Person{
	int mark;
	
	public Student(String name, int mark) {
		super(name);
		
		this.mark = mark;
	}
	
	@Override
	public void print() {
		super.print();
		System.out.println("Mi puntaje es " + this.mark);
	}
}
