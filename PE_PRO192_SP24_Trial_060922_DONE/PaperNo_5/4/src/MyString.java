public class MyString implements IString{

    @Override
    public int f1(String str) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String f2(String str) {
      String[] s = str.split("\\s+");
      int min_Word = Integer.MAX_VALUE;
      int max_Word = Integer.MIN_VALUE;
      int index_Temp = 0;
      for(int i = 0 ; i < s.length; i++){
        if(s[i].length() < min_Word){
            min_Word = s[i].length();
            index_Temp = i;
        }
        if(s[i].length() > max_Word){
            max_Word = s[i].length();
        }
    }
      String result = "";
      for(int i = 0; i < s.length; i++){
          if(index_Temp == i){
              result+= max_Word +" ";
          }else{
              result += s[i] + " ";
          }
      }
      return result.trim();
    }
  /*
    @Override
    public int f1(String str) {
        int count = 0;
        String[] s = str.split("\\s+");
        for(int i = 0; i < s.length; i++){
            if(checkOdd(s[i]) >= 2){
                count++;
            }
        }
        return count;
    }

    @Override
    public String f2(String str) {
        String[] s = str.split("\\s+");
        int index_Temp = 0;
        int min_L = Integer.MAX_VALUE;
        for(int i = 0; i < s.length; i++){
            if(s[i].length() < min_L){
                min_L = s[i].length();
                index_Temp = i;
            }
        }
        int max_L = Integer.MIN_VALUE;
        for(int i = 0; i < s.length; i++){
            if(s[i].length() > max_L){
                max_L = s[i].length();
            }
        }
        String result = "";
        for(int i = 0 ; i < s.length; i++){
            if(index_Temp == i){
                result += max_L +" ";
            }else{
                result += s[i]+ " ";
            }
        }
        return result.trim();
    }

    private int checkOdd(String string) {
        int count = 0;
       for(int i = 0; i < string.length(); i++ ){
           char c = string.charAt(i);
           if((c - '0') % 2 ==1){
               count++;
           }
       }
       return count;
    }
*/
}