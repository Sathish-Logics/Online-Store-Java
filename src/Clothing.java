public class Clothing extends Product {
    private String size;

    public Clothing(String name, double price, String size) {
        super(name, price);
        this.size = size;
    }

    @Override
    public void displayInfo() {
        System.out.print(name + " - $" + price);
        System.out.println(" | Size: " + size);
    }
}
