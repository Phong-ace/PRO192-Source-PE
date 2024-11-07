
public class SpecFurniture extends Furniture{
    private String style;

    public SpecFurniture() {
    }

    public SpecFurniture(String name, int price, String style) {
        super(name, price);
        this.style = style;
    }

    @Override
    public String toString() {
        return getName() + "," + style + "," + getPrice();
    }

    public String getStyle() {
        return style;
    }
    
    public void setData() {
        String price = String.valueOf(getPrice()).substring(0, 1);
        setName(getName() + price) ;
    }
    
    public String getValue() {
        if (getPrice() > 10) {
            return getName() + style;
        }
        else
            return getName();
    }
}
