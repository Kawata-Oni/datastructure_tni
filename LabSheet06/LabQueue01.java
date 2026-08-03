import java.util.ArrayDeque;
import java.util.Queue;

public class LabQueue01 {
    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<>();

        for (int i = 101; i < 106; i++) {
            System.out.println("Enqueue: " + i);
            q.add(i);
        }

        System.out.println("Queue => " + q.toString());

        while (!q.isEmpty()) {
            System.out.println("\nCalling number: " + q.peek());
            System.out.println("Providing service number: " + q.remove());
        }

        System.out.println("\nQueue => " + q.toString());
    }
}
