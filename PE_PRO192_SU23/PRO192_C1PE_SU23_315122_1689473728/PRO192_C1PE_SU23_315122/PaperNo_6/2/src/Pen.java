
public class Pen {
    private String name;
    private String color;

    public Pen() {
    }

    public Pen(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name + "," + color;
    }
    
}
