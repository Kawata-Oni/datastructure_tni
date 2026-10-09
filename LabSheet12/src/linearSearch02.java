import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public final class linearSearch02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		LinkedList<Integer> nums = new LinkedList<Integer>();
		nums = random_initial();
		System.out.println("Generated Linked List: " + nums.toString());

		System.out.print("Enter target: ");
		int target = scan.nextInt();
		
		int index = linearSearch(nums, target);
		
		if (index != -1) {
			System.out.print("\nThe target " + target + " at index " + index);
		} else {
			System.err.print("\nCannot found " + target + " in this array");
		}
	}
	
	public static LinkedList<Integer> random_initial() {
		Random rnd = new Random();
		LinkedList<Integer> nums = new LinkedList<Integer>();
		
		for (int i=0; i<10; i++) {
			nums.add(rnd.nextInt(100)); // 0-99
		}
		
		return nums;
	}
	
	public static int linearSearch(LinkedList<Integer> nums, int target) {
		for (int i = 0; i < nums.size(); i++) {
			if (nums.get(i) == target) {
				return i;
			}
		}
		return -1;
	}


}
