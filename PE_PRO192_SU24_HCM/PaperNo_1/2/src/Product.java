
public abstract class Product {
    private String name;
    private String brand;

    public Product() {
    }

    public Product(String name, String brand) {
        this.name = name;
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }
    
    public abstract double getFinalPrice();
    public abstract double getTotalAmount();
}
