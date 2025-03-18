/*
A PaymentGateway processes payments.
A Security interface handles security checks.
OnlinePayment implements both interfaces.

🔹 Explanation
PaymentGateway and Security are separate interfaces.
OnlinePayment class implements both interfaces.
*/

// Interface 1
interface PaymentGateway {
    void processPayment(double amount);
}

// Interface 2
interface Security {
    void verifyUser();
}

// Class implementing both interfaces
class OnlinePayment implements PaymentGateway, Security {
    public void processPayment(double amount) {
        System.out.println("Processing payment of ₹" + amount);
    }

    public void verifyUser() {
        System.out.println("User verified successfully.");
    }
}
class MultipleInheritance{
    public static void main(String[] args) {
        OnlinePayment payment = new OnlinePayment();
        payment.verifyUser();       // From Security interface
        payment.processPayment(2500); // From PaymentGateway interface
    }
}

/*
OUTPUT:
-------
User verified successfully.
Processing payment of ₹2500.0
*/
