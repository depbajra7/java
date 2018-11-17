package checkout;

import java.util.Scanner;

public class Program {
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);	
		System.out.println("enter 5 numbers ");
		int f= scan.nextInt();
		int g= scan.nextInt();
		int h = scan.nextInt();
		int i = scan.nextInt();
		int j= scan.nextInt();
		
		double sum = sumOfFiveNumbers(f,g,h,i,j); /*Passed the user entered numbers to the 
												    function called sumOfFiveNumbers and 
												    stored in a variable called sum. Therefore
												    sum now stores the sum of 5 numbers entered
												    by the users. */
		
		double total = calculate(sum);	 /* Passed the sum to the function named 
											calculate for further calculation of discount
											and tax */
		
		System.out.println("the total is " + total);
		scan.close();		
		
		}
		
		
	
	
	
	
	public static double calculate(double tot) {     /* function that calculates the discount 
														and tax */
		double total;
		total = (tot * 90)/100;
		total = (total * 95)/100;
		return total;
	}
	
	
	
	
	public static double sumOfFiveNumbers(int a, int b, int c, int d, int e) {  /* function that adds the 
	 																				entered numbers
																					 */
	
		int[] array1 = new int[] {a,b,c,d,e};
		int sum = 0;
		
		
		for(int i = 0; i<5;i++) {
			sum = sum + array1[i];
		}
			
		return sum;
	}
}
