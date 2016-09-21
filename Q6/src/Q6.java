// Q6 Assignment
// Author: Aaron Leal
// Date:   Dec 8, 2015
// Class:  CS160
// Email:  aleal96@rams.colostate.edu
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Q6 implements QuizInterface {
	public static int numberLines = 0;
	public static int numberChars = 0;
	public static int numberLower = 0;
	public static int numberUpper = 0;
	public static int numberDigits = 0;
	public static String[] fileContents;
	public static double[] testArray = {1.2,2.3,3.4,4.5,5.6,6.7,7.8,8.9};
	@Override
	public void readFile(String filename) {
		// TODO Auto-generated method stub
		try {
			Scanner read = new Scanner (new File(filename));
			numberLines = read.nextInt();
			read.nextLine();
			fileContents = new String[numberLines];
			for(int i = 0; i < numberLines; i ++){
				fileContents[i] = read.nextLine();
			}
			read.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

	@Override
	public void computeStatistics(String[] strings) {
		 for (int i = 0; i < strings.length; i++){
             numberChars += strings[i].length();
		 }
		 //upper
		 for (int i = 0; i < strings.length; i++){
			 for (int j = 0; j < strings[i].length(); j++){
				 if (Character.isLowerCase((strings[i].charAt(j)))){
                     numberLower ++;
			 }
		 }
		 }
		 //lower
		 for (int i = 0; i < strings.length; i++){
			 for (int j = 0; j < strings[i].length(); j++){
				 if (Character.isUpperCase((strings[i].charAt(j)))){
                     numberUpper ++;
			 }
		 }
		 }
		 // digits
		 for (int i = 0; i < strings.length; i++){
             for (int j = 0; j < strings[i].length(); j++){
                      if (Character.isDigit(strings[i].charAt(j))){
                       numberDigits ++;
                  }  
             }
		 }
		
	}

	@Override
	public void printStatistics() {
		// TODO Auto-generated method stub
		System.out.println("Number of lines: " + numberLines);
		System.out.println("Number of characters: " + numberChars);
		System.out.println("Number of uppercase letters: " + numberUpper);
		System.out.println("Number of lowercase letters: " + numberLower);
		System.out.println("Number of digits: " + numberDigits);
	}

	@Override
	public void writeFile(String filename, String[] strings) {
		// TODO Auto-generated method stub
		try {
			PrintWriter writer = new PrintWriter(filename);
			for (int i = 0; i < strings.length; i++){
				writer.println((i + 1) + ": " + strings[i]);
			}
			writer.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public double findSmallest(double[] values) {
		// TODO Auto-generated method stub
		double smallest = values[0];
		for (int i = 0; i < values.length; i ++){
			if(values[i] < smallest){
				smallest = values[i];
			}
		}
		return smallest ;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q6 q6 = new Q6();
	    q6.readFile(args[0]);
	    q6.computeStatistics(fileContents);
	    q6.printStatistics();
	    q6.writeFile(args[1], fileContents);
	        
	    System.out.println("Array = " + Arrays.toString(testArray));
	    System.out.println("Smallest value = " + q6.findSmallest(testArray));
	}
}
