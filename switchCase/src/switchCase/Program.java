package switchCase;

import java.util.Scanner;

public class Program {
	

	public static void main(String[] args) {
		int i;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Grade");
		i = scan.nextInt();
		
		switch(i) {
		case 60: {
			System.out.println("D");
			break;	
		}
		
		case 70: {
			System.out.println("C");
			break;
		}
		
		default: System.out.println("invalid entry");
		}
		scan.close();
	}
}
