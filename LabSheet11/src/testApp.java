
public class testApp {

	public static void main(String[] args) {
		
		System.out.println("Bubble Sort Test");
		int[] num1 = {11, 9, 23, 87, 38, 22, 92, 10};
		Sorting sort1 = new Sorting(num1);
		
		sort1.bubbleSort();
		sort1.printSortedData();
		
		System.out.println("\nSelection Sort Test");
		int[] num2 = {25, 11, 45, 6, 87, 20, 78, 64};
		Sorting sort2 = new Sorting(num2);
		
		sort2.selectionSort();
		sort2.printSortedData();
		
		System.out.println("\nInsertion Sort Test");
		int[] num3 = {68, 10, 87, 75, 14, 36, 98, 76};
		Sorting sort3 = new Sorting(num3);
		
		sort3.insertionSort();
		sort3.printSortedData();
		
		System.out.println("\nQuick Sort Test");
		int[] num4 = {87, 11, 26, 35, 49, 85, 21, 46};
		Sorting sort4 = new Sorting(num4);
		
		sort4.quickSort();
		sort4.printSortedData();


	}

}
