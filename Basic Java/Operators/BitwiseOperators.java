public class BitwiseOperators{
    public static void main(String[] args) {
        int num = 8;  // Binary: 0000 1000

        // 1️⃣ Left Shift (<<) - Multiplies by 2 for each shift
        System.out.println("num << 1: " + (num << 1)); // 16 (0001 0000)
        System.out.println("num << 2: " + (num << 2)); // 32 (0010 0000)

        // 2️⃣ Right Shift (>>) - Divides by 2 for each shift (keeps sign)
        System.out.println("num >> 1: " + (num >> 1)); // 4 (0000 0100)
        System.out.println("num >> 2: " + (num >> 2)); // 2 (0000 0010)

        // 3️⃣ Unsigned Right Shift (>>>) - Shifts right and fills with 0s
        int negNum = -8; // Binary: 1111 1000 (in 2's complement)
        System.out.println("negNum >> 1: " + (negNum >> 1));  // -4 (1111 1100)
        System.out.println("negNum >>> 1: " + (negNum >>> 1)); // Large positive value
        System.out.println(8>>>1); // 4 (For positive number it works just like the normal right shift operator

    }
}

/*
Output:
num << 1: 16
num << 2: 32
num >> 1: 4
num >> 2: 2
negNum >> 1: -4
negNum >>> 1: 2147483644
*/
