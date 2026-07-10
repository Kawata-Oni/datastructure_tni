
public class ArrayController {
	// attribute =======================================================
	private int[] nums;
	// constructor =====================================================
	public ArrayController( ) {
		nums = new int[] {23, 67, 8, 91, 45, 12, 78};
	}
	// method ==========================================================
	public void setNums(int[] nums) {
		this.nums = nums;
	}
	public int[] getNums() {
		return nums;
	}
	public int getSize() {
		return nums.length;
	}
	public void display(String message) {
		System.out.println(message);
		for (int i=0; i<nums.length; i++) {
			if (i!=0) {
				System.out.print(", ");
			}
			System.out.print(nums[i]);
		}
	}

}
