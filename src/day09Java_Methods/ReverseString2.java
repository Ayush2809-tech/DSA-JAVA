package day09Java_Methods;

import java.util.Scanner;

public class ReverseString2 {

    public void reverseString(char[] s) {

        int left = 0;
        int right = s.length - 1;

        while (left < right) {

            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        char[] s = sc.nextLine().toCharArray();

        ReverseString2 str = new ReverseString2();

        str.reverseString(s);

        System.out.println("String after reversing: " + new String(s));

        sc.close();
    }
}