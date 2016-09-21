//R3 Assignment
//Author: Aaron Leal
//Date: Sep 2, 2015
//Class: CS 160
//Email: aleal96@rams.colostate.edu
import java.util.Scanner;

public class R3 {

	private static Scanner number;

	public static void main(String[] args) {
		String myString0 = "Java";
		String myString1 = "Programming";
		String myString2 = "Language";
		
		System.out.println(myString0 + " is a " + myString1 + " " + myString2 + ".");
		System.out.println(myString1.length()+ myString2.length());
		System.out.println(myString1.charAt(1)+ "," + myString1.charAt(3) + "," + myString1.charAt(6));
		System.out.println(myString0.indexOf("a"));
		System.out.println(myString2.toUpperCase());
		System.out.println(myString1.substring(2,8));
	
		//Scanner Reading
		number = new Scanner(System.in);
		int myInteger = 0;
		Double myDouble = 0.0;
	    // if we do not use nextline then it will actually no read any of the spaces
	    
	    System.out.print("Enter an integer: ");
		myInteger = number.nextInt();
		System.out.println("myInteger =" + " " + myInteger);
		System.out.print("Enter a double: ");
		myDouble = number.nextDouble();
		System.out.printf( "myDouble = "+ "%.5f" + "\n", myDouble);
	}


}
