package queue_and_stack;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class QueueStackTest {

	void testBehavesLikeQueue(Queue queue) {
		queue.put(10);
		queue.put(20);
		assertEquals(10, queue.take());
		assertEquals(20, queue.take());
	}
	
	@Test
	void test() {
		testBehavesLikeQueue(new Queue());
		
		//testBehavesLikeQueue(new Stack());
	}

}
