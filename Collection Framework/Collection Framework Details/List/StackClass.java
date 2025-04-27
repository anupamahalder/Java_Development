import java.util.List;
import java.util.Stack;

public class StackClass{
    public static void main(String[] args) {
        // Creating object of List interface
        Stack<Integer> stack = new Stack<>();

        // Add elements to stack 
        stack.push(23);
        stack.push(45);
        stack.push(39);
        stack.push(27);

        // print stack 
        System.out.println(stack); // [23, 45, 39, 27]

        // Get the peek/top element of the stack
        System.out.println(stack.peek()); // 27

        // remove top element of stack 
        stack.pop();
        System.out.println(stack); // [23, 45, 39]

        // remove all elements from stack 
        stack.clear();
        System.out.println(stack); // []

        // checking stack is empty or not 
        System.out.println(stack.empty()); // true
    }
}
