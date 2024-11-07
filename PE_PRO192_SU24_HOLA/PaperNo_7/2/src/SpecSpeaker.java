
public class SpecSpeaker extends Speaker{
    private String sound;

    public SpecSpeaker() {
    }

    public SpecSpeaker(String name, int power, String sound) {
        super(name, power);
        this.sound = sound;
    }

    @Override
    public String toString() {
        return super.getName() + ", " + sound + ", " + super.getPower();
    }
    
    public void setData() {
        setName(super.getName().substring(0, super.getName().length()-1));
    }
    
    public String getValue() {
        if(super.getPower() > 10) {
            return sound;
        }
        else
            return sound + super.getPower();
    }
}
