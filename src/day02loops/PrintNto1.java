package day02loops;

import java.util.Scanner;

public class PrintNto1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n =input.nextInt();
        for (int i = n; i > 0; i--) {
            System.out.println(i);
        }
    }
}

// time complexity - O(n)
// Space complexity - O(1)
