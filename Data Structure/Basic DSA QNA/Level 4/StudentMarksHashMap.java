// Use `HashMap` to store and retrieve student marks.

import java.util.Scanner;
import java.util.HashMap;

public class StudentMarksHashMap{
    public static void main(String[] args){
        // Create a hashmap to store student name as key and marks as value 
        HashMap<String, Integer> studentMarks = new HashMap<>();

        // Adding data to hashmap 
        studentMarks.put("Abhik", 55);
        studentMarks.put("Bikram", 67);
        studentMarks.put("Riyan", 86);
        studentMarks.put("Tim", 45);

        // Display all student marks 
        System.out.println("All Student marks: ");
        for(String name: studentMarks.keySet()){
            System.out.println(name + " : " + studentMarks.get(name));
        }
        
        // Get user input to search for a student 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student name to get marks: ");
        String searchName = sc.nextLine();

        // Check if the name exists in the map or not 
        if(studentMarks.containsKey(searchName)){
            int marks = studentMarks.get(searchName);
            System.out.println(searchName + "'s marks is: " + marks);
        }else{
            System.out.println("Student not found!");
        }
    }
}

/* 
OUTPUT:
------
All Student marks: 
Bikram : 67
Tim : 45
Riyan : 86
Abhik : 55
Enter student name to get marks: 
Tim
Tim's marks is: 45

*/
