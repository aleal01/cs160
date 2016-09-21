// R9 Assignment
// Author: Aaron Leal
import java.awt.im.InputContext;
// Date:   Oct 1, 2015
// Class:  CS160
// Email:  aleal96@rams.colostate.edu
import java.util.Scanner;
public class R9 {
	public static void reverseString(String s) {
		for (int i =s.length()-1; i >= 0; i--) {            
            System.out.print(s.charAt(i));    
    }
		System.out.println();
}

	public static void printAscii(char start, char end) {
	    for (char i = start; i<= end; i++){
	    	System.out.print(i);
	    }
	}

	public static int computeFactorial(int num) {
		int factorial = 1;
        
        int i = 1;
        while(i <= num)
        {
            factorial *= i;
            i++;
        }
        return factorial;
	}

	public static void areWeThereYet(Scanner keyboard) {
	    String Input = "";
		do {
	    	System.out.println("\nAre we there yet?");
	    	Input= keyboard.next(); 
	}
	    while (!Input.equalsIgnoreCase("yes"));
	 
	    	System.out.println("\nFinally!");
	}
	public static void main(String[] args) {
	
	}

}
