package com.androidatc;

public class TestHierarchyException {
	public static void main(String[] args) {
		ExceptionHierarchyDemo e = new ExceptionHierarchyDemo();
		e.division(10, 0);
	}
	
	/**
	 * A tener en cuenta que si usamos el ejemplo de la división con double
	 * y no con int no nos saltará ninguna exception ya que los enteros en java
	 * no soportan valores para +/-infinito, NaN, y no permiten división por 0, 
	 * mientras que float y double si tienen esos valores especiales
	 * 
	 * Si quieren mas información ir al siguiente link:
	 * http://en.wikipedia.org/wiki/IEEE_floating_point
	 * 
	 * - Division by zero (an operation on finite operands gives an exact infinite 
	 *   result, e.g., 1/0 or log(0)) (returns ±infinity by default).
	 */
}
