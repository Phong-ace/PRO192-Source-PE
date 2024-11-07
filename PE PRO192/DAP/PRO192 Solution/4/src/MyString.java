import java.util.HashSet;
import java.util.Set;
public class MyString implements IString
{

    @Override
public int f1(String str) {
    String[] words = str.split(" ");
    int totalLength = 0;
    for (String word : words) {
        if (word.length() >= 2 && isPalindrome(word)) {
            totalLength += word.length();
        }
    }
    return totalLength;
}

private boolean isPalindrome(String word) {
    int i = 0, j = word.length() - 1;
    while (i < j) {
        if (word.charAt(i) != word.charAt(j)) {
            return false;
        }
        i++;
        j--;
    }
    return true;
}

@Override
public String f2(String str) {
    Set<Character> seen = new HashSet<>();
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < str.length(); i++) {
        if (!seen.contains(str.charAt(i))) {
            sb.append(str.charAt(i));
            seen.add(str.charAt(i));
        }
    }
    return sb.toString();
}

    
}
