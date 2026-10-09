import java.util.LinkedList;
import java.util.Random;

public final class linearSearch02 {

	public static void main(String[] args) {
		LinkedList<Integer> nums = new LinkedList<Integer>();

	}
	
	public static LinkedList<Integer> random_initial() {
		Random rnd = new Random();
		LinkedList<Integer> nums = new LinkedList<Integer>();
		
		for (int i=0; i<=10; i++) {
			nums.add(rnd.nextInt());
		}
		
		return nums;
	}
	
	public static int linearSearch(int[] nums, int target) {
		return -1;
	}


}
