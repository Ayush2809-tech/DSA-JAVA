package leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class SquaresOfSortedArray {
    static int[] sortedSquares(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int[] result = new int[nums.length];
        int pos = nums.length - 1;
        while (left <= right) {
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];
            if (leftSquare > rightSquare) {
                result[pos] = leftSquare;
                left++;
            } else {
                result[pos] = rightSquare;
                right--;
            }
            pos--;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size:");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter sorted array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int[] result = sortedSquares(nums);
        System.out.println("Sorted Squares:");
        System.out.println(Arrays.toString(result));
        sc.close();
    }
}


//Complexity: O(n) time, O(n) space.