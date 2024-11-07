
public class Truck {
    private String name;
    private int weight;

    public Truck() {
    }

    public Truck(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name.substring(2, 3).concat(name.substring(3, 4));
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight + name.length();
    }
    
}
