
import java.util.List;


public class MyTrain implements ITrain{

    @Override
    public int f1(List<Train> list) {
        int sum = 0;
        for (Train train : list) {
            String name = train.getName();
            int aCount = countChar(name, 'A');
            int bCount = countChar(name, 'B');
            
            
            
            if ((aCount ==1 && bCount ==0) || (bCount == 1 && aCount == 0)) {
                sum += train.getLoad();
            }
        }
        return sum;
    }
    

    @Override
    public void f2(List<Train> list) {
        Train minLT = list.get(0);
        int minLoadIndex = 0;
        
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).getLoad() < minLT.getLoad()) {
                minLT = list.get(i);
                minLoadIndex = i;
            }
        }
        
        if (minLoadIndex < list.size()) {
            list.remove(minLoadIndex);
            list.add(minLT);
        }
    }

    @Override
    public void f3(List<Train> list) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private int countChar(String name, char c) {
        int count = 0;
        for (char ch : name.toCharArray()) {
            if (ch == c) {
                count++;
            }
        }
        return count;
    }
    
}
