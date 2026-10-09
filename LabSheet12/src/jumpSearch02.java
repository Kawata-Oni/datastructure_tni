import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class jumpSearch02 {

    public static void main(String[] args) {
        // สร้าง LinkedList ชื่อ nums และกำหนดค่าเริ่มต้นจาก random_initial()
        LinkedList<Integer> nums = random_initial();

        // นำข้อมูลใน nums มาเรียงลำดับจาก น้อย -> มาก
        Collections.sort(nums);

        System.out.print("After sorting: : ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();

        Scanner input = new Scanner(System.in);
        System.out.print("Enter target: ");
        int target = input.nextInt();

        int index = jumpSearch(nums, target);

        if (index != -1) {
            System.out.println("The target (" + target + ") at index " + index);
        } else {
            System.err.println("Cannot found " + target + " in this linked list");
        }
    }

    public static LinkedList<Integer> random_initial() {
        Random rnd = new Random();
        LinkedList<Integer> nums = new LinkedList<>();

        for (int i = 0; i < 10; i++) {
            nums.add(rnd.nextInt(100)); // สุ่มตัวเลขช่วง 0 - 99
        }

        return nums;
    }

    public static int jumpSearch(LinkedList<Integer> nums, int target) {
        int jump_size = (int) Math.floor(Math.sqrt(nums.size())); // หารูท->ปัดค่าลง->แปลงเป็น int
        int start = 0;
        int m = 0;

        while (m < nums.size() - 1) {
            if (nums.get(m) == target) {
                return m;
            } else if (nums.get(m) < target) {
                start = m;
                m += jump_size;
            } else {
                for (int i = start; i < m; i++) {
                    if (nums.get(i) == target) {
                        return i;
                    }
                }
                return -1;
            }
        } // end while

        for (int i = start; i < nums.size(); i++) {
            if (nums.get(i) == target) {
                return i;
            }
        }
        return -1;
    }
}