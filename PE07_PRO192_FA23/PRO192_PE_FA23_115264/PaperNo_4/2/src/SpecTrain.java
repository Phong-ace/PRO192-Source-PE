
public class SpecTrain extends Train{
    private int load;

    public SpecTrain() {
    }

    public SpecTrain(String name, String type, int load) {
        super(name, type);
        this.load = load;
    }

    @Override
    public String toString() {
        return super.toString() + "," + load;
    }
    
    public void setData() {
        setName(getName().substring(1));
    }
    
    public int getValue() {
        int count = 0;
        for (int i = 0; i < getType().length(); i++) {
            if (Character.isDigit(getType().charAt(i))) {
                count++;
            }
        }
        
        if (count == 1) {
            return load * getName().length();
        }
        else
            return load;
    }
    
}
