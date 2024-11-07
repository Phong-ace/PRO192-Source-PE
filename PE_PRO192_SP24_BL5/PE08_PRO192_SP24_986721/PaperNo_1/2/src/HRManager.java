
public class HRManager extends Employee{
    private int expYear;

    public HRManager() {
    }

    public HRManager(String code, String name, int baseSalary, int expYear) {
        super(code, name, baseSalary);
        this.expYear = expYear;
    }

    @Override
    public String toString() {
        return code + "," + name + "," + expYear + "," + baseSalary + "(VND)";
    }
    
    public int getSalary() {
        if (expYear >= 5) {
            return baseSalary + expYear * 1000000;
        }
        else
            return baseSalary;
    }
}
