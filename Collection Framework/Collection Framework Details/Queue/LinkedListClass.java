import java.util.LinkedList;
import java.util.Queue;

public class LinkedListClass{
    public static void main(String[] args) {
        // Creating object of Queue interface
        Queue<Integer> queue = new LinkedList<>();

        // Add elements
        queue.offer(45);
        queue.offer(33);
        queue.offer(61);
        queue.offer(56);
        queue.offer(33);
        queue.add(15); // can throw exception

        // print queue
        System.out.println(queue);  // [45, 33, 61, 56, 33, 15]

        // remove element (Front element will be removed)
        System.out.println(queue.remove()); // 45
        System.out.println(queue); // [33, 61, 56, 33, 15]
        // remove first element/ front element of queue
        System.out.println(queue.poll()); // 33

        // get the head/front element
        System.out.println(queue.element()); // 61
        System.out.println(queue); // [61, 56, 33, 15]

        // remove all elements
        queue.clear(); // As LinkedList also implements List
        System.out.println(queue); // []
    }
}
