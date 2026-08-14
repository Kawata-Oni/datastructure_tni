import java.util.ArrayList;

public class ListReverse {

	public static void main(String[] args) {
		ArrayList<Integer> original = new ArrayList<Integer>();
		for (int i = 11; i<=20; i++) {
			original.add(i);
		}
		System.out.println("Original Sequence: " + original);
		System.out.println("Reverse Sequence: " + reverseList(original));
	}

	public static ArrayList<Integer> reverseList(ArrayList<Integer> original) {
		ArrayList<Integer> reverse = new ArrayList<Integer>();
		while (!original.isEmpty()) {
			reverse.addLast(original.removeLast());
		}
		return reverse;
	}
}
