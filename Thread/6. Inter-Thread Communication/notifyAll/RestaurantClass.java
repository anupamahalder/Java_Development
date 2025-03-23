/*
🚀 Inter-Thread Communication using notifyAll() in Java  
🔹 notifyAll() → Wakes up all threads that are waiting on the object's monitor.  
🔹 Used when multiple threads need to be notified at once instead of just one (notify()).

🌍 Real-World Example: Restaurant Order System
💡 Scenario:
- Multiple customers (Consumer threads) are waiting for their orders.  
- A chef (Producer thread) prepares the order and notifies all waiting customers when it's ready.

🛠 Explanation:  
1️⃣ Restaurant Class (Shared Resource)
   - prepareFood() → Chef prepares food, then calls notifyAll() to wake up all waiting customers.  
   - serveFood() → Customers wait for food (wait()). Once notified, they receive their meal.  

2️⃣ Chef (Producer)  
   - Starts preparing food, sleeps for 2 seconds to simulate cooking time.  
   - Calls notifyAll() to wake up all waiting customers.

3️⃣ Customers (Consumers)  
   - Each customer thread waits (wait()) until the food is ready.  
   - Once notified, they proceed to eat.

✅ Key Takeaways:
✔ wait() → Makes a thread wait until another thread calls notify() or notifyAll().  
✔ notifyAll() → Wakes up all waiting threads.  
✔ Best used when multiple consumers need to be notified at once.  
✔ Prevents thread starvation, ensuring all waiting threads get a chance to proceed.  

💡 Why notifyAll() Instead of notify()?  
- notify() wakes only one thread (randomly chosen), while notifyAll() wakes all waiting threads.  
- If multiple consumers are waiting, notifyAll() ensures everyone gets notified when the resource is ready.  
*/ 

class Restaurant {
    private boolean foodReady = false;

    // Method to prepare food (Producer)
    public synchronized void prepareFood() {
        System.out.println("Chef is preparing food...");
        try {
            Thread.sleep(2000); // Simulate cooking time
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        foodReady = true;
        System.out.println("Food is ready! Notifying all customers...");
        notifyAll();  // Notify all waiting customers
    }

    // Method for customers waiting for food (Consumers)
    public synchronized void serveFood(String customerName) {
        while (!foodReady) {  // Wait until food is ready
            try {
                System.out.println(customerName + " is waiting for food...");
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(customerName + " got the food and is eating.");
    }
}

// Producer Thread (Chef)
class Chef extends Thread {
    Restaurant restaurant; // Instance variable to store the reference

    Chef(Restaurant restaurant) {
        this.restaurant = restaurant; // Assigning reference
    }

    public void run() {
        restaurant.prepareFood();
    }
}

// Consumer Threads (Customers)
class Customer extends Thread {
    Restaurant restaurant; // Instance variable to store the reference
    String customerName;

    Customer(Restaurant restaurant, String customerName) {
        this.restaurant = restaurant; // Assigning reference
        this.customerName = customerName;
    }

    public void run() {
        restaurant.serveFood(customerName);
    }
}

// Main Class
public class RestaurantClass {
    
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();

        // Creating multiple customer threads
        Customer customer1 = new Customer(restaurant, "Alice");
        Customer customer2 = new Customer(restaurant, "Bob");
        Customer customer3 = new Customer(restaurant, "Charlie");

        // Creating chef thread
        Chef chef = new Chef(restaurant);

        // Starting all customer threads first
        customer1.start();
        customer2.start();
        customer3.start();

        // Chef starts preparing food after some delay
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        chef.start(); // Chef prepares food
    }
}
/*
OUTPUT:
-------
Alice is waiting for food...
Charlie is waiting for food...
Bob is waiting for food...
Chef is preparing food...
Food is ready! Notifying all customers...
Alice got the food and is eating.
Bob got the food and is eating.
Charlie got the food and is eating.

*/
