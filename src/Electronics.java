public class Electronics extends Product {
    private int warrantyYears;

    public Electronics(String name, double price, int warrantyYears) {
        super(name, price);
        this.warrantyYears = warrantyYears;
    }

    @Override
    public void displayInfo() {
        System.out.print(name + " - $" + price);
        System.out.println(" | Warranty: " + warrantyYears + " years");
    }
}
