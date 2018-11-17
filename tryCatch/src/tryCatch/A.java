package tryCatch;

public class A {

	public static void main(String[] args) {
		A obj = new A();
		
		try {
		obj.m1();
		}
		
		catch(Exception e) {
			System.out.println("inside catch");
			}
		
		finally {
			System.out.println("finally implemented");
		}

	}
	
	void m1() {
		System.out.println("before m1");
		m2();
		System.out.println("after m1");
	}

	void m2() {
		System.out.println("before m2");
		m3();
		System.out.println("after m2");
	}
	
	void m3() {
		System.out.println("before m3");
		int a = 10;
		int b = 0;
		
		System.out.println(a/b);
		
		
	}
}
