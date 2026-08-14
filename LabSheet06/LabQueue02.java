import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;
import java.util.Scanner;

public class LabQueue02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter some message: ");
		String message = input.next();

		System.out.println();
		System.out.println("Check Palindrome by Deque = "
				+ (checkByDeque(message.toLowerCase()) ? "Palindrome" : "Not Palindrome"));
		System.out.println("Check Palindrome by Stack = "
				+ (checkByStack(message.toLowerCase()) ? "Palindrome" : "Not Palindrome"));

	}

	public static boolean checkByDeque(String message) {
		Deque<Character> letters = new ArrayDeque<Character>();

		// เอาตัวอักษรแต่ละตัวยัดลง array
		for (char c : message.toCharArray()) {
        letters.addLast(c);
    	}

		// เอาตัวอักษรแรกกับตัวสุดท้ายมาเทียบกัน (ตอนดึงมาก็ลบไปเลย)
    	while (letters.size() > 1) {
        	char first = letters.removeFirst();
        	char last = letters.removeLast();

        	if (first != last) {
            	return false;
        	}
    	}

    return true;
	}

	public static boolean checkByStack(String message) {
    Queue<Character> queue = new ArrayDeque<Character>();
    Deque<Character> stack = new ArrayDeque<Character>();

    // ยัดตัวอักษรลงทั้ง queue และ stack
    for (char c : message.toCharArray()) {
        queue.add(c);
        stack.push(c);
    }

    // ดึงออกมาเปรียบเทียบทีละคู่ (Queue ใช้ poll() : ได้ตัวแรก, Stack ใช้ pop() : ได้ตัวสุดท้าย)
    while (!queue.isEmpty() && !stack.isEmpty()) {
        char fromQueue = queue.poll();
        char fromStack = stack.pop();

        if (fromQueue != fromStack) {
            return false;
        }
    }

    return true;
	}

}