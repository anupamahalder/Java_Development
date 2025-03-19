/*
Runtime Polymorphism:
🅰️ A child class provides a specific implementation of a method from the parent class.
🅱️ The method to be executed is decided at runtime, based on the object type.
*/

// Parent class
class Vehicle {
    void start() {
        System.out.println("Vehicle is starting...");
    }
}

// Child class overriding the start() method
class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car is starting with a push button...");
    }
}

// Another child class overriding the start() method
class Bike extends Vehicle {
    @Override
    void start() {
        System.out.println("Bike is starting with a kick...");
    }
}

// Main class
public class RuntimePolymorphism {
    public static void main(String[] args) {
        Vehicle myVehicle; // Parent class reference

        myVehicle = new Car();  // Creating a Car object
        myVehicle.start();      // Calls Car's start() method

        myVehicle = new Bike(); // Creating a Bike object
        myVehicle.start();      // Calls Bike's start() method
    }
}

/*
OUTPUT:
-------
Car is starting with a push button...
Bike is starting with a kick...

*/
