
public class SpecCoffee extends Coffee {
    private int price;

    public SpecCoffee() {
    }

    public SpecCoffee(String name, int size, int price) {
        super(name, size);
        this.price = price;
    }
    
    public void setData() {
        this.setName("CF" + this.getName());
    }

    @Override
    public String toString() {
        return  this.getName()+ ", " + this.getSize() + price;
    }
    
    
    public int getValue() {
        if(this.getSize() > 10){
            return price;
        }
        else
            return price + 5;
    }
}
