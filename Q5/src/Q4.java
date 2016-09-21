//Q5 Assignment
//Author: Aaron Leal
//Date: Dec 8, 2015
//Class: CS 160
//Email: aleal96@rams.colostate.edu
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Q5 implements QuizInterface{
    public static int numberLines = 0;
    public static int numberChars = 0;
    public static int numberLetters = 0;
    public static int numberDigits = 0;
    public static String[] fileContents;
    public static double[] testArray = {92.2, 45.9, 16.4, 31.2, 67.8, 95.0, 71.1};
   
    @Override
    public void readFile(String filename) {
                   // TODO Auto-generated method stub
                   try {
                                  Scanner read = new Scanner (new File(filename));
                                 
                                  numberLines = read.nextInt();
                                  read.nextLine();
                                  fileContents = new String[numberLines];
                                 
                                  for (int i = 0; i < numberLines; i++){
                                                 fileContents[i] = read.nextLine();
                                  }
                                  read.close();
                                 
                   } catch (FileNotFoundException e) {
                                  // TODO Auto-generated catch block
                                  System.out.println("WRONG");
                                  e.printStackTrace();
                   }
    }

    @Override
    public void computeStatistics(String[] strings) {
                   // TODO Auto-generated method stub
                   for (int i = 0; i < strings.length; i++){
                                  numberChars += strings[i].length();
                   }
                  
                   for (int i = 0; i < strings.length; i++){
                                  for (int j = 0; j < strings[i].length(); j++){
                                                 if (Character.isLetter(strings[i].charAt(j))){
                                                                numberLetters ++;
                                                 }
                                  }                                           
                   }
                  
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
                   System.out.println("Number of characters: " +numberChars);
                   System.out.println("Number of letters: " +numberLetters);
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
    public double findLargest(double[] values) {
                   // TODO Auto-generated method stub
                   double smallest = values[0];
                   for (int i = 0; i < values.length; i++){
                                  if (values[i] < smallest){
                                                 smallest = values[i];
                                  }
                   }
                   return smallest;
    }
   
   
    public static void main(String[] args) {
                   // TODO Auto-generated method stub
                   Q5 q = new Q5();
q.readFile(args[0]);
q.computeStatistics(fileContents);
q.printStatistics();
q.writeFile(args[1], fileContents);
   
System.out.println("Array = " + Arrays.toString(testArray));
System.out.println("Largest value = " + q.findLargest(testArray));
    }
}