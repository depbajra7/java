package polymorphicBehaviour;


public class Second extends First {
	
	public int a;
	
	/*void m1() {
		System.out.println("Inside class Second, method m1");
	}*/
	
	void m2(){
		super.m1();
		System.out.println("inside class Second, method m2");
		
	} 
}

