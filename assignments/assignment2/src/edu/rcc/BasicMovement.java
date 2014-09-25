package edu.rcc;

public interface BasicMovement {
	/**
	 * attempts to move north if able
	 * @return true it could move there, false if path is blocked
	 */
	public boolean moveNorth();
	public boolean moveSouth();
	public boolean moveWest();
	public boolean moveEast();
}
