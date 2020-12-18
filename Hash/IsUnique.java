package Hash;

import java.util.*; 

// Implement an algorithm to determine if a string has all unique characters. 
// What if you cannot use additional data structures?

public class IsUnique {
    public static void main(String[] args) {
        
        String str = "123456789a0";
		
		System.out.println("String: " + str);
		System.out.println("Hashmap: " + isUnique2(str));
		
		System.out.println();
		
		str = "AbCcdefbz";
		System.out.println("String: " + str);
		System.out.println("Hashmap: " + isUnique2(str));
    }

	// Second method using an array. Essentially, I check that the values after the current char are not 
	// the same, otherwise, you return false.
	public static Boolean isUnique2(String s) {

		for (int i = 0; i < s.length(); i++){
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j))
                    return false;
			}
		}

		return true;
	}


	// This method checks to see if the value at the given key is null
	// if it isn't, then there is a duplicate, therefore false.
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
