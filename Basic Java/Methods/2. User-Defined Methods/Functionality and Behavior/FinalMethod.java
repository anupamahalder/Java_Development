class FinalMethodClass {
    // Final Method
    final void showFinalMessage() {
        System.out.println("Final Method Called! Cannot be overridden.");
    }
}
class DerivedClass extends FinalMethodClass{
    // Trying to override will cause an error
    // void showFinalMessage() { } // ❌ Compilation Error
}

public class FinalMethod {
    public static void main(String[] args) {
        FinalMethodClass obj = new FinalMethodClass();
        obj.showFinalMessage();
    }
}

/*
OUTPUT:
-------
Final Method Called! Cannot be overridden.

*/
