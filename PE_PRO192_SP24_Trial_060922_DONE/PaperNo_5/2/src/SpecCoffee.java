public class SpecCoffee extends Coffee{
   private int price;

    public SpecCoffee() {
    }

    public SpecCoffee(String name, int size, int price) {
        super(name, size);
        this.price = price;
    }
    public void setData(){
        setName("CF"+super.getName());
    }
    public int getValue(){
        if(super.getSize() > 10){
            return this.price;
        }else{
            return this.price+5;
        }
    }

    @Override
    public String toString() {
        return super.getName()+","+super.getSize()+","+this.price;
    }
    
}