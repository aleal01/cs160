//R6 Assignment
//Author: Aaron Leal
//Date: Sep 17, 2015
//Class: CS 160
//Email: aleal96@rams.colostate.edu
import java.util.Scanner;

public class R6 {


	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);

		// Here we print a welcome message
		System.out.println("Welcome to a simple calculator program!");
		System.out.println("---------------------------------------");
		System.out.println("All we know how to do is add, subtract, multiply, divide, and compute modulo.");
		System.out.println("This is Version 2: which you can use exponents.");
		System.out.println();

		// Here we get input from the user
		System.out.print("Please enter a the first number of your calculation: ");
		double firstnum = keyboard.nextDouble();

		System.out.print("Please enter the operator (+|-|*|/|%|^): ");
		String operation = keyboard.next();
		// ADD: get operator using Scanner object

		System.out.print("Please enter a the second number of your calculation: ");
		double secnum = keyboard.nextDouble();
		// ADD: get the second number use the Scanner object
		
		// Here we will calculate the result:
		double result = 0.0;
		// ADD: write a switch statement that will calculate
		String error1 = "null";
		if (secnum == 0 && operation == "/" )
		error1 = "Undefined";
		
		
		switch (operation)
		{
			case "+":
				result = (firstnum + secnum);
				break;
			case "-":
				result = (firstnum - secnum);
				break;
			case "*":
				result = (firstnum * secnum);
				break;
			case "/":
				result = (firstnum / secnum);
				break;
			case "%":
				result = (firstnum % secnum);
				break;
			case "^":
				result = (Math.pow(firstnum,secnum));
				break;
			default:
				 result = 0;
				break;
		}
		// the correct result.


		// Here we will print the result
		System.out.println("---------------------------------------");
		// ADD: print the answer to the calculation using the
		if (result == 0){
			System.out.println("Error please try again!");
		}else if (error1 == "undefined"){
			System.out.println("Undefined");
		}else
			System.out.printf( "Result: "+ "%.2f\n", result);
		
		// so it looks like: "2.44 - 1.44 = 1.00"
		System.out.println("---------------------------------------");
		
		
		
		

	}

}