/*
Real-World Example of Multithreading in Java
Use Case: Online Food Ordering System 🍕🍔

In a food delivery app, multiple tasks happen simultaneously, such as:

- Order Processing 🛒
- Payment Processing 💳
- Delivery Tracking 🚚
We can use multithreading to handle these tasks efficiently.

How This Code Covers Multithreading Concepts
✅ Parallel Execution → Order, Payment, and Delivery run simultaneously.
✅ Thread.sleep() → Simulates real-world delays in processing.
✅ Thread.join() → Ensures all tasks complete before exiting.
✅ Independent Tasks → Each task runs separately, avoiding blocking.
*/

// Order Processing Thread
class OrderProcessing extends Thread {
    public void run() {
        System.out.println("Order received. Processing order...");
        try {
            Thread.sleep(2000); // Simulating order processing delay
        } catch (InterruptedException e) {
            System.out.println("Order processing interrupted.");
        }
        System.out.println("Order processed successfully!");
    }
}

// Payment Processing Thread
class PaymentProcessing extends Thread {
    public void run() {
        System.out.println("Payment started...");
        try {
            Thread.sleep(1500); // Simulating payment delay
        } catch (InterruptedException e) {
            System.out.println("Payment interrupted.");
        }
        System.out.println("Payment completed successfully!");
    }
}

// Delivery Tracking Thread
class DeliveryTracking extends Thread {
    public void run() {
        System.out.println("Delivery started. Tracking order...");
        try {
            Thread.sleep(3000); // Simulating delivery process
        } catch (InterruptedException e) {
            System.out.println("Delivery tracking interrupted.");
        }
        System.out.println("Order delivered successfully!");
    }
}

// Main class to run threads
public class FoodOrderSystem { 

    public static void main(String[] args) {
        // Creating threads for different tasks
        OrderProcessing order = new OrderProcessing();
        PaymentProcessing payment = new PaymentProcessing();
        DeliveryTracking delivery = new DeliveryTracking();
        
        // Starting threads
        order.start();
        payment.start();
        delivery.start();

        // Ensuring all tasks complete before finishing the program
        try {
            order.join();
            payment.join();
            delivery.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        System.out.println("Food Order System: All tasks completed successfully!");
    }
}
/*
OUTPUT:
-------
Order received. Processing order...
Delivery started. Tracking order...
Payment started...
Payment completed successfully!
Order processed successfully!
Order delivered successfully!
Food Order System: All tasks completed successfully!

*/
