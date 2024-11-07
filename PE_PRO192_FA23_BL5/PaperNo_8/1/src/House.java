
public class House {
    private String type;
    private int area;

    public House() {
    }

    public House(String type, int area) {
        this.type = type;
        this.area = area;
    }

    public String getType() {
        return new StringBuilder(type.substring(type.length() - 3)).reverse().toString();
    }

    public int getArea() {
        return area;
    }
    
}
