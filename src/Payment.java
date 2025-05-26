public class Payment {

    public void makePayment(String cardNumber, double amount) {
        System.out.println("Processing card payment with card number: " + cardNumber);
        System.out.println("Payment of $" + amount + " successful.");
    }

    public void makePayment(String upiId, String methodType, double amount) {
        if (methodType.equalsIgnoreCase("upi")) {
            System.out.println("Processing UPI payment with UPI ID: " + upiId);
            System.out.println("Payment of $" + amount + " successful.");
        } else {
            System.out.println("Invalid payment method for this overload.");
        }
    }

    public void makePaymentByMethod(String method, String details, double amount) {
        if (method.equalsIgnoreCase("card")) {
            makePayment(details, amount);
        } else if (method.equalsIgnoreCase("upi")) {
            makePayment(details, method, amount);
        } else {
            System.out.println("Unsupported payment method.");
        }
    }
}
