
import java.util.ArrayList;


public class ItemList extends ArrayList<Item>{
    public void addItem(Item item) {
        this.add(item);
    }
    
    public void printItemByQuantity(int value) {
        for (Item i : this) {
            if (i.getQuantity() == value) {
                System.out.println(i);
            }
        }
    }
    
    public int getTotalQuantity() {
        int sum = 0;
        for (Item i : this) {
            sum += i.getQuantity();
        }
        return sum;
    }
}
