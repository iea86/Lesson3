package by.epam.javabasic25.classes;

import java.util.Scanner;

public class L3T14 {
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int number = 0;
	
	System.out.print("Enter number: ");
		if (sc.hasNextInt()) {
		number = sc.nextInt();
		getAnEven (number);	
			
	}
	}
	
	private static void getAnEven (int number) {
		int digit = 0;
	
		while (number != 0) {
			digit = number % 10;
			number = number / 10;
			if (digit % 2 == 0) {
			System.out.println("There is an even number.");
			return;
	     }
			
	   }
		System.out.println("There is no an even number.");
	}
	
	
}