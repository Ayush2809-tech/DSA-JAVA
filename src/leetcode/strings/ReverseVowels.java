package leetcode.strings;

import java.util.Scanner;

public class ReverseVowels {
    static boolean isVowel(char ch){
        ch = Character.toLowerCase(ch);

        return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u';
    }

    static String reverseVowels(String s){
        char[] chars = s.toCharArray();

        int left = 0;
        int right = chars.length-1;

        while(left<right){
            while(left<right && !isVowel(chars[left])){
                left++;
            }

            while(left<right && !isVowel(chars[right])){
                right--;
            }

            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;

            left++;
            right--;
        }
        return new  String(chars);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = sc.nextLine();
        System.out.println("After ReverseVowels:");
        System.out.println(reverseVowels(s));

        sc.close();
    }

}

//Time: O(n)
//Space: O(n) — char[] ki wajah se