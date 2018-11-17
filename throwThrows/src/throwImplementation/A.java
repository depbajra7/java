package throwImplementation;

class A {

	public static void main(String[] args) {
		A obj = new A();
		
		try {
		obj.m1();
		}
		catch(Exception e) {
			System.out.println("Inside catch");
		}
	}
	
	
	void m1() {
		throw new ArithmeticException();
	}
	
	
}





