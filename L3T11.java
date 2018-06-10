package by.epam.javabasic25.classes;

import java.util.Scanner;

public class L3T11 {
	
	public static String min = "";

	public static String max = "";
	
	public static void main(String[] args) {
		int n = 10;
		
		Scanner sc = new Scanner(System.in);
		
		String str = "";
		
		for (int i = 0; i < n; i++) {
		      System.out.print("> ");
		      if (sc.hasNextLine()) {
		            str = sc.nextLine();
		            if (i == 0) {
		            min = str;		           
		            } else {
		            getMaxString (str);	
		            getMinString (str);
		         }
		      }
		}
		
		printResults ();
	}
		                 
		     			
	public static void getMinString (String str)	{
		

		if (str.length() < min.length()) {      

			min = str;     

			}  

	}	
		
    public static void getMaxString (String str)	{

		

		if (str.length() > max.length()) {      

			max = str;     

			}  

	}

			

     public static void printResults () {		

		System.out.println("max string = " + max + " length=" + max.length());   

		System.out.println("min string = " + min + " length=" + min.length());

		  

		} 

	} 



			  

			

