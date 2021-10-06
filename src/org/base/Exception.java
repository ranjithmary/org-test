package org.base;

public class Exception {

	public static void main(String[] args) {
		System.out.println("*******Start***********");
	try {	
		System.out.println(10/2);
		try {
		String name = "Welcome";
		System.out.println(name.charAt(31));
		
		 }catch (StringIndexOutOfBoundsException e) {
			
		System.out.println("StringIndexOutOfBoundsException");
		}finally {
		}	System.out.println(" 1 finally");
	}catch(ArithmeticException e) {
System.out.println("ArithmeticException");	
}finally {
	System.out.println("finally");
}
	}
}



