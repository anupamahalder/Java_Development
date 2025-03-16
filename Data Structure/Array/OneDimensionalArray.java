import java.util.Scanner;

class OneDimensionalArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Array elements are:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        sc.close();
    }
}

/*
OUTPUT:
-------
Enter size of array: 5
Enter 5 elements:
33
34
56
23
22
Array elements are:
33 34 56 23 22
*/
