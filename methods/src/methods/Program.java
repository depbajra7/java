package methods;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		
		Scanner scan2 = new Scanner(System.in);
		int number2 = scan2.nextInt();
		
		
		double div = division(number, number2);
		System.out.println(" the division is " + div);
		
		double div2 = division(20,2);
		System.out.println("the division is " + div2);
		
		
		scan.close();
		scan2.close();	
	
	}
	
	public static double division(double a , double b) {
		return(a/b);
	}
	
	
	public static int sum(int a, int b) {
		//body
		int s =  a+b;
		return s;
	}
	
	public static int difference(int a, int b) {
		int d = a-b;
		return d;
	}
	
	public static void product(int x, int y) {
		int prod = x*y;
		System.out.println("the product is "+ prod);
	}
}
