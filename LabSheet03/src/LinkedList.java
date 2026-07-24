
public class LinkedList {
	private Node head;
	
	public LinkedList() {
		this.head = null; // empty linked list
	}
	
	public String traversal() {
		Node current_node = head; // set current node starts at head
		String result = "[";
		boolean first_node = true;
		while (current_node != null) {
			result += (!first_node ? ", " : "") + current_node.data;
			current_node = current_node.next; // move to the next node
			first_node = false;
		}
		result += "]";
		return result;
	}
	
	// insert แบบแทรก
	public void insert (int position, Object value) {
		Node new_node = new Node(value);
		if (head == null ) {
			head = new_node;
		} else if (position == 0) {
			new_node.next = head;
			head = new_node;
		} else {
			Node current_node = head;
			int current_position = 0;
			while (current_node != null && current_position < position-1) {
				// node นั้นมีข้อมูล และ node นั้นยังอยู่ใน linked list
				current_node = current_node.next; // ขยับตำแหน่งของ node
				current_position++;
			}
			new_node.next = current_node.next; // เอาอันใหม่ไปเชื่อมอันต่อไป
			current_node.next = new_node; // เอาอันเดิมมาเชื่อมอันใหม่
		}
	}
	
	// insert แบบต่อหลัง
	public void insert(Object value) {
		Node new_node = new Node(value);
		if(head == null ) {
			head = new_node;
		} else {
			Node current_node = head;
			while (current_node.next != null) {
				current_node = current_node.next;
			}
			current_node.next = new_node;
		}
	}
	
	public void remove(int position) {
		if (position == 0) {
			Node current_node = head;
			head = current_node.next;
		} else {
			Node current_node = head;
			int current_position = 0;
			while (current_node.next != null && current_position < position - 1) {
				current_node = current_node.next; // ขยับตำแหน่งของ node
				current_position++;
			}
			current_node.next = current_node.next.next;
		}
	}
	
	public void removeLastElement() {
		if (head != null) {
			if (head.next == null) {	// if linked list has only 1 node
				head = null;			// set to empty linked list
			} else {
				Node current_node = head;
				while (current_node.next.next != null) {
					current_node = current_node.next;
				}
				current_node.next = null;
			}
		}
	}
	
	public int length() {
		int length_node = 0;
		Node current_node = head;

		while (current_node != null) {
			current_node = current_node.next;	
			length_node++;
		}
		return length_node;
	}
	
	public Object get(int position) {
		Node current_node = head;
		int current_position = 0;

		while (current_position != position) {
			current_node = current_node.next;
			current_position++;
		}

		return current_node.data;
	}
	
	public void set(int position, Object value) {
		Node current_node = head;
		int current_position = 0;

		while (current_node != null) {
			if (current_position == position) {
				current_node.data = value;
			}

			current_position++;
			current_node = current_node.next;
		}

		
	}
	
	public void clear() {
		head = null;
	}
}
