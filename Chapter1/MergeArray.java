package Chapter1;

/*

Given two sorted integer arrays nums1 and nums2, merge them into one new sorted array.

Example 1:
Input: nums1 = [1,2,3], nums2 = [2,5,6]
Output: [1,2,2,3,5,6]

Example 2:
Input: nums1 = [1], nums2 = []
Output: [1]


edge cases:
empty arrays

[1,2,3]
[2,5,6]



*/

import java.io.*;
import java.util.*;

class Solution {
  public static void main(String[] args) {
    System.out.println(Arrays.toString(mergeArray(new int[] {1,2,3}, new int[] {2, 5, 6})));
    System.out.println(Arrays.toString(mergeArray(new int[] {1,2,3}, new int[0])));
    System.out.println(Arrays.toString(mergeArray(new int[0], new int[] {2, 5, 6})));
  }
  
  public static int[] mergeArray(int[] nums1, int[] nums2) {
    
    
    int[] nums3 = new int[nums1.length + nums2.length];  
    
    int i = 0,j = 0;
    
    while(i < nums1.length || j < nums2.length) {
      if (j == nums2.length || (i < nums1.length && nums1[i] < nums2[j])) {
        nums3[i+j] = nums1[i];
        i++;
      } 
      else {
        nums3[i+j] = nums2[j];
        j++;
      }
    }
    
     /*
    
    while(i < nums1.length && j < nums2.length) {
      if (nums1[i] < nums2[j]) {
        nums3[i+j] = nums1[i];
        i++;
      } 
      else {
        nums3[i+j] = nums2[j];
        j++;
      }
    }
    
    while (j < nums2.length) {
      nums3[i+j] = nums2[j];
      j++;
    }
    
    while (i < nums1.length) {
      nums3[i+j] = nums1[i];
      i++;
    }
    
    */
    
    return nums3;
  }
  
}
