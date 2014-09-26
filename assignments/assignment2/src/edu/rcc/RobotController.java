package edu.rcc;

public class RobotController implements BasicMovement, Position {

	private Robot robot;
	
	public RobotController(Robot robot) {
		this.robot = robot;
	}
	
	@Override
	public boolean moveNorth() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean moveSouth() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean moveWest() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean moveEast() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getXPosition() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getYPosition() {
		// TODO Auto-generated method stub
		return 0;
	}

}
