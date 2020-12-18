package Chapter1;

import java.util.*; 

public class CheckPermutation {
    public static void main(String[] args) {
        String s1 = "aaab";
        String s2 = "abaa";

        System.out.println("The string permutation of s1 and s2 is " + checkPermutation(s1, s2));
        
    }


    // Check if the exact substring s1 is inside s2
    public static Boolean checkSubString(String s1, String s2) {

        if(s2.contains(s1) == false) {
            return false;
        }
        return true;
    }

    // For non-substring and simply checking letters in s1 exist in s2
    public static Boolean checkPermutation(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        Map<Character, Integer> map1 = new HashMap<Character, Integer>();
        Map<Character, Integer> map2 = new HashMap<Character, Integer>();
        for(int i = 0; i < s2.length(); i++){
            char currChar = s2.charAt(i);
            map1.put(currChar, map1.getOrDefault(currChar, 0) + 1);
        }
        
        for(int i = 0; i < s1.length(); i++){
            char currChar = s1.charAt(i);
            map2.put(currChar, map2.getOrDefault(currChar, 0) + 1);
        }

        return map1.equals(map2);

        //! Method to compare 2 maps

        // for(int i = 0; i < s1.length(); i++) {
        //     char currChar = s1.charAt(i);
        //     if (map1.get(currChar) != map2.get(currChar)) {
        //         return false;
        //     }
        // }

        // for(int i = 0; i < s2.length(); i++) {
        //     char currChar = s2.charAt(i);
        //     if (map2.get(currChar) != map1.get(currChar)) {
        //         return false;
        //     }
        // }

        // return true;
    }

}
