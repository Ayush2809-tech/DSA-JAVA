package day14SliderWindow;
import java.util.*;

public class LongestSubstringTwoDistinctPractice {
    public static void main(String[] args) {
        String s = "eceba";
        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0;
        int maxLen = 0;
        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            map.put(c, map.getOrDefault(c, 0) + 1);
            // 2. More than 2 distinct characters?
            while (map.size() > 2) {
                char leftChar = s.charAt(left);
                // frequency decrease
                map.put(leftChar, map.get(leftChar) - 1);
                // frequency becomes 0 → remove
                if (map.get(leftChar) == 0) {
                    map.remove(leftChar);
                }
                left++;
            }
            // 3. Maximum valid window
            maxLen = Math.max(maxLen, right - left + 1);
        }
        System.out.println("Maximum Length: " + maxLen);
    }
}