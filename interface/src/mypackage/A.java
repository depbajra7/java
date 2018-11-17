package mypackage;

public class A {
	public static void main(String[] args) {
		
	}

	
}


interface X  // interfaces are abstract by default, so you cannot create objects for interfaces.
			 // interface is just like an abstract of a paper that summerizes what is written in the paper.
{   
	void m1();  // all the methods in an interface are public
	void m2();
	void m3();
}

class Y implements X //implements same as extends (same functionality)
{
	
	public void m1() {    //methods being overridden.
		//definition
	}
	
	public void m2() {
		//definition
	}
	
	public void m3() {
		//definition
	}
}