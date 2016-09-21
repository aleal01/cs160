// P6 Assignment
// Author: Aaron Leal
// Date:   Oct 6, 2015
// Class:  CS160
// Email:  aleal96@rams.colostate.edu

public class P6 {

	// Class variables
	public static Maze maze;
	public static int mazeWidth;
	public static int mazeHeight;

	public static void main(String[] args) {

		// Create maze
		String fileName = args[0];
		System.err.println("Maze name: " + fileName);

		// Get dimensions
		maze = new Maze(fileName);
		mazeWidth = maze.getWidth();
		mazeHeight = maze.getHeight();
		System.err.println("Maze width: " + mazeWidth);
		System.err.println("Maze height: " + mazeHeight);

		//  Add code to move around maze
		maze.moveUp();
		maze.moveUp();
		maze.moveUp();
	}
}	
