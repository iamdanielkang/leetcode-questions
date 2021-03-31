package Chapter1;

import java.util.*; 

public class PalindromePermutation {
    public static void main(String[] args) {
        String s1 = "race car";
        
        s1 = normalise(s1);
        System.out.println(palindromePermutation(s1));
        
    }

    public static String normalise(String s) {
        return s.replace(" ", "");
    }

    public static Boolean palindromePermutation(String s) {

        if (s.length() < 1) {
            return false;
        }

        int oddCount = 0;

        Map<Character, Integer> map = new HashMap<Character, Integer>();

        for(int i = 0; i < s.length(); i++){
            char currChar = s.charAt(i);
            map.put(currChar, map.getOrDefault(currChar, 0) + 1);
        }

        for (Character name : map.keySet()) {
            if ((map.get(name) % 2) != 0 ) {
                oddCount += 1;
            }
        }

        if (oddCount > 1) {
            return false;
        }

        return true;
    }
}
