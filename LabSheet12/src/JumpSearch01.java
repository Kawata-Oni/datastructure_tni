import java.util.Scanner;

public class JumpSearch01 {

	public static void main(String[] args) {
		int[] nums = sorting(new int[] {96, 87, 18, 6, 31, 11, 56, 36, 76});
		
		for (int num : nums) {
			System.out.print(num + " ");
		}
		
		Scanner input = new Scanner(System.in);
		System.out.print("\nInput Target : ");
		int target = input.nextInt();
		
		int index = jumpSearch(nums, target);
		
		if (index != -1) {
			System.out.print("\nThe target " + target + " at index " + index);
		} else {
			System.err.print("\nCannot found " + target + " in this array");
		}

	}
	
	public static int[] sorting(int[] nums) {
		Sorting sort = new Sorting(nums);
		sort.bubbleSort();
		return sort.getArray();
	}
	
	public static int jumpSearch(int[] nums, int target) {
		int jump_size = (int) Math.floor(Math.sqrt(nums.length)); // หารูท->ปัดค่าลง->แปลงเป็น int
		int start = 0;
		int m = 0;
		
		while (m < nums.length-1) {
			if (nums[m]==target) {
				return m;
			} else if (nums[m]<target) {
				start = m;
				m += jump_size;
			} else {
				for (int i=start; i<m; i++) {
					if (nums[i]==target) {
						return i;
				}
			}
				return -1;
			}
		} // end while
		
		for (int i=start; i<nums.length; i++) {
				if (nums[i]==target) {
					return i;
				}
		}
		return -1;
	}
}
	
