/**
 * We use an abstract class Vehicle with an abstract method startEngine(), 
 * which will be implemented differently in Car and Bike.
 * 
    ✔ Vehicle is an abstract class with startEngine() as an abstract method.
    ✔ Car and Bike implement startEngine() differently.
    ✔ stopEngine() is a concrete method, common to all vehicles.
    ✔ Polymorphism: We create Vehicle references (myCar, myBike) but instantiate subclasses (Car, Bike).

🔹 Why use an abstract method?
--> It ensures that all vehicle types must define their own startEngine() method, maintaining a structured design.
 */

// Abstract class representing a generic vehicle
abstract class Vehicle {
    // Abstract method (to be implemented by subclasses)
    abstract void startEngine();
    
    // Concrete method (common for all vehicles)
    void stopEngine() {
        System.out.println("Engine Stopped!");
    }
}

// Concrete subclass: Car
class Car extends Vehicle {
    // Implementing abstract method
    void startEngine() {
        System.out.println("Car engine starts with a key ignition.");
    }
}

// Concrete subclass: Bike
class Bike extends Vehicle {
    // Implementing abstract method
    void startEngine() {
        System.out.println("Bike engine starts with a self-start button.");
    }
}

// Main class
public class AbstractMethod {
    public static void main(String[] args) {
        Vehicle myCar = new Car();
        myCar.startEngine(); // Calls Car's startEngine method
        myCar.stopEngine();  // Calls common stopEngine method

        System.out.println("-----------------");

        Vehicle myBike = new Bike();
        myBike.startEngine(); // Calls Bike's startEngine method
        myBike.stopEngine();  // Calls common stopEngine method
    }
}

/*
🔹 **OUTPUT:**
-----------------
Car engine starts with a key ignition.
Engine Stopped!
-----------------
Bike engine starts with a self-start button.
Engine Stopped!
*/
