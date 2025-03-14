class StaticMethod {
    // Static Method
    static void displayMessage() {
        System.out.println("Static Method Called! No need for an object.");
    }

    public static void main(String[] args) {
        displayMessage(); // Calling Static Method directly
    }
}

/*
OUTPUT:
-------
Static Method Called! No need for an object.
*/
