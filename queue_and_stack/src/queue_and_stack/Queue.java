package queue_and_stack;

import java.util.Arrays;

public class Queue extends Bag {
	
	/**
	 * @post | result != null
	 * 
	 * @creates | result
	 */
	public int[] getElements() { throw new RuntimeException("Not yet implemented"); }
	
	/**
	 * @post | getElements().length == 0
	 */
	public Queue() { throw new RuntimeException("Not yet implemented"); }
	
	/**
	 * @post | Arrays.equals(getElements(), 0, getElements().length - 1, old(getElements()), 0, old(getElements()).length)
	 * @post | getElements()[old(getElements()).length] == value
	 */
	public void put(int value) { throw new RuntimeException("Not yet implemented"); }
	
	/**
	 * @pre | getElements().length > 0
	 * @post | Arrays.equals(getElements(), 0, getElements().length, old(getElements()), 1, old(getElements()).length)
	 */
	public int take() { throw new RuntimeException("Not yet implemented"); }

}
