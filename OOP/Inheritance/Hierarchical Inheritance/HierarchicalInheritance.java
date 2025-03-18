/*
Vehicle is a common parent class.
Car and Bike are two separate subclasses inheriting from it.

🔹 Explanation
Vehicle (Parent class) has a start() method.
Car and Bike (Child classes) extend Vehicle separately.
*/

class V{
    void start(){
        System.out.println("Vehicle is starting...");
    }
}
class C extends V{
    void drive(){
        System.out.println("Car is driving...");
    }
}
class B extends V{
    void ride(){
        System.out.println("Bike is riding...");
    }
}


// Parent class
class Vehicle {
    void start() {
        System.out.println("Vehicle is starting...");
    }
}

// Child class 1
class Car extends Vehicle {
    void drive() {
        System.out.println("Car is driving...");
    }
}

// Child class 2
class Bike extends Vehicle {
    void ride() {
        System.out.println("Bike is riding...");
    }
}
class HierarchicalInheritance{
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.start(); // Inherited from Vehicle
        myCar.drive(); // Car-specific method

        Bike myBike = new Bike();
        myBike.start(); // Inherited from Vehicle
        myBike.ride();  // Bike-specific method
    }
}

/*
OUTPUT:
-------
Vehicle is starting...
Car is driving...
Vehicle is starting...
Bike is riding...

 */
