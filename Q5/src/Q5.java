import java.util.Arrays;

// Q5 Assignment
// Author: Aaron Leal
// Date:   Dec 1, 2015
// Class:  CS160
// Email:  aleal96@rams.colostate.edu
public class Q5 {

	public static void main(String[] args) {
		QuizInterface quiz = new QuizClass();
		// bug in encode
		quiz.EncodeString("abcdefghijklmnopqrstuvwxyz123456789");	
		// bug in decode
		quiz.DecodeString("%and&andNothing");
		//bug in sum
		String[] sArray = {"7", "&^%#&@$()@&()*@&%)(*%^)@^" , "1234567"};
		System.out.println(Arrays.toString(quiz.sumAscii(sArray)));
		quiz.sumAscii(sArray);
		//bug in quadruple
		double[] quadruple = {-0.5,-2.0,-1.0};
		quiz.quadrupleArray(quadruple);
		System.out.println(Arrays.toString(quadruple));
		//bug in multiply

	}

}
