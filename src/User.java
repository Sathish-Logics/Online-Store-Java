public class User {
    private String name;
    private Cart cart;

    public User(String name) {
        this.name = name;
        cart = new Cart();
    }

    public void browseProducts(Product[] products) {
        System.out.println("--- Product List ---");
        for (int i = 0; i < products.length; i++) {
            System.out.print((i + 1) + ". ");
            products[i].displayInfo();
        }
    }

    public void addToCart(Product product) {
        cart.addProduct(product);
    }

    public void viewCart() {
        cart.viewCart();
    }

    public void checkout(Payment payment, String method, String details) {
        if (cart.isEmpty()) {
            System.out.println("Your cart is empty. Add products before checkout.");
            return;
        }
        double total = cart.calculateTotal();
        System.out.println("Total amount: $" + total);
        payment.makePayment(method, details, total);
        cart.clear();
    }
}
