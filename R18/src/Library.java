import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.Arrays;
import java.util.Scanner;

// R18 Assignment
// Author: Aaron Leal
// Date:   Nov 17, 2015
// Class:  CS160
// Email:  aleal96@rams.colostate.edu
public class Library {
	public static Music arrayTitles[];
	public static void readLibrary(String inputFile) {
		try {
			Scanner scan = new Scanner(new File(inputFile));
			int titles = scan.nextInt();
			scan.nextLine();
			arrayTitles = new Music[titles];
			for (int i = 0; i < titles; i++){
				arrayTitles[i] = new Music(scan.nextLine() , scan.nextLine() , scan.nextLine() , scan.nextInt());
				scan.nextLine();
			}
		} catch (FileNotFoundException e) {
			System.out.println("Error");
		}
		
	}
	
	 public static void writeLibrary(String outputFile) {
		try {
			PrintWriter print = new PrintWriter(new File(outputFile));
			double tot = 0;
			int num = 1;
			for (int i = 0; i < arrayTitles.length; i ++ ){
				print.println(num+ ":" + arrayTitles[i].toString());
				tot+= arrayTitles[i].getPrice();
				num++;
			}
			print.printf("Total Cost: $%.2f", tot);
			print.close();
		} catch (FileNotFoundException e) {
			System.out.println("Error");
		}
	 }
	 
		public static void searchTitles(String search) {
				double tot = 0;
				int num = 1;
				for (int i = 0; i < arrayTitles.length; i ++ ){
					if (arrayTitles[i].toString().contains(search)){
						System.out.println(num + ":" + arrayTitles[i].toString());
						tot+=arrayTitles[i].getPrice();
						num++;
					}
				}
				System.out.printf("Total Cost: $%.2f", tot);
			}
		 public static void sortTitles(){
			 double tot = 0.0;
			 int num = 1;
			 for (char letter = 'A'; letter <= 'Z' ; letter++ ){
				 for (int i = 0; i < arrayTitles.length; i++){
					 if (arrayTitles[i].getTitle().charAt(0) == letter){
						 System.out.println(num + ":" + arrayTitles[i].toString());
						 tot+=arrayTitles[i].getPrice();
						 num++;
					 }
				 }
			 }
			 System.out.printf("Total Cost: $%.2f", tot);
		 }
		
		
		public static void main(String[] args){
		}
}
		
		
	

			
			
				
			
		
	
	  
	
