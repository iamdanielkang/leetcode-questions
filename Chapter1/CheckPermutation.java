package Chapter1;

import java.util.*; 

public class CheckPermutation {
    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "eidboaoo";

        System.out.println("The string permutation of s1 and s2 is " + checkPermutationSubString(s1, s2));
        
    }


    // Check if the exact substring s1 is inside s2
    public static Boolean checkPermutationSubString(String s1, String s2) {

        if(s2.contains(s1) == false) {
            return false;
        }
        return true;
    }

    // For non-substring and simply checking letters in s1 exist in s2
    public static Boolean checkPermutation(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }

        Map<Character, Integer> map = new HashMap<Character, Integer>();

        for(int i = 0; i < s2.length(); i++){
            char currChar = s2.charAt(i);
            map.put(currChar, 1);
        }

        for(int j = 0; j < s1.length(); j++) {
            if(map.get(s1.charAt(j)) == null) {
                return false;
            }
        }

        return true;
    }

}
