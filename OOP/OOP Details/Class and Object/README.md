### Object: 
Real life entity. (Phisical entity). Object will hold memory.

### Class:
Virtual entity. (Logical entity)
```java
class MyClass{
  public static void main(String[] args){
    // rest code
    // data members
    int number;
    String color;
    double price;

    // member functions
    int speed(int number, double price){
      // rest code
    }
    void sound(){
      // rest code
    }
  }
}
```

## Pillar of OOP:
### 1. Encapsulation:
Wrapping up data in a single unit. Used for security purposes. It is called data hiding 

```java
class Employee{
    private int empID = 2;
    private String name;
    private int phoneNumber = 123232;
    private double basicSalary = 20000;
    private int incentive = 400;
  
    // default constructor 
    Employee(){
        // this keyword to call another constructor (parameterized)
        this(120, "Unknown", 2284918, 22000);
    }

    // Constructor 
    Employee(int empID, String name, int phoneNumber, double basicSalary){
        this.empID = empID;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.basicSalary = basicSalary;
    }

    private void countSalary(){
      System.out.println(basicSalary + incentive);
    }
  
    // Use getter and setter for implementing encapsulation
    // Getter
    public int getPhoneNumber(){
      return phoneNumber;
    }
    public int getEmpID(){
      return empID;
    }

    // Setter
    public void setPhoneNumber(int phoneNum){
        this.phoneNumber = phoneNum;
    }
  }
  
  class MainClass{
    public static void main(String[] args){
      Employee engineer = new Employee(213, "Sidharth", 343623, 5500);
      System.out.println("Engineer's details:-----------");
      System.out.println("Employee ID:" + engineer.getEmpID());
      System.out.println("Phone Number:" + engineer.getPhoneNumber());

      System.out.println("\nSoftware Engineer details:-----------");
      Employee softwareEngineer = new Employee();
      System.out.println("Employee ID:" + softwareEngineer.getEmpID());
      System.out.println("Phone Number:" + softwareEngineer.getPhoneNumber());
      softwareEngineer.setPhoneNumber(56789);
      System.out.println("New phone number: " + softwareEngineer.getPhoneNumber());
    }
  }
```
#### NOTE:
```java
private Employee{
  // Constructor
}
```
We will create private constructor of a class to not give access to create an object. Mostly for security access.

### 2. Abstraction:
- Abstraction is a process in which we hide the background implementation details. It provides only essential details. It is called implementation hiding.
- To implement abstraction we have
1. abstract keyword
2. interface (blueprint)





