import java.util.Scanner;

class JaggedArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        int[][] jaggedArray = new int[rows][];

        for (int i = 0; i < rows; i++) {
            System.out.print("Enter number of columns for row " + (i + 1) + ": ");
            int cols = sc.nextInt();
            jaggedArray[i] = new int[cols];

            System.out.println("Enter " + cols + " elements for row " + (i + 1) + ":");
            for (int j = 0; j < cols; j++) {
                jaggedArray[i][j] = sc.nextInt();
            }
        }

        System.out.println("Jagged array elements are:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}

/*
OUTPUT:
-------
Enter number of rows: 3
Enter number of columns for row 1: 4
Enter 4 elements for row 1:
12
3
4
5
Enter number of columns for row 2: 2
Enter 2 elements for row 2:
32
45
Enter number of columns for row 3: 1 
Enter 1 elements for row 3:
32
Jagged array elements are:
12 3 4 5 
32 45 
32 

*/
