
public class Eagle {
    private String type;
    private int quantity;

    public Eagle() {
    }

    public Eagle(String type, int quantity) {
        this.type = type;
        this.quantity = quantity;
    }

    public String getType() {
        return type.substring(0, 1).concat(type.substring(2, 3));
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
}
