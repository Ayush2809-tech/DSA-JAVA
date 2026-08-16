package day15SlidingWindow;

public class MaximumNumberOfVowelsPractice {
    public static void main(String[] args) {

        String s = "abciiidef";
        int k = 3;
        int currentVowels = 0;
        // First window
        for (int i = 0; i < k; i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i'
                    || ch == 'o' || ch == 'u') {
                currentVowels++;
            }
        }
        int maxVowels = currentVowels;

        System.out.println("Maximum Vowels: " + maxVowels);
    }
}
