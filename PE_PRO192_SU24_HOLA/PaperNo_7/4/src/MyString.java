
public class MyString implements IString{

    @Override
    public int f1(String string) {
        int sum = 0;
        String s[] = string.split("\\D+");
        // Tách chuỗi dựa trên các ký tự không phải số (non-numeric)
        
        for (int i = 0; i < s.length; i++) {
            if (!s[i].isEmpty()) {
                int num = Integer.parseInt(s[i]); // Chuyển đổi chuỗi thành số
                if (num % 2 == 0) {
                    sum += num;
                }
            }
        }
        return sum;
        
    }

    @Override
    public String f2(String string) {
        String w[] = string.split("\\s+"); //Tách chuỗi dựa trên khoảng trắng
        String shortestWord = w[0]; //Bắt đầu với từ đầu tiên là từ ngắn nhất
        
        // Tìm từ ngắn nhất trong chuỗi
        for (String s1 : w) {
            if (s1.length() < shortestWord.length()) {
                shortestWord = s1;
            }
        }
        
        // Đảo ngược từ ngắn nhất
        String rSW = new StringBuilder(shortestWord).reverse().toString();
        return string.replaceFirst(shortestWord, rSW);
        
    }
    
}
