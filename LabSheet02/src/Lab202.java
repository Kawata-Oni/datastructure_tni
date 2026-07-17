import java.util.ArrayList;
import java.util.Scanner;

public class Lab202 {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		int[] initial_numbers = {10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
		
		// 1 ====================================================================
		for (int i=0; i<initial_numbers.length; i++) {
			numbers.add(initial_numbers[i]);
		}
		// System.out.println("Current numbers = " + numbers.toString());
		
		// 2 ====================================================================
		Scanner scan = new Scanner(System.in);
		System.out.print("Add number: ");
		int new_num = scan.nextInt();
		numbers.add(new_num);
		// System.out.println("Current numbers = " + numbers.toString());
		
		// 3 ====================================================================
		System.out.print("Add number: ");
		new_num = scan.nextInt();
		numbers.set(8,new_num);
		// System.out.println("Current numbers = " + numbers.toString());
		
		// 4 ====================================================================
		System.out.println("Delete number: index 3 ");
		numbers.remove(3);
		// System.out.println("Current numbers = " + numbers.toString());
		
		// 5 ====================================================================
		System.out.println("Update number: index 3 ");
		numbers.add(3,10);
		
		// 6 ====================================================================
		System.out.println("Current numbers = " + numbers.toString());
	}
}
