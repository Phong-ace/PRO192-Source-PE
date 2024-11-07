
import java.util.Collections;
import java.util.List;



public class MyLift implements ILift{
    
    private boolean isPrime(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    @Override
    public int f1(List<Lift> t) {
        int maxLoad = Integer.MIN_VALUE;
        for (Lift l : t) {
            if (isPrime(l.getLabel().length())) {
                maxLoad = Math.max(maxLoad, l.getLoad());
            }
        }
        return maxLoad;
    }

    @Override
    public void f2(List<Lift> t) {
        int limit = Math.min(5, t.size());
        for (int i = 0; i < limit/2; i++) {
            Collections.swap(t, i, limit - 1 - i);
        }
    }

    @Override
    public void f3(List<Lift> t) {
        int count = 0;
        for (Lift l : t) {
            if (l.getLoad() < 20) {
                count++;
                if (count == 2) {
                    t.remove(l);
                    break;
                }
            }
        }
        
    }
    
}
