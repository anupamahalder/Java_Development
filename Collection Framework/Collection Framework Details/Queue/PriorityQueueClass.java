import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueClass{
    public static void main(String[] args) {
        // Creating object of Queue interface
        PriorityQueue<Integer> pq = new PriorityQueue<>(); // Min heap

        // Add elements
        pq.offer(12);
        pq.offer(39);
        pq.offer(4);
        pq.offer(7);
        pq.add(10);

        // print priority queue (first element always be smallest)
        System.out.println(pq); // [4, 7, 12, 39, 10]

        System.out.println(pq.peek()); // 4

        // Remove element
        pq.remove();
        System.out.println(pq); // [7, 10, 12, 39]
        System.out.println(pq.peek()); // 7

        
        // remove all elements
        pq.clear();
        System.out.println(pq); // []


        // Create another PriorityQueue to get max heap (Maximum element will be in the peek element)
        PriorityQueue<Integer> pqr = new PriorityQueue<>(Comparator.reverseOrder());

        // add elements 
        pqr.add(3);
        pqr.offer(7);
        pqr.offer(12);
        pqr.offer(8);
        pqr.offer(10);

        // get first(peek) element 
        System.out.println(pqr.peek()); // 12
        System.out.println(pqr); // [12, 10, 7, 3, 8]

        // remove first(peek) element 
        System.out.println(pqr.remove()); // 12
        System.out.println(pqr); // [10, 8, 7, 3]
        System.out.println(pqr.peek()); // 10

    }
}
