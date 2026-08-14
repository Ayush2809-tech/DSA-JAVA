package day14SliderWindow;

import java.util.HashMap;

public class LongestSubstringHashMapPractice {
    public static void main(String[] args) {
        String s = "abcabcbb";
        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0;
        int maxLen = 0;
        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            map.put(c, map.getOrDefault(c, 0) + 1);
            while (map.get(c) > 1) {
                char leftChar = s.charAt(left);
                map.put(leftChar, map.get(leftChar) - 1);
                left++;
            }
            maxLen = Math.max(maxLen, right - left + 1);
        }
        System.out.println("Maximum Length: " + maxLen);
    }
}