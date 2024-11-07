

import java.util.Comparator;
import java.util.List;


public class MyPen implements IPen{

    @Override
    public int f1(List<Pen> list) {
        int count = 0;
        for (Pen p : list) {
            int aCount = 0;
            for (char c : p.getName().toCharArray()) {
                if (c == 'A') {
                    aCount++;
                }
            }
            if (aCount >= 2) {
                count++;
            }
        }
        return count;
    }

    @Override
    public void f2(List<Pen> list) {
        int minOddPrice = Integer.MAX_VALUE;
        int indexToRemove = -1;
                
        for (int i = 0; i < list.size(); i++) {
            Pen pen = list.get(i);
            if (pen.getPrice() % 2 != 0 && pen.getPrice() < minOddPrice) {
                minOddPrice = pen.getPrice();
                indexToRemove = i;
            }
        }
        if (indexToRemove != -1) {
            list.remove(indexToRemove);
        }
        
    }

    @Override
    public void f3(List<Pen> list) {
        if (list.size() < 7) {
            return;
        }
        
        List<Pen> sublist = list.subList(2, 7);
        sublist.sort(Comparator.comparing(Pen :: getName).thenComparing(Comparator.comparing(Pen :: getPrice).reversed()));
    }
    
}
