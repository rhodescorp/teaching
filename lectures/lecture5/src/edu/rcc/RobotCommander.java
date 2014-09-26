package edu.rcc;

public class RobotCommander implements AdvancedMovement {

	private RobotController rc;

	public RobotCommander(RobotController rc) {
		this.rc = rc;
	}
	

	@Override
	public void moveTo(int x, int y) {
		int startX = rc.getXPosition();
		int startY = rc.getYPosition();
		int xDifference = startX - x;
		int yDifference = startY - y;
		if (xDifference > 0) {
			for (int i = 0; i < xDifference; ++i) {
				rc.moveWest();
			}
		} else if (xDifference < 0) {
			for (int i = 0; i > xDifference; --i) {
				rc.moveEast();
			}
		}
		
		if (yDifference > 0) {
			for (int i = 0; i < yDifference; ++i) {
				rc.moveSouth();
			}
		} else if (yDifference < 0) {
			for (int i = 0; i > yDifference; --i) {
				rc.moveNorth();
			}
		}
		
		
	}
	

}
