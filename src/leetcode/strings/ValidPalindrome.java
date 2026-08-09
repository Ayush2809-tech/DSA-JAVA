package leetcode.strings;

import java.util.Scanner;

// leetcode - 13, #125
public class ValidPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s = sc.nextLine();
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            while(left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            while(right > left && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                System.out.println("Not a valid palindrome");
                return;
            }

            left++;
            right--;
        }
        System.out.println("Palindrome is valid");
        sc.close();

    }
}

//        Complexity: O(n) time, O(1) auxiliary space.