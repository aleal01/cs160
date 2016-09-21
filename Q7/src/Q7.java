
// Q7 Assignment
// Author: Aaron Leal
// Date:   Dec 10, 2015
// Class:  CS160
// Email:  aleal96@rams.colostate.edu
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;


public class Q7 implements QuizInterface {
	public static String[] myTokens;
	public static double[] myDoubles = new double[8];//eight elements

	@Override
	public void readFile(String filename) {
		try {
			Scanner read = new Scanner (new File(filename));
			int temp = read.nextInt();
			myTokens = new String[temp];
			read.nextLine();
			for (int i = 0; i < myTokens.length; i++){
				 myTokens[i]= read.next();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public int charFrequency(String[] strings, char match) {
		int count = 0;
		for (int i = 0; i < strings.length; i++){
			for (int j = 0; j < strings[i].length(); j++){
				if (match == strings[i].charAt(j)){
					count++;
				}
			}
		}
		return count;
	}

	@Override
	public void initializeArray(double[] values) {
		// TODO Auto-generated method stub
		for (int i = 0; i < values.length; i++){
			values[i] = i * i * i;
	}
	}

	@Override
	public double sumRange(double[] values, int low, int high) {
		double sum = 0;
		for (int i = low; i <= high; i++){
			sum += values[i]; 
		}
		return sum;
	}
	
	public static void main(String[] args) {
		 	Q7 q7 = new Q7();
	        q7.readFile(args[0]);
	        System.out.println("Number of Tokens: " + myTokens.length);
	        int frequency = q7.charFrequency(myTokens, 'e');
	        System.out.println("Character Frequency " + frequency); 
	        q7.initializeArray(myDoubles);
	        System.out.println("Array: " + Arrays.toString(myDoubles));
	        double sum = q7.sumRange(myDoubles, 3, 6);
	        System.out.println("Sum: " + sum); 

	}
}
