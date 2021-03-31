package Chapter1;

public class StringCompression {

    public static void main(String[] args) {
          System.out.println(stringCompression_godTier("abcdd"));
    }

    public static String stringCompression_godTier(String s) {
        StringBuilder str = new StringBuilder();
        
        int cnt = 1;
        for (int i = 1; i < s.length(); i++) {
          if (str.length() >= s.length()) {
            return s; 
          }
          
           if (s.charAt(i) != s.charAt(i-1)) {
               str.append(s.charAt(i-1));
             
               if (cnt > 1) {
                  str.append(cnt);
               }
             
               cnt = 0;
           }
          
           ++cnt; // append count for ith character
        }
        
        
        str.append(s.charAt(s.length() - 1));
        if (cnt > 1) {
          str.append(cnt);
        }
        
        return str.toString();
      }

    public static String stringCompression(String s) {
    ///aaaaaabbbb
    // a6b4
        StringBuilder str = new StringBuilder();
        
        int count = 0;
        for (int i = 0; i < s.length(); ) {
            count = 0;
            char currChar = s.charAt(i); // b
            str.append(currChar);
            
            for (int j = i; j < s.length(); j++) {
                
                char nextChar = s.charAt(j);
                if (nextChar != currChar) {
                    if (count > 1) {
                      str.append(count);
                    }
                    break;
                } 
              
                count++;
            }
          
            i = i + count;
        }
        
        if (count > 1) {
          str.append(count);
        }
        
        
        if (str.length() > s.length()) {
            return s; 
        }
        
        return str.toString();
      }
}

