
public class Crown {
    private String color;
    private int weight;

    public Crown() {
    }

    public Crown(String color, int weight) {
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color.substring(0, 1).toUpperCase().concat(color.substring(1).toLowerCase());
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight - this.weight;
    }
    
    
}
