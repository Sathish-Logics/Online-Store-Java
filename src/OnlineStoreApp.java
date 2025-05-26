import java.util.Scanner;

public class OnlineStoreApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Product[] products = {
                new Electronics("Laptop", 900, 2),
                new Electronics("Smartphone", 600, 1),
                new Clothing("T-Shirt", 25, "M"),
                new Clothing("Jeans", 45, "L"),
                new Other("Coffee Mug", 12, "Ceramic mug"),
                new Other("Notebook", 8, "100 pages notebook"),
                new Electronics("Headphones", 80, 1),
                new Clothing("Jacket", 60, "XL"),
                new Other("Backpack", 30, "Waterproof"),
                new Electronics("Smartwatch", 200, 1)
        };

        User user = new User("John");
        Payment payment = new Payment();
        boolean running = true;

        while (running) {

            System.out.println("\n--- Online Store Menu ---");
            System.out.println("1. Browse Products");
            System.out.println("2. Add Product to Cart");
            System.out.println("3. View Cart");
            System.out.println("4. Checkout");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    user.browseProducts(products);
                    break;

                case 2:
                    System.out.print("Enter product number to add to cart: ");
                    int productNumber = scanner.nextInt();
                    if (productNumber >= 1 && productNumber <= products.length) {
                        user.addToCart(products[productNumber - 1]);
                    } else {
                        System.out.println("Invalid product number.");
                    }
                    break;

                case 3:
                    user.viewCart();
                    break;

                case 4:
                    System.out.print("Enter payment method (card/upi): ");
                    String method = scanner.next();
                    System.out.print("Enter payment details ("
                            + (method.equalsIgnoreCase("card") ? "card number" : "UPI ID") + "): ");
                    String details = scanner.next();
                    user.checkout(payment, method, details);
                    break;

                case 5:
                    running = false;
                    System.out.println("Thank you for shopping!");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }

        scanner.close();
    }
}
