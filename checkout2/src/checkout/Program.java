package checkout;

import java.util.Scanner;

public class Program {
	
	static double sum = 0;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Price of 5 items ");
		
		int[] array1 = new int[5];
		
		for (int i = 0; i<5;i++)
		{
			array1[i]= scan.nextInt();
		}
		
		for(int i = 0; i<5;i++) {
			sum = sum + array1[i];
		}
	
		
		System.out.println("the sum is "+ sum);
		double answer = calculate(sum);
		
		System.out.println("the answer is " + answer);
		
		
		scan.close();
		
		
	}
	
	public static double calculate(double tot) {
		double total;
		total = (tot * 90)/100;
		total = (total * 95)/100;
		return total;
	}
	

	
	
	

}
