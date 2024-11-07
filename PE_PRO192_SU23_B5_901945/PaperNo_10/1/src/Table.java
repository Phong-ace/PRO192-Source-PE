
public class Table {
    private String name;
    private int leg;

    public Table() {
    }

    public Table(String name, int leg) {
        this.name = name;
        this.leg = leg;
    }

    public String getName() {
        String s = name.substring(name.length() - 3);
        
        s = s.substring(0, 1) + Character.toLowerCase(s.charAt(1)) + s.substring(2);
        return s;
    }

    public int getLeg() {
        return leg;
    }

    public void setLeg(int leg) {
        this.leg = leg;
    }
    
}
