
public class MyProcess implements IProcess{

    @Override
    public String getReverseString(String string) {
        String s = new StringBuilder(string).reverse().toString();
        return s;
    }

    @Override
    public int countDigitsInString(String string) {
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (Character.isDigit(string.charAt(i))) {
                count++;
            }
        }
        return count;
    }
    
}
