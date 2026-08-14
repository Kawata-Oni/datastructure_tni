import java.util.ArrayDeque;
import java.util.Deque;

public class StackReverse {
	public static void main(String[] args) {
		String original = "Hello World";
		System.out.println("Original => " + original);
		System.out.println("Original => " + reverseCharacter(original));
		
	}
	
	public static String reverseCharacter(String original) { 

        Deque<Character> stack = new ArrayDeque<>(); 

        for (int i = 0; i < original.length(); i++) {
            stack.push(original.charAt(i));
        }

        String reversed = "";
        while (!stack.isEmpty()) {
            reversed = reversed + stack.pop(); // หรือจะใช้ reversed += stack.pop(); ก็ได้ครับ
        }
        
        return reversed;
    }
}
