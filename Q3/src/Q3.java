// Q2 Assignment
// Author: Aaron Leal
// Date:   Oct 15, 2015
// Class:  CS160
// Email:  aleal96@rams.colostate.edu
public class Q3 {
	private double pi = 3.1416;
	private String state = "Colorado";
	
	
	public String getState(){
		return state;
		
	}
	Double answer = 0.0;
	public Double calculateQuadratic(double a, double b, double c, double x){
		answer = (a * (x * x) + (b * x) + (c));
		
		return answer;
	}
	double average = 0.0;
	public double calculateAverage(double value0, double value1, double value2){
		average = (value0 + value1 + value2) / 3; 
		
		return average;
	}
	double area = 0.0;
	public  double areaOfCircle(double d){
		area = pi * ((d / 2.0) * (d / 2.0));
		return area;
	}
	
	
	public static void main(String[] args) {
		Q3 q3 = new Q3();
		System.out.println(q3.getState());
		System.out.println(q3.calculateQuadratic(5,7,4,2.0));
		System.out.println(q3.calculateAverage(14.32,37.65,68.98));
		System.out.println(q3.areaOfCircle(9.2));
		
		
	}

}
