package second;

import first.A;

public class B extends A {
	
	public static void main(String[] args) {
		B obj = new B(); // only possible to access the method through subclass object if in a different package.
		obj.m1();
	
	}

	void m2() {
		System.out.println("inside class B m2");
		
		
	}
	
	
}
