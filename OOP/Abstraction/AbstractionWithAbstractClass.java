/*
Explanation of the Code

1️⃣ Abstract Class (Vehicle):
    Defines an abstract method (start()) that must be implemented by subclasses.
    Has a concrete method (stop()) to show that abstract classes can have both abstract and concrete methods.
    Has a constructor that initializes the brand of the vehicle.

2️⃣ Concrete Subclasses (Car & Bike)
    Both extend the Vehicle class.
    Implement the start() method in different ways.
    Car has an additional property (numOfDoors).

3️⃣ Main Class (AbstractionDemo)
    Polymorphism is used: Vehicle reference holds Car and Bike objects.
    Calls both abstract and concrete methods.

📌 Key Takeaways
    ✔ Abstract classes allow both abstract and concrete methods.
    ✔ Constructors can be used in abstract classes.
    ✔ Abstract methods must be overridden in subclasses.
    ✔ Concrete methods can be optionally overridden in subclasses.
    ✔ Polymorphism allows treating subclasses as their abstract superclass.
 */


// Abstract class representing a Vehicle
abstract class Vehicle {
    String brand; // Instance variable

    // Constructor in an abstract class
    Vehicle(String brand) {
        this.brand = brand;
        System.out.println(brand + " vehicle is created.");
    }

    // Abstract method (Must be implemented by subclasses)
    abstract void start();

    // Concrete method (Optional implementation in subclasses)
    void stop() {
        System.out.println(brand + " vehicle is stopping...");
    }
}

// Concrete class extending the abstract class
class Car extends Vehicle {
    int numOfDoors; // Additional property

    // Constructor
    Car(String brand, int numOfDoors) {
        super(brand); // Calling the abstract class constructor
        this.numOfDoors = numOfDoors;
    }

    // Implementing abstract method
    @Override
    void start() {
        System.out.println(brand + " car starts with a key ignition.");
    }
}

// Another subclass implementing the abstract method
class Bike extends Vehicle {
    Bike(String brand) {
        super(brand);
    }

    // Implementing abstract method
    @Override
    void start() {
        System.out.println(brand + " bike starts with a self-start button.");
    }
}

// Main class to test abstraction
public class AbstractionWithAbstractClass {
    public static void main(String[] args) {
        Vehicle myCar = new Car("Toyota", 4);
        myCar.start();  // Calls the overridden method from Car
        myCar.stop();   // Calls the concrete method from Vehicle

        System.out.println();

        Vehicle myBike = new Bike("Yamaha");
        myBike.start(); // Calls the overridden method from Bike
        myBike.stop();  // Calls the concrete method from Vehicle
    }
}

/*
OUTPUT:
-------
Toyota vehicle is created.
Toyota car starts with a key ignition.
Toyota vehicle is stopping...

Yamaha vehicle is created.
Yamaha bike starts with a self-start button.
Yamaha vehicle is stopping...

 */
