package throwsImplementation;

class Program {

	public static void main(String[] args) throws Exception {
		B obj = new B();
		obj.m1();
		
	}
	
}

class B{
	void m1() throws InsufficientFundsException  { //or throws Exception because Exception is the superclass
		throw new InsufficientFundsException(); 
	}
	
}

class InsufficientFundsException extends Exception{}
