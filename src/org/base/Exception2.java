package org.base;

public class Exception2 {

	public static void main(String[] args) {
		System.out.println("*********************");
	try {
		
	
	
		System.out.println(10/0);
		
		String name = "Mary";
		System.out.println(name.charAt(45));//jdk 1.7 features

	}catch (ArithmeticException |StringIndexOutOfBoundsException m ) {
System.out.println("2 Exception in one catch");
	}

}
}
