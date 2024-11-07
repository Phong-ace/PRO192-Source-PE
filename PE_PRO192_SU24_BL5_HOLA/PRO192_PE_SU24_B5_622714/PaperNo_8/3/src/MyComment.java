
import java.util.ArrayList;
import java.util.List;


public class MyComment implements IComment{

    @Override
    public int f1(List<Comment> t) {
        int count = 0;
        int maxLike = t.get(0).getLike();
        for (Comment c : t) {
            if (c.getLike() > maxLike) {
                maxLike = c.getLike();
                //count = 1; //Sau khi cập nhật maxLike, 
                           //khởi tạo lại count là 1 vì hiện tại chỉ có một  
                           //comment có giá trị like bằng maxLike mới này.

            }
            
        }
        
        for (Comment c : t) {
            if (c.getLike() == maxLike) {
                count++;
            }
        }
        return count;
    }

    @Override
    public void f2(List<Comment> t) {
        // Lấy danh sách các comment có độ dài content là 2
        List<Comment> twoCharComments = new ArrayList<>();
        for (Comment c : twoCharComments) {
            if (c.getContent().length() == 2) {
                twoCharComments.add(c);
            }
        }
        
        // Sắp xếp twoCharComments theo like giảm dần
        for (int i = 0; i < twoCharComments.size() - 1; i++) {
            for (int j = i + 1; j < twoCharComments.size(); j++) {
                if (twoCharComments.get(i).getLike() < twoCharComments.get(j).getLike()) {
                    Comment temp = twoCharComments.get(i);
                    twoCharComments.set(i, twoCharComments.get(j));
                    twoCharComments.set(j, temp);
                }
            }
        }
        
        // Đưa các comment có content dài 2 
        //đã được sắp xếp vào vị trí ban đầu trong danh sách t
        int index = 0;
        for (int i = 0; i < t.size(); i++) {
            if (t.get(i).getContent().length() == 2) {
                t.set(i, twoCharComments.get(index++));
            }
        }
        
    }

    @Override
    public void f3(List<Comment> t) {
        // Tìm số like lớn nhất
        int maxLike = Integer.MIN_VALUE;
        for (Comment c : t) {
            if (c.getLike() > maxLike) {
                maxLike = c.getLike();
            }
        }
        
        // Đếm các comment có maxLike
        int maxCount = 0;
        for (Comment c : t) {
            if (c.getLike() == maxLike) {
                maxCount++;
            }
        }
        
        //
        if (maxCount >= 3) {
            int count = 0;
            for (int i = 0; i < t.size(); i++) {
                if (t.get(i).getLike() == maxLike) {
                    count++;
                    if (count == 3) {
                        t.remove(i);
                        break;
                    }
                }
            }
        }
    }
    
}
