

// R5 Assignment
// Author: Aaron Leal
// Date:   Sep 15, 2015
// Class:  CS160
// Email:  aleal96@rams.colostate.edu
import java.util.Scanner;

public class R5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Scanner keyboard = new Scanner(System.in);
		//System.out.print("Please enter your age: ");
		//int age = keyboard.nextInt();
		
		
	/*	
		boolean canDrive = false;
		double age = 0;

		if (age >= 18) 
		{
			canDrive = true;
		}	


		if (canDrive)
		{
			System.out.println("According to our records, you can legally drive a car in the USA.");
		}
		else
		{
			System.out.println("According to our records, you are prohibited from driving a car in the USA.");
		}

		System.out.println("End of program.");
		
		// We need to initialize the variable to get the code to work.
		
		
		
		
		if (age  >= 22);
		{
			
			System.out.println("You can legally buy and consume alcohol in the USA.");
			System.out.println("Can legally drive a car in the USA.");
		}
		
		if (age >= 21) 
		{
			System.out.println("You can legally buy and consume alcohol in the USA.");
		}
		else if (age >= 18)
		{
			System.out.println("Can legally drive a car in the USA.");
		}	
		else if (age <= 18);
		{
			System.out.println("You're under 18 years old.");
		}

		
		// We can rewrite this by adding it the the age that is more than or equal to 21.
		// Rewrite it on the same line
		
		
		if ( (age > 11) && (age < 20) ) // the extra parentheses help readability, but aren't necessary...
		{
			System.out.println("You are a teenager!");
		}
		else if (age > 100 || age < 2) // ...as demonstrated here
		{
			System.out.println("You are either Gandalf or learning to walk.");
		}	
		else 
		{
			System.out.println("I have nothing interesting to say.");
		}

		System.out.println("End of program.");
	*/	
		
		
//Bonus 	
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Please enter a full name: ");
		String fullName = keyboard.nextLine().toLowerCase();
		System.out.print("Is the person happy? (y/n): ");
		char happyAnswer = keyboard.next().toLowerCase().charAt(0);
		boolean isHappy = (happyAnswer == 'y');

		if ( fullName.equals("chris wilcox") && isHappy)
		{
			System.out.println("Looks like Chris had his chai from the Alley Cat!");
		} 
		else if (fullName.equals("chris wilcox")&& !isHappy)	
		{
			System.out.println("Chris needs to visit the Alley Cat to get his chai fix!!");
		} 
		else if (fullName.equals(" ") && !isHappy && isHappy);
		{
			System.out.println("I do not recogize that name, is it your mom?");
			
		}


		keyboard.close();
		System.out.println("End of program.");
		
		
		
		
		
		
		
	}

}
