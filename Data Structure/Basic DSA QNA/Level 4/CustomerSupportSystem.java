// Demonstrate method overloading and overriding with examples.

public class Support{
    // method overloading: same method name, different parameters
    void help(int queryId){
        System.out.println("Looking up for query id: " + queryId);
    }

    void help(String message){
        System.out.println("Received support request: " + message);
    }
}

// base class for method overriding 
public class SupportAgent{
    void respond(){
        System.out.println("General support agent responding...");
    }
}

// subclass that overrides the method 
public class TechnicalAgent extends SupportAgent{
    @Override
    void respond(){
        System.out.println("Technical agent handling the issue...");
    }
}

public class CustomerSupportSystem{
    public static void main(String[] args){
        // Testing method overloading 
        // create a Support object 
        Support support = new Support(); 
        support.help(1224);  // Passing Query ID
        support.help("My order is not showing successful after payment!"); // Passing message

        // Testing method overriding 
        SupportAgent agent = new SupportAgent();
        SupportAgent techAgent = new TechnicalAgent();

        agent.respond();
        techAgent.respond();
    }
}

/* 
OUTPUT:
------
Looking up for query id: 1224
Received support request: My order is not showing successful after payment!
General support agent responding...
Technical agent handling the issue...

*/
