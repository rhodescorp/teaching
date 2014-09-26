package edu.rcc;

public interface BasicMovement {
	/**
	 * attempts to move north if able
	 * note for assignment 2, ignore the return type, you will
	 * need it when we add obstacles in assignment 3
	 * @return true it could move there, false if path is blocked
	 */
	public boolean moveNorth();
	public boolean moveSouth();
	public boolean moveWest();
	public boolean moveEast();
}
