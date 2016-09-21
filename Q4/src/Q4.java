// Q4 Assignment
// Author: Aaron Leal
// Date:   Oct 29, 2015
// Class:  CS160
// Email:  aleal96@rams.colostate.edu
import java.util.Arrays;

public class Q4 {
	static int[] numbers = {11, 321 , 4716, 6, 32768, 981};
	static double[] decimals = {1.01,2.02,3.03,4.04,5.05};
	static String[] names = {"Computer" , "Science", "is", "challenging!"};
	
	public static void arrayStuff(int[] numbers){
		System.out.println(numbers.length);
		System.out.println(numbers[1]);
		System.out.println(Arrays.toString(numbers));
		numbers[2] = 444;
		System.out.println(Arrays.toString(numbers));
		numbers[numbers.length - 1] = 11111;
		System.out.println(Arrays.toString(numbers));
		numbers[numbers.length - 2] = 24;
		System.out.println(Arrays.toString(numbers));
		
	}
	public static int frequency(double[] dArray , double value){
		int c =0;
		for (int i = 0; i <= dArray.length - 1; i++){
			if (value == dArray[i]){
			c++;
			}
		}
		return c;
	}
	public static double[] squareRoot(int[] iArray){
		double[] sArray = new double[iArray.length];
		for (int i = 0; i <= iArray.length - 1 ; i++){
			sArray[i] = Math.sqrt(iArray[i]);
			}
		
		return sArray;
		}
	
	public static int countChars(String[] sArray){
		String s = Arrays.toString(sArray);
		int i = s.length();
		return i;
	}
	
	
	
	public static void main(String[] args) {
		arrayStuff(numbers);
		System.out.println(frequency(decimals, 1.01));
		System.out.println(Arrays.toString(squareRoot(numbers)));
		System.out.println(countChars(names));
	}

}
