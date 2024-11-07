
public class Lift {
    private String label;
    private int load;

    public Lift() {
    }

    public Lift(String label, int load) {
        this.label = label;
        this.load = load;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public int getLoad() {
        return load;
    }

    public void setLoad(int load) {
        this.load = load;
    }
    
}
