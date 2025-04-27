import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeClass{
    public static void main(String[] args) {
        // Creating object of Queue interface
        Deque<Integer> adq = new ArrayDeque<>(); // Doubly LinkedList

        // Add elements
        adq.offer(10);
        adq.offer(20);
        adq.offer(30);
        adq.offer(40);

        // print queue
        System.out.println(adq);  // [10, 20, 30, 40]

        // Add element in the first
        adq.offerFirst(0);

        // Add element in the last
        adq.offerLast(50);

        System.out.println(adq); // [0, 10, 20, 30, 40, 50]

        // remove element (Front element will be removed)
        adq.poll();
        System.out.println(adq); // [10, 20, 30, 40, 50]

        // Remove first element
        System.out.println(adq.pollFirst()); // 10
        System.out.println(adq); // [20, 30, 40, 50]

        // Remove last element
        System.out.println(adq.pollLast()); // 50
        System.out.println(adq); // [20, 30, 40]

        
        // remove all elements
        adq.clear();
        System.out.println(adq); // []
    }
}
