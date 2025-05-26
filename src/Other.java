public class Other extends Product {
    private String description;

    public Other(String name, double price, String description) {
        super(name, price);
        this.description = description;
    }

    @Override
    public void displayInfo() {
        System.out.print(name + " - $" + price);
        System.out.println(" | Description: " + description);
    }
}
