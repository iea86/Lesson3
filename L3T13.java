package by.epam.javabasic25.classes;

import java.util.Scanner;

public class L3T13 {
	
	   
	    public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		int number = 0;
		int poslZifra;
	
		System.out.print("Enter the number: ");
		if (sc.hasNextInt()) {
		number = sc.nextInt();
		}
		poslZifra = number % 10;
		getposlZifraKv(poslZifra);
				
		}
		
		private static void getposlZifraKv(int poslZifra) {
			
			int poslZifraKv = 0;	
			
			switch (poslZifra) {
			case 0:
			poslZifraKv = 0;
			break;
			case 1:
			poslZifraKv = 1;
			break;
			case 2:		
			poslZifraKv = 4;
			break;
			case 3:
			poslZifraKv = 9;
			break;
			case 4:
			poslZifraKv = 6;
			break;
			case 5:
			poslZifraKv = 5;
			break;
			case 6:
			poslZifraKv = 6;
			break;
			case 7:
			poslZifraKv = 9;
			break;
			case 8:
			poslZifraKv = 4;
			break;
			case 9:
			poslZifraKv = 1;
			break;
			default:
			System.out.println("Smth wrong with program");
			
			} 

			System.out.println("The last number of number's square = " + poslZifraKv );
		} 
} 
			
					
		

		
		
