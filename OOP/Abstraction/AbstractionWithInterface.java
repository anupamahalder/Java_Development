/*
Interface:   	                    Declared using interface, it provides full abstraction (no implementation).
Abstract Methods:	                start() and stop() methods are abstract in Vehicle and must be implemented by classes.
Constant Variables:	                MAX_SPEED is public static final by default.
Default Method (Java 8):	        fuelType() has a body and can be used without overriding.
Static Method (Java 8): 	        vehicleInfo() can be called using Vehicle.vehicleInfo().
Polymorphism:           	        Vehicle myCar = new Car(); allows flexible object assignment.
Multiple Interface Implementation:  Tesla implements both Vehicle and ElectricVehicle.
 */


// 1️⃣ Defining an Interface
interface Vehicle {
    int MAX_SPEED = 120;  // Constant variable (by default public, static, final)
    
    void start();  // Abstract method (must be implemented in subclass)
    void stop();   // Abstract method
    
    // 2️⃣ Default Method (introduced in Java 8)
    default void fuelType() {
        System.out.println("Fuel type: Petrol/Diesel/Electric");
    }

    // 3️⃣ Static Method (introduced in Java 8)
    static void vehicleInfo() {
        System.out.println("Vehicles are used for transportation.");
    }
}

// 4️⃣ Implementing the Interface in a Class
class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car is starting with key ignition.");
    }

    @Override
    public void stop() {
        System.out.println("Car is stopping with brake.");
    }
    public void car(){
        System.out.println("Car class's method");
    }
}

// 5️⃣ Implementing Another Class (Multiple Implementations)
class Bike implements Vehicle {
    @Override
    public void start() {
        System.out.println("Bike is starting with self-start or kick.");
    }

    @Override
    public void stop() {
        System.out.println("Bike is stopping with hand brake.");
    }
}

// 6️⃣ Multiple Interface Implementation
interface ElectricVehicle {
    void chargeBattery();  // Abstract method
}

class Tesla implements Vehicle, ElectricVehicle {
    @Override
    public void start() {
        System.out.println("Tesla starts silently with electric motor.");
    }

    @Override
    public void stop() {
        System.out.println("Tesla stops using regenerative braking.");
    }

    @Override
    public void chargeBattery() {
        System.out.println("Tesla is charging at the station.");
    }
}

// 7️⃣ Main Class to Demonstrate Abstraction
public class AbstractionWithInterface {
    public static void main(String[] args) {

        Vehicle.vehicleInfo();  // Calling static method from interface

        System.out.println("\n--- Car Operations ---");
        Vehicle myCar = new Car();  // Polymorphism (Interface reference to child class object)
        myCar.start();  // Calls Car's start() method
        myCar.stop();   // Calls Car's stop() method
        myCar.fuelType(); // Calling default method
        // myCar.car(); // he method car() is undefined for the type Vehicle

        System.out.println("\n--- Bike Operations ---");
        Vehicle myBike = new Bike();
        myBike.start();
        myBike.stop();
        myBike.fuelType();

        System.out.println("\n--- Tesla Operations ---");
        Tesla myTesla = new Tesla();
        myTesla.start();
        myTesla.stop();
        myTesla.chargeBattery(); // Calling ElectricVehicle method
        myTesla.fuelType(); // Default method from Vehicle
    }
}

/*
NOTE:
=====
1️⃣ What is Vehicle?
-> Vehicle is an interface that contains abstract methods.
It defines a contract that all implementing classes must follow.

2️⃣ What is Car?
-> Car is a class that implements the Vehicle interface.
It provides concrete implementations for all abstract methods of Vehicle.

3️⃣ Why Use "Vehicle myCar = new Car();" ?
-> Polymorphism: The reference type (Vehicle) is different from the object type (Car).
This allows us to use generalized coding, making it easier to switch between different Vehicle types (e.g., Bike, Tesla).
We can call only the methods declared in Vehicle, even though the actual object is of type Car.
 */


 /*
OUTPUT:
-------
Vehicles are used for transportation.

--- Car Operations ---
Car is starting with key ignition.
Car is stopping with brake.
Fuel type: Petrol/Diesel/Electric

--- Bike Operations ---
Bike is starting with self-start or kick.
Bike is stopping with hand brake.
Fuel type: Petrol/Diesel/Electric

--- Tesla Operations ---
Tesla starts silently with electric motor.
Tesla stops using regenerative braking.
Tesla is charging at the station.
Fuel type: Petrol/Diesel/Electric

  */
