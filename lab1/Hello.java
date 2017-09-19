/*
The following program is for Network Programming - lab 1 
Author: eric strong

*/

import static System.out;
import java.util.Scanner;

public class Hello{
	public static Scanner scan = new Scanner(System.in);

	public static void main(String [] args){
	
	switch(args){
		case "1": helloWorld();break;
		case "2": sum();break;
		case "3": compare(); break;
		default: out.print("Not a valid option"); break;


	}//end switch
	
	}//end main

	
	public static void helloWorld(){
		out.println("Hello World!");
	}//end helloWorld

	public static void sum(){

	out.println("Enter First Number: ");
	int num1 = scan.nextInt();
	out.println("Enter Second Number: ");
	int num2 = scan.nextInt(); 

	out.println("The sum of " + num1 + " and " + num2 + " = " + (num1 + num2));

	}//end sum

	public static void compare(){

		out.println("Enter First Number: ");
		int num1 = scan.nextInt();
		out.println("Enter Second Number: ");
		int num2 = scan.nextInt(); 

		if(num1 == num2){
			out.println("The numbers are the same");
		}	
	
		else if(num1 != num2){
			out.println("The numbers are not the same");
		}	

		else if(num1 < num2){
			out.println("num1 is less than num2");
		}	

		else if(num1 > num2){
			out.println("num1 is Greater than num2");
		}	

		else {
			out.println("both numbers are not integers");
		}		
		
	}
	
}//end class	