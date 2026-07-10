import java.util.ArrayList;

public class Ex07 {

	public static void main(String[] args) {
		ArrayList<Integer> numlist = new ArrayList<Integer>();
		
		System.out.println("Lenght = " + numlist.size());
		
		numlist.add(11);
		numlist.add(12);
		numlist.add(13);
		numlist.add(14);
		numlist.add(15);
		
		System.out.println("Lenght after added data = " + numlist.size());
		System.out.println("All element = " + numlist);
		
		// update data
		int update_index = 2;
		int update_element = 20;
		
		numlist.set(update_index, update_element);
		System.out.println("All element after updated data = " + numlist);
		
		// delete data by use index
		numlist.remove(2);
		System.out.println("All element after deleted data = " + numlist);
		
		// delete data by use value
		numlist.remove(Integer.valueOf(14));
		System.out.println("All element after deleted data = " + numlist);
		
		// clear data
		numlist.clear();
		System.out.println("All element after clear data = " + numlist);
		
	}

}
