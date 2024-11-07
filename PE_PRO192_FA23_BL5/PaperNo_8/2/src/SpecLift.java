
public class SpecLift extends Lift{
    private int load;

    public SpecLift() {
    }

    public SpecLift(String label, int type, int load) {
        super(label, type);
        this.load = load;
    }

    @Override
    public String toString() {
        return super.toString() + "," + load;
    }
    
    public void setData() {
        StringBuilder l = new StringBuilder();
        for (int i = 0; i < getLabel().length(); i++) {
            if (i % 2 == 0) {
                l.append(getLabel().charAt(i));
            }
        }
        setLabel(l.toString());
    }
    
    public int getValue() {
        String typeStr = String.valueOf(getType());
        if (getLabel().contains(typeStr)) {
            return load + getType();
        }
        else
            return load;
    }
}
