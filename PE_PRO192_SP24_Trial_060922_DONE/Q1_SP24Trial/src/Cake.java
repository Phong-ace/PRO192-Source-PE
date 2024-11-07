
public class Cake {
    private String maker;
    private int price;
    
    public Cake() {
        
    }
    
    public Cake(String maker, int price) {
        this.maker = maker;
        this.price = price;
    }
    
    public String getMaker() {
        return maker.substring(0, maker.length() - 1).toLowerCase()+ maker.substring(maker.length()-1).toUpperCase();
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
}
