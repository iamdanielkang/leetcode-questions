package Hash;

import java.util.*; 

// Implement an algorithm to determine if a string has all unique characters. 
// What if you cannot use additional data structures?

public class IsUnique {
    public static void main(String[] args) {
        
        String str = "123456789a0";
		
		System.out.println("String: " + str);
		System.out.println("Hashmap: " + isUnique(str));
		
		System.out.println();
		
		str = "AbCcdefbz";
		System.out.println("String: " + str);
		System.out.println("Hashmap: " + isUnique(str));
    }

    public static Boolean isUnique(String s) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(int i = 0; i < s.length(); i++) {
			char currChar = s.charAt(i);
			if(map.get(currChar) == null)
				map.put(currChar, 1);
			else
				return false;
		}
		return true;
    }
}
