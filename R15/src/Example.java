
// R15 Assignment
// Author: Aaron Leal
// Date:   Nov 3, 2015
// Class:  CS160
// Email:  aleal96@rams.colostate.edu

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		
		try {
			Scanner fileReader = new Scanner(new File(args[0]));
			String example1a = fileReader.next();
			System.out.println(example1a);
			String example1b = fileReader.nextLine();
			double example2 = fileReader.nextDouble();
			int example3 = fileReader.nextInt();
			System.out.println(example3);
			char example4 = fileReader.next().charAt(0);
			System.out.println(example4);
			
			if (fileReader.hasNext()) {
				// I can grab a string token safely
				String example5 = fileReader.next();
				System.out.println(example5);
			}
			
			if (fileReader.hasNextDouble()) {
				// I can grab a double safely
				double example6 = fileReader.nextDouble();
				System.out.println(example6);
			}
			
			if (fileReader.hasNextInt()) {
				// I can grab a int safely
				int example7 = fileReader.nextInt();
			}
			
			fileReader.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("ERROR!");
			System.exit(0);
		}
		try {
			// make sure TA explains this line and the try/catch block
			PrintWriter fileOutput = new PrintWriter(new File(args[1]));
			
			// Examples:
			fileOutput.println("Hey...");
			fileOutput.print("I've seen...");
			fileOutput.print("this stuff before.\n");
			fileOutput.printf("%.3f\n", 3.456789);
			
			// Important! Save the file
			fileOutput.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("ERROR!");
			System.exit(0);
		}

	}

}
