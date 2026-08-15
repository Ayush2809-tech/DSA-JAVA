package day15SlidingWindow;

public class FrequencyArrayPractice {

    public static void main(String[] args) {
        String s = "AABAC";
        int[] frequency = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            frequency[ch - 'A']++;
        }

        System.out.println("A = " + frequency['A' - 'A']);
        System.out.println("B = " + frequency['B' - 'A']);
        System.out.println("C = " + frequency['C' - 'A']);
    }
}