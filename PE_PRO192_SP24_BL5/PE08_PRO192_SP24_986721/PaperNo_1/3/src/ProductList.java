
import java.util.ArrayList;


public class ProductList extends ArrayList<Product>{
    public Product getProductById(int id) {
        for (Product x : this) {
            if (x.getId() == id) {
                return x;
            }
        }
        return null;
    }
    
    public Product getProductWithMinPrice() {
        if (this.isEmpty()) {
            return null;
        }
        
        Product minP = this.get(0); //Khởi tạo sản phẩm đầu tiên trong danh sách.
        for (Product p : this) { //Lặp lại từng sản phẩm để tìm sản phẩm có giá nhỏ nhất
            if (p.getPrice() < minP.getPrice()) {
                minP = p; //cập nhật minP khi tìm thấy giá thấp hơn.
            }
        }
        return minP;
    }
}
