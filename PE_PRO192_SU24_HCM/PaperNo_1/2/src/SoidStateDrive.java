
public class SoidStateDrive extends Product{
    private String code;
    private int speed;
    private int quantity;
    private double price;

    public SoidStateDrive() {
    }

    public SoidStateDrive(String code, int speed, int quantity, double price, String name, String brand) {
        super(name, brand);
        this.code = code;
        this.speed = speed;
        this.quantity = quantity;
        this.price = price;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return code + "," + getName() + "," + getBrand() + "," + speed + "," + String.format("%.2f", price);
    }
    

    @Override
    public double getFinalPrice() {
        if (speed <= 1024) {
            return price * 0.8;
        }
        if (speed < 1024 && speed <= 2048) {
            return price * 0.9;
        }
        if (speed > 2048) {
            return price * 0.95;
        }
        return getFinalPrice();
    }

    @Override
    public double getTotalAmount() {
        return quantity * getFinalPrice();
    }
    
}
