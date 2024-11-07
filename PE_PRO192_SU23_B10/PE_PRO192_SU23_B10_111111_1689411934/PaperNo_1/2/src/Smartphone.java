
public class Smartphone extends Product{
    
    
    private int price;
    private int internal_memory;
    private float weight;

    public Smartphone(String code, String name) {
        super(code, name);
    }

    public Smartphone(String code, String name, int internal_memory, float weight, int price) {
        super(code, name);
        this.price = price;
        this.internal_memory = internal_memory;
        this.weight = weight;
    }
    
    public void showInfor() {
        System.out.println(code + "-" + name + "-" + internal_memory 
                          + "GB" + "-" + weight + "g" + "-" + price + "$");
    }
    
    
    public double buyNow(int quantity) {
        if (name.contains("IPHONE 14 PROMAX") && quantity >= 5) {
            return (quantity * price) * 0.8;
        }
        else
            return quantity * price;
    }

}
