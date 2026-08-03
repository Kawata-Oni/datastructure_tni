public class QueueArrayBased {
	
	// attributes in Queue Array-Based
	private int[] queue;
	private final int MAX_SIZE = 50;
	private int size;
	
	// create an empty queue with default capacity
	public QueueArrayBased() {
		queue = new int[MAX_SIZE];
		size = 0;  // no element in queue
	}
	
	// create an empty queue with a specific capacity
	public QueueArrayBased(int capacity) {
		queue = new int[capacity];
		size = 0;  // no element in queue
	}
	
	public boolean isEmpty() {

		return false;
	}
	
	public boolean isFull() {

		return false;
	}
	
	public boolean enqueue(int new_element) {

		return false;
	}
	
	public int peek() {

		return -1;
	}

	public int dequeue() {

		return -1;
	}
}