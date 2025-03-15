/*
    ✔ Constructors initialize objects automatically when they are created.
    ✔ Default Constructor initializes the object without parameters.
    ✔ Parameterized Constructor allows initializing objects with specific values.
    ✔ Constructor Overloading means having multiple constructors with different parameters.
 */
class ConstructorMethod {
    // Constructor Method
    ConstructorMethod() {
        System.out.println("Constructor Called! Object Created.");
    }
    // We can have multiple constructor with different parameters
    ConstructorMethod(String str){
        System.out.println("Hello "+ str);
    }
    
    public static void main(String[] args) {
        ConstructorMethod obj = new ConstructorMethod(); // Constructor gets called automatically
        ConstructorMethod obj1 = new ConstructorMethod("Tom");
    }
}

/*
OUTPUT:
-------
Constructor Called! Object Created.
Hello Tom

 */
