package day10forEach;

import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size: ");
        int size = input.nextInt();
        System.out.println("Enter number: ");
        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            nums[i] = input.nextInt();
        }
        System.out.println("Output: ");
        for (int i=0;i<size;i++) {
            System.out.println("Index "+i+" = "+nums[i]);
        }
    }
}
