/*
Critter (Interface)
Peter Roumeliotis
11/17/21
Wolf class to be implemented to Critter in order to create the Wolf critter 
on the screen using a char and providing where it moves
*/

package CritterProject;

public class Wolf implements Critter {

	private int count = 0;
	
	//gets character for the critter 
	public char getChar() {
		
		return 'W';
		
	}
	
	//moves 3 times North and then 2 times South
	public int getMove(CritterInfo info) {
		
	count++;
	if(count == 6) {
		
		count = 0;
		
	}
		
		if(count < 4) {
		
			return NORTH;
	
		}
	
	
		else {
		
			return SOUTH;
			
		}
		
	
	}

	
}
