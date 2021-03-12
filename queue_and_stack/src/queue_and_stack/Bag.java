package queue_and_stack;

import java.util.Arrays;

public class Bag {
	
	/**
	 * @post | result != null
	 * 
	 * @creates | result
	 */
	public int[] getElements() { throw new RuntimeException("Not yet implemented"); }
	
	/**
	 * @post | getElements().length == 0
	 */
	public Bag() { throw new RuntimeException("Not yet implemented"); }
	
	/**
	 * @post | Arrays.equals(getElements(), 0, getElements().length - 1, old(getElements()), 0, old(getElements()).length)
	 * @post | getElements()[old(getElements()).length] == value
	 */
	public void put(int value) { throw new RuntimeException("Not yet implemented"); }
	
	/**
	 * @pre | getElements().length > 0
	 * @post | getElements().length == old(getElements()).length - 1
	 * @post Each elements in the old sequence of elements appears as many times in the new sequence of elements as it did in
	 *       the old sequence of elements, except that the value that is returned appears one less time.
	 *       | Arrays.stream(old(getElements())).allMatch(e ->
	 *       |     Arrays.stream(getElements()).filter(e0 -> e0 == e).count() + (e == result ? 1 : 0) ==
	 *       |     Arrays.stream(old(getElements())).filter(e0 -> e0 == e).count())
	 */
	public int take() { throw new RuntimeException("Not yet implemented"); }

}
