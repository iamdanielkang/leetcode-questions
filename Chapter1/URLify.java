package Chapter1;

import java.util.*; 

// Write a method to replace all spaces in a string with '%20'. 
// You may assume that the string has sufficient space at the end 
// to hold the additional characters,and that you are given the "true"
// length of the string. (Note: If implementing in Java,please 
// use a character array so that you can perform this operation in place.)

public class URLify {
    
    // Iterate through every character in a string, when it finds a space, copy
    // the string into a new string of same size but with 3 more chars

    public static Boolean urlify(char[] s, int trueLength) {

        int count = 0;
        for(int i = 0; i < trueLength; i++) {
            if (s[i] == ' ') {
                count++;
            }
        }
        count = trueLength + 2*count;

        

        return true;
    }
}
