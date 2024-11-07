
public class MyString implements IString{

    @Override
    public int f1(String string) {
        String words[] = string.split("\\s+");
        int count = 0;
        
        for (String word : words) {
            if (word.length() > 0 && Character.isDigit(word.charAt(0)) 
                    && !Character.isDigit(word.charAt(word.length() - 1))) {
                count ++;
            }
        }
        return count;
        
//        int count = 0;
//        String[] words = str.split("\\s+"); // Split the string by whitespace
//
//        for (String word : words) {
//            // Check if word starts with a digit and ends with a non-digit
//            if (word.matches("^\\d.*\\D$")) {
//                count++;
//            }
//        }
//        return count;
    }

    @Override
    public String f2(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
