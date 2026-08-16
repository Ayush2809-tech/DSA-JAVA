package leetcode.SlidingWindow;

import java.util.Arrays;

public class CheckInclusionPractice {
    public static boolean checkInclusion(String s1, String s2) {
        int[] count1 = new int[26];
        int[] count2 = new int[26];
        //fqy of 1st
        for (int i = 0; i < s1.length(); i++) {
            count1[s1.charAt(i) - 'a']++;
        }
        // edge case
        if (s1.length() > s2.length()) {
            return false;
        }
        //1st window
        for(int i = 0; i < s1.length(); i++) {
            count2[s2.charAt(i)-'a']++;
        }
        // checking 1st window
        if(Arrays.equals(count1, count2)){
            return true;
        }
        int left=0;
        //sliding window
        for(int i = s1.length(); i < s2.length(); i++) {
            count2[s2.charAt(i) - 'a']++;
            count2[s2.charAt(left)-'a']--;
            left++;
            if(Arrays.equals(count1, count2)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "eidbaooo";
        boolean ans = checkInclusion(s1, s2);
        System.out.println("Permutation Present : "+ans);
    }
}


//Time = O(n)
//Space = O(1)