class SingleThreadStringBuffer {
    public static void main(String[] args) {

        // 1️⃣ Creating a StringBuffer object
        StringBuffer sb = new StringBuffer("Hello");

        // 2️⃣ Append - Adds text at the end
        sb.append(" World");
        System.out.println("After Append: " + sb); // Hello World

        // 3️⃣ Insert - Inserts text at a specified index
        sb.insert(5, " Java");
        System.out.println("After Insert: " + sb); // Hello Java World

        // 4️⃣ Replace - Replaces a portion of the string
        sb.replace(6, 10, "Python");
        System.out.println("After Replace: " + sb); // Hello Python World

        // 5️⃣ Delete - Removes characters from a specific index range
        sb.delete(6, 12);
        System.out.println("After Delete: " + sb); // Hello on World

        // 6️⃣ Reverse - Reverses the string
        sb.reverse();
        System.out.println("After Reverse: " + sb); // dlroW no olleH

        // 7️⃣ Checking Capacity - Default is 16 + length of the string
        System.out.println("Capacity: " + sb.capacity());

        // 8️⃣ Ensuring Capacity - Ensures a minimum capacity
        sb.ensureCapacity(50);
        System.out.println("New Capacity After Ensuring: " + sb.capacity());

        // 9️⃣ Convert StringBuffer to String
        String str = sb.toString();
        System.out.println("Converted to String: " + str);
    }
}

/*

OUTPUT:
------
After Append: Hello World
After Insert: Hello Java World
After Replace: Hello Python World
After Delete: Hello  World
After Reverse: dlroW  olleH
Capacity: 21
New Capacity After Ensuring: 50
Converted to String: dlroW  olleH

 */
