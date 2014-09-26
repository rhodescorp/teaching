package edu.rcc;

public class Robot implements Position{
	
	private int x, y;
	
	private Direction direction;
	
	private enum Direction {
		North,
		West,
		South,
		East
	}
	
	public Robot() {
		this.x = 0;
		this.y = 0;
		this.direction = Direction.North;
	}
	
	public Robot(int x, int y) {
		this.x = x;
		this.y = y;
		this.direction = Direction.North;
	}
	
	public void turnLeft() {
		if (direction == Direction.North) {
			direction = Direction.West;
		} else if (direction == Direction.West) {
			direction = Direction.South;
		} else if (direction == Direction.South) {
			direction = Direction.East;
		} else { //direction == direction.East
			direction = Direction.North;
		}
	}
	
	public void turnRight() {
		if (direction == Direction.North) {
			direction = Direction.East;
		} else if (direction == Direction.West) {
			direction = Direction.North;
		} else if (direction == Direction.South) {
			direction = Direction.West;
		} else { //direction == direction.East
			direction = Direction.South;
		}
	}
	
	public void moveForward() {
		if (direction == Direction.North) {
			++y;
		} else if (direction == Direction.West) {
			--x;
		} else if (direction == Direction.South) {
			--y;
		} else { //direction == direction.East
			++x;
		}
	}
	
	public void moveBackward() {
		if (direction == Direction.North) {
			--y;
		} else if (direction == Direction.West) {
			++x;
		} else if (direction == Direction.South) {
			++y;
		} else { //direction == direction.East
			--x;
		}
	}
	
	public boolean facingNorth() {
		/*
		if (direction == Direction.North) {
			return true;
		} 
		return false;
		*/
		return direction == Direction.North;
	}
	
	public boolean facingSouth() {
		return direction == Direction.South;
	}
	
	public boolean facingEast() {
		return direction == Direction.East;
	}
	
	public boolean facingWest() {
		return direction == Direction.West;
	}
	
	@Override
	public int getXPosition() {
		return this.x;
	}

	@Override
	public int getYPosition() {
		return this.y;
	}
}
