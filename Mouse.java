/*
Critter (Interface)
Peter Roumeliotis
11/17/21
Mouse class to be implemented to Critter in order to create the Mouse critter 
on the screen using a char and providing where it moves
*/

package CritterProject;

public class Mouse implements Critter {

	private int count = 0;
	
	//gets character for the critter
	public char getChar() {
		
		return 'M';
		
	}
	
	//moves the critter west and then north repeatedly
	public int getMove(CritterInfo info) {
		
		count++;
		if(count == 2)
			count = 0;
		
		if(count == 1)
			return WEST;
		else
			return NORTH;
		
	}
	
}
