
import java.util.Comparator;
import java.util.List;

public class MySpeaker implements ISpeaker {

    @Override
    public int f1(List<Speaker> t) {
        int count = 0;
        for (int i = 0; i < t.size(); i++) {
            if (t.get(i).getPower() > 10) {
                count++;
            }
        }
        return count;
    }

    @Override
    public void f2(List<Speaker> t) {
        int size = Math.min(5, t.size()); // Giới hạn tới 5 phần tử đầu tiên 
                                              //hoặc ít hơn nếu danh sách nhỏ hơn 5 phần tử

        //sắp xếp 5 phần tử đầu tiên
        List<Speaker> sublist = t.subList(0, size);  // Tạo một sublist chứa 5 phần tử đầu tiên
        sublist.sort(Comparator.comparingInt(Speaker::getPower));  // Sắp xếp sublist theo thuộc tính power

        // Các phần tử còn lại không thay đổi
    }

    @Override
    public void f3(List<Speaker> t) {
        int minPower = t.get(0).getPower(); // Giả định ban đầu là phần tử đầu tiên có power nhỏ nhất
        for (Speaker s : t) {
            if( s.getPower() < minPower) { //tìm giá trị power nhỏ nhất bằng cách
                                           //so sánh mỗi Speaker với giá trị minPower hiện tại.
                minPower = s.getPower(); //Nếu tìm thấy giá trị power nhỏ hơn, 
                                         //thì cập nhật minPower
            }
        }
        
        int minCount = 0; // Biến đếm số lượng phần tử có minPower
        Speaker toRemove = null; // Biến lưu phần tử thứ hai cần xóa
        for (Speaker s : t) { //duyệt qua danh sách lần nữa 
                              //để đếm bao nhiêu phần tử có giá trị power bằng minPower.
            if (s.getPower() == minPower) {
                minCount++;
                if (minCount == 2) {
                    toRemove = s; // Nếu tìm thấy phần tử thứ 2, đánh dấu phần tử đó để xóa
                    break;
                }
            }
        }
        
        if (toRemove != null) {
            t.remove(toRemove); // Xóa phần tử thứ hai nếu tìm thấy
        }
        
    }

}
