package org.base;

public class ClassB {

	public static void main(String[] args) {
	
	A a = new A();
		
		int ans = a.add(10, 20);
	
		if(ans==50) {
System.out.println("valid");	

		}
		else {
			
			System.out.println("invalid");
		}

}
}