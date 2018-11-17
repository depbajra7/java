package polymorphicBehaviour;

public class First {
	public static void main(String[] args) {
		
		
		 First obj = new Second();
		 obj.m1();
		//obj.m2();
		
		
		
		
		
		
				
	}
	
	void m1() {
		System.out.println("Inside class First, method m1");
		
	}
	
	void m2() {
		System.out.println("Inside class First, method m2");
	}
}

