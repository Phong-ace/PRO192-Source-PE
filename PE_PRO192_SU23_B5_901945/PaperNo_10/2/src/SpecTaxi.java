

public class SpecTaxi extends Taxi{
    private int salary;

    public SpecTaxi() {
    }

    public SpecTaxi(String driver, int age, int salary) {
        super(driver, age);
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + "," + salary;
    }
    
    public void setData() {
        
        String driver = getDriver().substring(0, 1) + getAge() + getDriver().substring(2);
        setDriver(driver);
    }
    
    public int getValue() {
        if (getAge() % 10 % 2 == 0) {
            return salary;
        }
        else
            return salary + getAge();
    }
}
