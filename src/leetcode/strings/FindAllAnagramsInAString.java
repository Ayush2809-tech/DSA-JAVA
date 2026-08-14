package leetcode.strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindAllAnagramsInAString {
    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> answer = new ArrayList<>();
        HashMap<Character, Integer> pMap = new HashMap<>();
        HashMap<Character, Integer> windowMap = new HashMap<>();
        // p ki frequency
        for (int i = 0; i < p.length(); i++) {
            char ch = p.charAt(i);
            pMap.put(ch, pMap.getOrDefault(ch, 0) + 1);
        }
        int left = 0;
        for (int right = 0; right < s.length(); right++) {
            // New character add
            char ch = s.charAt(right);
            windowMap.put(ch, windowMap.getOrDefault(ch, 0) + 1);
            // Window p se badi ho gayi
            if (right - left + 1 > p.length()) {
                char leftChar = s.charAt(left);
                windowMap.put(leftChar,
                        windowMap.get(leftChar) - 1);

                if (windowMap.get(leftChar) == 0) {
                    windowMap.remove(leftChar);
                }
                left++;
            }
            // Anagram mil gaya
            if (windowMap.equals(pMap)) {
                answer.add(left);
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        String s = "cbaebabacd";
        String p = "abc";
        List<Integer> result = findAnagrams(s, p);
        System.out.println(result);
    }
}