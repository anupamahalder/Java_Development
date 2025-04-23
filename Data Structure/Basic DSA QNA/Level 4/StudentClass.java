// Create a class for Student with fields, constructor, and method to display details.

import java.util.Scanner;

public class Student{
    String stdName;
    int stdRoll;
    int stdAge;
    double stdMarks;
    char stdGrade;

    // Constructor
    Student(String stdName, int stdRoll, int stdAge, double stdMarks, char stdGrade){
        this.stdName = stdName;
        this.stdRoll = stdRoll;
        this.stdMarks = stdMarks;
        this.stdGrade = stdGrade;
    }

    // Getter method to display student details
    void getStudentDetails(){
        System.out.println("Name of student is: " + stdName + ", Roll number: " + stdRoll + ", Age: " + stdAge);
        System.out.println("Total Marks: " + stdMarks + ", Grade: " + stdGrade);
    }
}

public class StudentClass{
    public static void main(String[] args){
        // create a student object 
        Student student1 = new Student("Anupama", 1, 14, 99.5, 'A');
        student1.getStudentDetails();

        Student student2 = new Student("Priya", 23, 15, 78.6, 'B');
        student2.getStudentDetails();
    }
}

/* 
OUTPUT:
------
Name of student is: Anupama, Roll number: 1, Age: 0
Total Marks: 99.5, Grade: A
Name of student is: Priya, Roll number: 23, Age: 0
Total Marks: 78.6, Grade: B

*/
