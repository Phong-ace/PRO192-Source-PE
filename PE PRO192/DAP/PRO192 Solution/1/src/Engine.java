
public class Engine 
{
    String designer;
    int power;

    public Engine() {
    }
    public Engine(String designer, int power)
    {
        this.designer = designer;
        this.power = power;
    }
    public String getDesigner() {
    String threeChars = this.designer.substring(0, 3);
    String firstChar = threeChars.substring(0, 1).toUpperCase();
    String restChars = threeChars.substring(1);
    return firstChar + restChars;
}
    public void setDesigner(String designer) {
        this.designer = designer;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
    
    
}
