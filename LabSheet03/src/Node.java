
public class Node {
	public Object data; // Object = รองรับข้อมูลทุกรูปแบบ
	public Node next;
	
	public Node (Object data) { // Constructor
		this.data = data;
		this.next = null;
	}
	
	public String getAddress() {
		return "" + Integer.toHexString(System.identityHashCode(this));
	 }
	
	 // Method for returning the pointer address of node
	 public static String getAddress(Node node) {
		 return (node == null) ? "null" : node.getAddress();
	 }
}
