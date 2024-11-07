
public class Product {
    private int id;
    private String name;
    private double price;
    private int quantity;
    private int discount;

    public Product() {
    }

    public Product(int id, String name, double price, int quantity, int discount) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.discount = discount;
    }

    public void setDiscount(int discount) {
        if (discount < 0) {
            this.discount = 0;
        }
        else
            this.discount = discount;
    }
    
    public double subTotal() {
        return quantity * price * (100 - discount) / 100;
    }

    @Override
    public String toString() {
        return id + "," + name + "," + String.format("%.2f", price) + "," + quantity + "," + String.format("%.2f", subTotal());
    }
    
    
}
