// R7 Assignment
// Author: Aaron Leal
// Date:   Sep 22, 2015
// Class:  CS160
// Email:  aleal96@rams.colostate.edu
public class R7 {
	public static boolean and(boolean b0, boolean b1) {
		return b0 && b1;
	    // add code here
	}

	public static boolean or(boolean b0, boolean b1) {
		return b0 || b1;
	    // add code here
	}

	public static boolean xor(boolean b0, boolean b1) {
		return b0 != b1 ;
	    
	}

	public static boolean nand(boolean b0, boolean b1) {
		return !(b0 && b1);
	    
	}

	public static boolean nor(boolean b0, boolean b1) {
		return !(b0 || b1);
	}

	public static boolean special(boolean b0, boolean b1) {
	    return !(b0 && b1) != (b0 || b1) ;
	}

	public static void printHeader(String logicalOperatorName) {
	    System.out.printf("b0" + "\t" + "b1" + "\t" +  "b0 " + logicalOperatorName + " b1");
	}

	public static void printRow(boolean b0, boolean b1, boolean result) {
	  System.out.printf("\n" + b0 + "\t" + b1 + "\t" + result + "\n");
	}

	public static void main(String[] args) {

	    // Print truth table (AND)
	    printHeader("AND");
	    printRow(true, true, and(true,true));
	    printRow(true, false, and(true,false));
	    printRow(false, true, and(false,true));
	    printRow(false, false, and(false,false));
		
	    // add code here

	}

}
