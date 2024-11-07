
public class MyString implements IString{

    @Override
    public int f1(String str) {
        int count = 0;
        String vowels = "aeiouAEIOU";
        
        for (char ch : str.toCharArray()) {
            if (vowels.indexOf(ch) != -1) {
                count++;
            }
        }
        return count;
    }

    @Override
    public String f2(String str) {
        String words[] = str.split(" ");
        StringBuilder result = new StringBuilder();
        
        for (String w : words) {
            StringBuilder reversedWord = new StringBuilder(w);
            result.append(reversedWord.reverse().toString()).append(" ");
        }
        
        return result.toString().trim();
    }
    
}
