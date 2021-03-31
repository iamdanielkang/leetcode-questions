package Chapter1;

import java.util.*; 


// One Away: There are three types of edits that can be performed on 
// strings: insert a character, remove a character, or replace a character.
//  Given two strings, write a function to check if they are one edit 
// (or zero edits) away.

public class OneAway {
    public static void main(String[] args) {
        String s1 = "xabc";
        String s2 = "ade";

        System.out.println(oneAway(s1, s2));
    }

    public static Boolean oneAway(String s1, String s2) {
        
        if (s1.length() != s2.length()) {       // Either 1 remove or 1 insert
            if (s2.length() < (s1.length() - 1)) {
                return false;
            }
            else if (s2.length() > (s1.length() + 1)) {
                return false;
            }
        }

        Map<Character, Integer> map1 = new HashMap<Character, Integer>();

        for(int i = 0; i < s1.length(); i++){
            char currChar = s1.charAt(i);
            map1.put(currChar, map1.getOrDefault(currChar, 0) + 1);
        }

        Map<Character, Integer> map2 = new HashMap<Character, Integer>();

        for(int i = 0; i < s2.length(); i++){
            char currChar = s2.charAt(i);
            map2.put(currChar, map2.getOrDefault(currChar, 0) + 1);
        }

        int count = 0;

        for(int i = 0; i < s1.length(); i++) {
            char currChar = s1.charAt(i);
            if (map1.get(currChar) != map2.get(currChar)) {
                count++;
                System.out.println(count);
            }
        }

        if (count > 1) {
            return false;
        }

        return true;
    }

}
