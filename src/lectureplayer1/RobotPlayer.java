// Packages
package lectureplayer1;

// Imports
import battlecode.common.*;

// Clase RobotPlayer
public class RobotPlayer {
		
	static Direction movingDirection = Direction.EAST;
		
	public static void run(RobotController rc){
		while(true){
			try {
				if (rc.isBuildReady()){
					if (rc.canMove(Direction.EAST)){
						rc.move(Direction.EAST);
					}
				}
			} catch (GameActionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		}
	}
}
