
public class SpecPen extends Pen{
   private int price;

    public SpecPen() {
    }

    public SpecPen(String name, String color, int price) {
        super(name, color);
        this.price = price;
    }

    @Override
    public String toString() {
        return super.toString() + "," + price;
    }
    
    public void setData() {
        setName(getName() + price);
    }
    
    public int getValue() {
        if (getColor().contains("Y") || getColor().contains("O")) {
            return price;
        }
        else
            return price * 2;
    }
    
}
