package test2;
import java.util.Scanner;

public class program {

	public static void main(String[] args) {
		int a;
		String[] names = new String[20];
		System.out.println("How many? ");
		
		Scanner scan = new Scanner(System.in);
		a = scan.nextInt();
		scan.close();
		
		Scanner scan2 = new Scanner(System.in);
		
		for(int i = 0; i <= a; i ++) {
			System.out.println("enter the name of Person # "+ i);
			names[i]= scan2.next();
		}

		scan2.close();
	}
	
	

}
