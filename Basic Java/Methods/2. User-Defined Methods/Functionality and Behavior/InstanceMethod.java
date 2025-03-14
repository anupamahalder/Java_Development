class InstanceMethod {
    int value = 10; // Instance Variable

    // Instance Method
    void showValue() {
        System.out.println("Instance Method Called! Value: " + value);
    }

    public static void main(String[] args) {
        InstanceMethod obj = new InstanceMethod(); // Creating Object
        obj.showValue(); // Calling Instance Method
    }
}

/*
OUTPUT:
-------
Instance Method Called! Value: 10
*/
