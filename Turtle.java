/*
Critter (Interface)
Peter Roumeliotis
11/17/21
Turtle class to be implemented to Critter in order to create the Turtle critter 
on the screen using a char and providing where it moves
*/

package CritterProject;

public class Turtle implements Critter {
	
	private int count = 0;
	
	//gets character for the critter
	public char getChar() {
		
		return 'T';
		
	}
	
	//moves the critter 5 times South, 5 times West, 5 times North, 5 times East
	public int getMove(CritterInfo info) {
		
	count++;
	if(count == 21) {
		
		count = 1;
		
	}
		
		if(count < 6) {
		
			return SOUTH;
	
		}
	
		if(count <= 10 && count >= 6) {
		
			return WEST;
		
		}
	
		if(count <= 15 && count > 10) {
		
			return NORTH;
		}
	
		else {
		
			return EAST;
		
		}
	
	}

}

