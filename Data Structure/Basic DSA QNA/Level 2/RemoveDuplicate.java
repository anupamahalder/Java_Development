// Remove duplicate characters from a string.

import java.util.Scanner;

public class RemoveDuplicate{
    private boolean checkVowel(char ch){
        return false;
    }
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);

       System.out.println("Enter a string to remove duplicate: ");
       String str = sc.nextLine();
       String ans = "";
       
       for(char ch: str.toCharArray()){
            if(ans.indexOf(ch) == -1){
                ans += ch;
            }
       }
       System.out.println("After deleting duplicate the new string is: " + ans);
    }
}

/* 
OUTPUT:
------
Enter a string to remove duplicate: 
student is studying java  
After deleting duplicate the new string is: studen iygjav

*/
