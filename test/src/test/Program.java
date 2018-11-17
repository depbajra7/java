package test;

public class Program {

	public static void main(String[] args) {
		int a = 10;
		int b= 0;
		int[] array1 = new int[2];
		
		try {
			System.out.println(a/b);
			System.out.println(array1[3]);
		}
		catch(ArithmeticException E){
		System.out.println("arithmetic catch");
		}
		
		catch(ArrayIndexOutOfBoundsException E){
			System.out.println("array catch");
		}
		
		System.out.println("program complete");
}
}
