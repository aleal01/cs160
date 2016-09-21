

// R8 Assignment
// Author: Aaron Leal
// Date:   Sep 29, 2015
// Class:  CS160
// Email:  aleal96@rams.colostate.edu

import java.io.File;
import java.util.Scanner;
public class R8 {

	public static double computeTax(double amount, double rate){
		return amount * rate;
	}
	public static double computeTip(double amount, double rate){
		return amount * rate;
	}
	
	public static void main(String[] args) {
		// Declare variables
		String restaurantName;
		String serverName;
		double subtotal;
		double tax;
		double total;
		double taxRate = 0.05;
		double tipRate1 = 0.10;
		double tipRate2 = 0.15;
		double tipRate3 = 0.20;
				
		// Ask and receive input from the user
		Scanner scan = new Scanner(System.in);
		System.out.print("Name of Restaurant: ");
		restaurantName = scan.nextLine();
		System.out.print("Server Name: ");
		serverName = scan.nextLine();
		System.out.print("Cost of the bill: ");
		subtotal = scan.nextDouble();
				
		// Perform calculations
		tax = computeTax(subtotal, taxRate);
		total = tax + subtotal;
		
		
		
		
				
		// Print receipt
		System.out.println("=====================================");
		System.out.println(restaurantName);
		System.out.println("Your server was: " + serverName.substring(0, serverName.indexOf(" ")).toUpperCase());
		System.out.printf("Subtotal: $%.2f\n", subtotal);
		System.out.printf("Tax: $%.2f\n", tax);
		System.out.println("=====================================");
		System.out.printf("Total: $%.2f\n", total);
		System.out.println();
		System.out.println("Suggested tips: ");
		System.out.printf("10%%: $%.2f\n", computeTip(total, tipRate1));
		System.out.printf("15%%: $%.2f\n", computeTip(total, tipRate2));
		System.out.printf("20%%: $%.2f\n", computeTip(total, tipRate3));
		System.out.println();
		System.out.println("Thank you!");
		System.out.println("=====================================");




		
		
		
		
		
		
	}

}
