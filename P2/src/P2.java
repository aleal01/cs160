//P2 Assignment
//Author: Aaron Leal
//Date: Sep 2, 2015
//Class: CS 160
//Email: aleal96@rams.colostate.edu
public class P2 {

	public static void main(String[] args) {
	
		byte b0 = 32;
		short s0 = 15477;
		int i0 = 664422;
		long l0 = 3984759871l;
		float f0 = 8.112f;
		double d0 = 56.4444;
		char c0 = '&';
		char c1 = 'S';
		char c2 = '5';
		//int c0int = ((int) c0 - 3);
		// Claiming as integer
		//char c02 = (char) c0int;
		// reclaiming as a character
		//int c1int = ((int) c1 - 3);
		//claiming as integer
		//char c12 = (char) c1int;
		//re-claiming as char
		//int c2int = ((int) c2 - 3);
		//char c22 = (char) c2int;
		String st0 = "Computer";
		String st1 = "Science";
		String st2 = "Excellent";
		
		 String output = "" + b0 + ":" + s0 + ":" + i0 + ":" + l0;
		System.out.println(output);
		//printing strings for a reason unknown yet
		System.out.println(f0 + "," + d0);
		// easier way of printing that gets the job done
		System.out.println((b0+s0+i0+l0)/99999);
		System.out.printf("%.3f\n", Math.sqrt(f0+d0));
		System.out.printf("%.5f\n", b0/f0);
		System.out.println( c0 + "=" + c1 + "=" + c2);
		c0-= 3;
		c1-= 3;
		c2-= 3;
		System.out.println(c0 + "~" + c1 + "~" + c2);
		//System.out.println( c02 + "~" + c12 + "~" + c22);
		System.out.println( st0 + " " + st1 + " " + "is" + " " + st2 + "!");
		System.out.println(st0.length() + "," + st1.length() + "," + st2.length());
		System.out.println(st2.toUpperCase());
		System.out.println(st0.substring(2,7));
		System.out.println(st1.indexOf("e"));
		System.out.println(st0.charAt(3));
		
		
		
	
	
	}
	

}
