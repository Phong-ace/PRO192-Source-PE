
public class SpecCar extends Car{
    private int warranty;

    public SpecCar() {
    }

    public SpecCar(String name, double price, int warranty) {
        super(name, price);
        this.warranty = warranty;
    }

    @Override
    public String toString() {
        return super.getName() + "," + super.getPrice() + "," + warranty;
    }

    public int getWarranty() {
        if (super.getName().equalsIgnoreCase("Audi")) {
            return warranty + 5;
        }
        else
            return warranty + 2;
    }
    
    
}
