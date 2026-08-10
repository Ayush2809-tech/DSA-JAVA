package leetcode.arrays;

import java.util.Scanner;
public class RotateArray {
    static void rotate(int[] nums, int k) {
        k = k % nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size:");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("Enter k:");
        int k = sc.nextInt();
        rotate(nums, k);
        System.out.println("Array after rotation:");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}

// Complexity:
//Time O(n)
//Space O(1)