package edu.rcc;

public class RobotController implements BasicMovement, Position {

	private Robot robot;
	
	public RobotController(Robot robot) {
		this.robot = robot;
	}

	@Override
	public int getXPosition() {
		return robot.getXPosition();
	}

	@Override
	public int getYPosition() {
		return robot.getYPosition();
	}

	@Override
	public boolean moveNorth() {
		
		if(robot.facingNorth()) {
			robot.moveForward();
		} else if (robot.facingSouth()) {
			robot.moveBackward();
		} else if (robot.facingEast()) {
			robot.turnLeft();
			robot.moveForward();
		} else { //robot.facingWest()
			robot.turnRight();
			robot.moveForward();
		}
		return true;
	}

	@Override
	public boolean moveSouth() {
		if(robot.facingNorth()) {
			robot.moveBackward();
		} else if (robot.facingSouth()) {
			robot.moveForward();
		} else if (robot.facingEast()) {
			robot.turnRight();
			robot.moveForward();
		} else { //robot.facingWest()
			robot.turnLeft();
			robot.moveForward();
		}
		return true;
	}

	@Override
	public boolean moveWest() {
		if(robot.facingNorth()) {
			robot.turnLeft();
			robot.moveForward();
		} else if (robot.facingSouth()) {
			robot.turnRight();
			robot.moveForward();
		} else if (robot.facingEast()) {
			robot.moveBackward();
		} else { //robot.facingWest()
			robot.moveForward();
		}
		return true;
	}

	@Override
	public boolean moveEast() {
		if(robot.facingNorth()) {
			robot.turnRight();
			robot.moveForward();
		} else if (robot.facingSouth()) {
			robot.turnLeft();
			robot.moveForward();
		} else if (robot.facingEast()) {
			robot.moveForward();
		} else { //robot.facingWest()
			robot.moveBackward();
		}
		return true;
	}
	
	

}
