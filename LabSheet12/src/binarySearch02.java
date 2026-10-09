import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class binarySearch02 {

    public static void main(String[] args) {
        LinkedList<Integer> nums = random_initial();

        // นำข้อมูลใน nums มาเรียงลำดับ
        Collections.sort(nums);

        System.out.print("After sorting: : ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();

        Scanner input = new Scanner(System.in);
        System.out.print("Enter target: ");
        int target = input.nextInt();

        int index = binarySearch(nums, target);

        if (index != -1) {
            System.out.println("The target (" + target + ") at index " + index);
        } else {
            System.err.println("Cannot found " + target + " in this linked list");
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

    public static int binarySearch(LinkedList<Integer> nums, int target) {
		int low = 0;
		int high = nums.size()-1;
		while (nums.get(low) < nums.get(high)) {
			int middle = (low + high)/2;
			if (nums.get(middle)==target) {
				return middle;
			} else if (target<nums.get(middle)) {
				high = middle-1;
			} else {
				low = middle+1;
			}
		}
		
		return -1;
	}


}
