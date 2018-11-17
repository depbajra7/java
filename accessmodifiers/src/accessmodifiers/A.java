package accessmodifiers;

public class A {

	public static void main(String[] args) {
		B.m1();
		B obj = new B();
		obj.m2();
		
		C obj2 = new C();
		obj2.m2();
		
		C.m1();
		
		obj2.m4();
		
		

	}

}

	class B {
	
		static void m1() {
			System.out.println("Inside m1");
		}
		
		public void m2() {
			System.out.println("Inside m2");
		}
		
		protected void m3() {
			System.out.println("Inside m3");
		}
}

	
	class C extends B {
		
		 void m4() {
			System.out.println("inside C, m4");
			
			m3();
			
			
		}
	}
	
	