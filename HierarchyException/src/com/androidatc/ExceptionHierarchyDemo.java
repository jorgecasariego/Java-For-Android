package com.androidatc;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionHierarchyDemo {
	public int division(int a, int b) {
		int c = 0;
		
		try {
			c = a/b;
			FileReader fr = new FileReader("Test");
		} catch(ArithmeticException e) {
			// Las excepciones especificas debemos declarar antes
			// o sino siempre se ejecutaría "Exception"
			System.out.println(e.getMessage());
			
		} 
		catch(FileNotFoundException f) {
			System.out.println(f.getMessage());
		}
		catch (Exception e) {
			// En ultimo caso declarar Exception por si no se cumplen
			// ninguna de las excepciones anteriores
		}
		
		return c;
	}
}
