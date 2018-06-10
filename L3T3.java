package by.epam.javabasic25.classes;

import java.util.Scanner;

public class L3T3 {
	public static void main (String[] args) {
		int a = 0, b = 360, r = 0;
		double f = 0;
		Scanner x = new Scanner(System.in);
		
		System.out.print("Enter x (should be > 0):");
		
		
		if (x.hasNextInt()) {
			r = x.nextInt();
			if (r > a) {
				System.out.print("-------------------------\n");
				System.out.print("x       f\n");
				System.out.print("-------------------------\n");
            
				for (int i = r; i < b+1; i++) {
				
					f = 2 * Math.tan(i/2) +1;
					System.out.print(i  + "      "+f+"\n");
					
				}
			}
			
			
		}
				
     }
	
}
