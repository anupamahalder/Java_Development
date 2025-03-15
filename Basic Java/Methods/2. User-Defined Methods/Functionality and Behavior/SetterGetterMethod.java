/*
 * A getter method retrieves values, while a setter method updates values in private variables.

    ✔ setName() & setAge() → Assign values to private variables.
    ✔ getName() & getAge() → Retrieve values.
    ✔ Encapsulation → Direct access to variables is restricted; only controlled updates are allowed.
 */

class Student {
    // Private variable
    private String name;
    private int age;

    // Setter method to update name
    public void setName(String newName) {
        name = newName;
    }

    // Getter method to retrieve name
    public String getName() {
        return name;
    }

    // Setter method to update age
    public void setAge(int newAge) {
        if (newAge > 0) // Ensuring valid age
            age = newAge;
        else
            System.out.println("Invalid Age!");
    }

    // Getter method to retrieve age
    public int getAge() {
        return age;
    }
}
class SetterGetterMethod{
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        
        s1.setName("Anupama");
        s1.setAge(14);

        s2.setName("Priya");
        s2.setAge(34);

        System.out.println("Student Name: " + s1.getName());
        System.out.println("Student Age: " + s1.getAge());

        System.out.println("Student name: " + s2.getName() + " and Age: " + s2.getAge());
    }
}

/*
OUTPUT:
-------
Student Name: Anupama
Student Age: 14
Student name: Priya and Age: 34

*/
