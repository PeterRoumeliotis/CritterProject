/*
Critter (Interface)
Peter Roumeliotis
11/17/21
Bird class to be implemented to Critter in order to create the Bird critter 
on the screen using a char and providing where it moves
*/


package CritterProject;

public class Bird implements Critter{
	
	//gets character for the critter
	public char getChar() {
		
		return 'B';
		
	}
	
	//gets move for the critter
	public int getMove(CritterInfo info) {
		
		//creates random number
		int rand = (int)((Math.random()*4)+1);
		
		//moves depending on what random direction was chosen
		if(rand == 1)
			return NORTH;
		if(rand == 2)
			return EAST;
		if(rand == 3)
			return SOUTH;
		else
			return WEST;
		
	}
	
}
