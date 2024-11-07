
import java.util.Collections;
import java.util.List;


public class MyFurniture implements IFurniture{

    @Override
    public int f1(List<Furniture> t) {
        int sum = 0;
        for (Furniture f : t) {
            if (f.getName().endsWith("n")) {
                sum += f.getPrice();
            }
        }
        return sum;
    }

    @Override
    public void f2(List<Furniture> t) {
        int count = 0;
        for (Furniture f : t) {
            if (f.getName().startsWith("1") && f.getName().startsWith("2")
                    && f.getName().startsWith("3")) {
                count++;
            }
        }
    }

    @Override
    public void f3(List<Furniture> t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
