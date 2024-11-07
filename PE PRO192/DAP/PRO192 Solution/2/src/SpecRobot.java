
public class SpecRobot extends  Robot
{
    int step;

    public SpecRobot() {
    }
    public SpecRobot(String label,int type,int step)
    {
        super.setLabel(label);
        super.setType(type);
        this.step = step;
    }
    public void setData() 
    {
    String label = super.getLabel();
    String modifiedLabel = label.substring(0, 1) + step + label.substring(1);
    super.setLabel(modifiedLabel);
    }
    public int getValue() 
    {
    int type = super.getType();
    String label = super.getLabel();

    if (type < 3 && label.contains("A")) {
        return step;
    } else {
        return step + 2;
    }
    }
    @Override
    public String toString()
    {
        return super.getLabel()+", " + super.getType()+", " + this.step;
    }
}
