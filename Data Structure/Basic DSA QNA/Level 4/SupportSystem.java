// Write a program using abstract class and interface.

// Interface declaring a method 

import java.lang.reflect.Constructor;

interface Reply{
    void respond(); // All implementing classes must define this
}

// Abstract class implements the interface but doesnot implement respond method 
abstract class Agent implements Reply{
    String name;

    // Constructor to initialize agent's name 
    Agent(String name){
        this.name = name;
    }

    // Common method that all agents can use 
    void welcome(){
        System.out.println("Hi, I am " + name + ", is your support agent");
    }

    // Note: 'respond()' is not implemented here — that's okay because this is an abstract class
}

// Concrete class 1: A technical support agent
class TechAgent extends Agent{
    TechAgent(String name){
        super(name); // Call the constructor of agent
    }

    // Implementing respond method from Reply interface 
    public void respond(){
        System.out.println("I am solving your technical issue...");
    }
}

// Concrete class 2: A billing support agent
class BillingAgent extends Agent{
    BillingAgent(String name){
        super(name);
    }

    public void respond(){
        System.out.println("I am helping you with your billing query...");
    }
}

public class SupportSystem{
    public static void main(String[] args){
        
        // Create objects of TechAgent and BillingAgent 
        Agent tech = new TechAgent("Ram");
        Agent billing = new BillingAgent("Edrick");

        // call welcome and respond method 
        tech.welcome(); // From Agent class 
        tech.respond(); // From TechAgent class
 
        billing.welcome(); // From Agent class
        billing.respond(); // From BillingAgent Class
    }
}

/* 
OUTPUT:
------
Hi, I am Ram, is your support agent
I am solving your technical issue...
Hi, I am Edrick, is your support agent
I am helping you with your billing query...

*/
