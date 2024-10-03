/*
Critter (Interface)
Peter Roumeliotis
11/17/21
Frog class to be implemented to Critter in order to create the Frog critter 
on the screen using a char and providing where it moves
*/

package CritterProject;

public class Frog implements Critter {
	
	//initializes counter
	private int count = 0;
	
	//initializes random number
	private int rand = 0;
	
	//gets character for the critter
	public char getChar() {
		
		return 'F';
		
	}
	
	//moves in a single random direction 3 times
	public int getMove(CritterInfo info) {
		
		//when counter = 0 changes random number
		if(count == 0) {
			
			rand = (int)((Math.random()*4)+1);
			
		}
		
		count++;
		
		//resets counter when it is equal to 0 so the random number can regenerate
		if(count == 3)
			count = 0;
			if(rand == 1) {
				return NORTH;
			}
			if(rand == 2) {
				return EAST;
			}
			if(rand == 3) {
				return SOUTH;
			}
			else {
				return WEST;
			}
		
	}
	
}