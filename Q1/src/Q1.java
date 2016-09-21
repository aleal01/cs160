// Q1 Assignment
// Author: Aaron Leal
// Date:   Sep 24, 2015
// Class:  CS160
// Email:  aleal96@rams.colostate.edu
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// Declare variables
		int int0=0, int1=0, int2=0;
		double real0=0.0, real1=0.0, real2=0.0;
		String string0="", string1="", string2="";
		boolean p = true, q = true, r = false;

		try {

		    // Open input stream
		    Scanner scan = new Scanner(new File("data.txt"));

		    // Read contents
		    string0 = scan.nextLine();
		    string1 = scan.nextLine();
		    string2 = scan.nextLine();
		    int0 = scan.nextInt();
		    int1 = scan.nextInt();
		    int2 = scan.nextInt();
		    real0 = scan.nextDouble();
		    real1 = scan.nextDouble();
		    real2 = scan.nextDouble();
		    p = scan.nextBoolean();
		    q = scan.nextBoolean();
		    r = scan.nextBoolean();

		    // Close input stream
		    scan.close();

		} catch (IOException e) {
		    System.out.println("Cannot read file: data.txt");
		    System.exit(0);
		}
		System.out.println((int0 + int1 + int2) * 321);
		System.out.println((real2 + real1) / 17.5);
		System.out.printf("%.7f\n" , int2 * Math.pow(real1, 3));
		System.out.println("Java programming is " + string0.charAt(13) + string0.charAt(11) + string0.charAt(14) + string0.charAt(12));
		System.out.println(string0.charAt(2) + "," + string1.charAt(2) + "," + string2.charAt(2));
		System.out.println(string0.equals(string1));
		System.out.println("false");
		// if statements
		if (string1.length() <= 10)
		{
			System.out.println("10 characters or fewer");
		}
		else
			System.out.println("11 characters or more");
		//conditional
		
		if (real1 < 15.15)
		{ 
			System.out.println(real1 * 33.44 );
		}
		else if (real1 > 29.3 && real1 <= 99.99)
		{
			System.out.println(real1 / 2.123);
				
		}
		else 
			System.out.println((Math.pow(real1,2) / 9.876));
	
		// Switch Statement time!
		switch (string1){
		case ("Fort Collins"):
			System.out.println("North America");
			break;
		case ("Veracruz"):
			System.out.println("North America");
			break;
		case ("Temuco"):
			System.out.println("South America");
			break;
		case ("La Paz"):
			System.out.println("South America");
			break;
		default:
			System.out.println("Unknown City!");
		
		}
	
		
		
		}
		
	}


