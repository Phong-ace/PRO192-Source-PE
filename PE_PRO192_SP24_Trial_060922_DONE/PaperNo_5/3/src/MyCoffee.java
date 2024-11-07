
import java.util.Collections;
import java.util.List;

public class MyCoffee implements ICoffee {

    @Override
    public int f1(List<Coffee> t) {
          int count = 0;
          for(int i = 0; i < t.size(); i++){
              if(checkAB(t.get(i).getName())){
                  count++;
              }
          }
          return count;
    }

    @Override
    public void f2(List<Coffee> t) {
         int min_Temp = Integer.MAX_VALUE;
         int index_Change = 0;
         for(int i = 0 ; i < t.size() ; i++){
             if(t.get(i).getSize() < min_Temp ){
                 min_Temp = t.get(i).getSize();
                 index_Change = i;
             }
         }
         t.remove(index_Change);
    }

    @Override
    public void f3(List<Coffee> t) {
         for(int i = 0; i < 3; i++){
             for(int j = i+1; j < 3; j++){
                 if((t.get(i).getSize() % 10) > (t.get(j).getSize() % 10)){
                     Collections.swap(t, i, j);
                 }
             }
         }
    }
   /*
    @Override
    public int f1(List<Coffee> t) {
        int count = 0;
        for (int i = 0; i < t.size(); i++) {
            if (checkAB(t.get(i).getName())) {
                count++;
            }
        }
        return count;
    }
    
    @Override
    public void f2(List<Coffee> t) {
        int min_Size = Integer.MAX_VALUE;
        int min_Index = 0;
        for (int i = 0; i < t.size(); i++) {
            if (t.get(i).getSize() < min_Size) {
                min_Size = t.get(i).getSize();
                min_Index = i;
            }
        }
        t.remove(min_Index);
    }
    
    @Override
    public void f3(List<Coffee> t) {
        for (int i = 0; i < 3; i++) {
            for (int j = i + 1; j < 3; j++) {
                if ((t.get(i).getSize() % 10) > (t.get(j).getSize() % 10)) {
                    Collections.swap(t, i, j);
                }
                
            }
        }
        
    }
    
    private boolean checkAB(String name) {
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == 'A' || name.charAt(i) == 'B') {
                return false;
            }
        }
        return true;
    }
    */

    private boolean checkAB(String name) {
        for(int i = 0; i < name.length(); i++){
            if(name.charAt(i) == 'A' || name.charAt(i) == 'B'){
                return false;
            }
        }
        return true;
    }
}
