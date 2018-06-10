package by.epam.javabasic25.classes;

import java.util.Scanner;

public class L3T12 {


		public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int year = 0, month = 0;
		
		System.out.print("Enter Year: ");
		
		if (sc.hasNextInt()) {
		
		year = sc.nextInt();
		
		}
		
		System.out.print("Enter Month: ");
		
		if (sc.hasNextInt()) {
		
		month = sc.nextInt();
		
		}		
				
		getNumberOfDays(year,month);		
		
		}

		private static void getNumberOfDays(int year, int month) {
			
		
			int NumberOfDays = 0;
		
			switch (month) {
		
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				NumberOfDays = 31;
		
				break;
		
				case 2:
				if (year % 4 == 0) {
				NumberOfDays = 29;
				} else {
				NumberOfDays = 28;
				}
				break;
				case 4:
				case 6:
				case 9:
				case 11:
				NumberOfDays = 30;
				break;
				}
		
			
System.out.println("Number of Days in that month and year - " + NumberOfDays);

}

}	
