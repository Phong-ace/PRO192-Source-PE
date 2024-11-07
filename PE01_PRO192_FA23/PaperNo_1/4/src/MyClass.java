
public class MyClass implements IProcess{

    @Override
    public int countWords(String str1, String str2) {
        int count = 0;
        String w[] = str1.split("\\s+");
        for (String s : w) {
            if (s.equalsIgnoreCase(str2)) {
                count++;
            }
        }
        return count;
        
    }

    @Override
    public String getLastWord(String str) {
        String w[] = str.trim().split("\\s+");
        String lastWorld = w[w.length - 1];
        return lastWorld.substring(0, 1).toUpperCase() + lastWorld.substring(1).toLowerCase();
    }
    
}
