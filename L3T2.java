package by.epam.javabasic25.classes;

import java.util.Scanner;

public class L3T2 {
	public static void main (String[] args) {
		double r = 0, f = 0;
		Scanner x = new Scanner(System.in);
		
		System.out.print("Enter x:");
		
		if (x.hasNextDouble()) {
			r = x.nextDouble();
			if (r > 3 ) {
				 f = 1 /(r*r +1);		
				
			} else {if (r<= -3) {
				f = 9;
			}
		}
				
     }
	
		System.out.print("f= " + f);	
}
}
