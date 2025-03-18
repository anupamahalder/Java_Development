/*
👉🏼 Employee has general details.
👉🏼 Manager extends Employee and adds department.
👉🏼 HRManager extends Manager and adds hiring capabilities.

Code Explanation: 
♦︎ Employee (Base class) stores basic employee details.
♦︎ Manager (Middle class) adds a department.
♦︎ HRManager (Child class) adds hireEmployee().

 */

// Parent class
class Employee {
    String name = "John Doe";

    void showEmployee() {
        System.out.println("Employee Name: " + name);
    }
}

// Intermediate class
class Manager extends Employee {
    String department = "IT";

    void showDepartment() {
        System.out.println("Department: " + department);
    }
}

// Child class
class HRManager extends Manager {
    void hireEmployee() {
        System.out.println(name + " from " + department + " department is hiring employees.");
    }
}
class MultilevelInheritance{
    public static void main(String[] args){
        HRManager hr = new HRManager();
        hr.showEmployee();      // From Employee class
        hr.showDepartment();    // From Manager class
        hr.hireEmployee();      // From HRManager class
    }
}
/*
OUTPUT:
-------
Employee Name: John Doe
Department: IT
John Doe from IT department is hiring employees.

 */
