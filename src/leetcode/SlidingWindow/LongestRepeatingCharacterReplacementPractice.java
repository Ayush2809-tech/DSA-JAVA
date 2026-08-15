package leetcode.SlidingWindow;

public class LongestRepeatingCharacterReplacementPractice {

    public static void main(String[] args) {

        String s = "AABABBA";
        int k = 1;

        int[] frequency = new int[26];

        int left = 0;
        int maxFrequency = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {

            // 1. Add current character
            char ch = s.charAt(right);
            frequency[ch - 'A']++;

            // 2. Update maximum frequency
            maxFrequency = Math.max(
                    maxFrequency,
                    frequency[ch - 'A']
            );

            // 3. Calculate replacements
            int replacements =
                    right - left + 1 - maxFrequency;

            // 4. If window is invalid, shrink it
            if (replacements > k) {

                char leftChar = s.charAt(left);

                frequency[leftChar - 'A']--;

                left++;
            }

            // 5. Update maximum valid window length
            maxLength = Math.max(
                    maxLength,
                    right - left + 1
            );
        }

        System.out.println("Maximum Length: " + maxLength);
    }
}

//Time Complexity = O(n)
//Space Complexity = O(26) = O(1)