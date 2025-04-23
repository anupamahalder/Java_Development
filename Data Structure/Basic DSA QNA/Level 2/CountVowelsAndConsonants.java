// Count vowels and consonants in a string.

import java.util.Scanner;

public class CountVowelsAndConsonants{
    
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);

       System.out.println("Enter a string to count vowels and consonants: ");
       String str = sc.nextLine();

       int vowels = 0, consonants = 0;
       for(char ch: str.toCharArray()){
            if(Character.isLetter(ch)){
                if("aeiou".indexOf(ch) != -1) vowels++;
                else consonants++;
            }
       }
       System.out.println("Total Vowels: " + vowels);
       System.out.println("Total Consonants: " + consonants);
    }
}

/* 
OUTPUT:
------
Enter a string to count vowels and consonants: 
hello i am learning java here
Total Vowels: 11
Total Consonants: 13

*/
