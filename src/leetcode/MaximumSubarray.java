package leetcode;

import java.util.*;

public class MaximumSubarray {
    static int maxSubArray(int[] nums) {

        int maxSum = nums[0];
        int currentSum = nums[0];
        for(int i=1; i< nums.length; i++){
            currentSum += Math.max(nums[i], currentSum+nums[i]);
            maxSum = Math.max(currentSum, maxSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements in the array: ");
        int[] nums = new int[n];
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println("MaxSum: "+maxSubArray(nums));
    }
}


//Time: O(n)
//Space: O(1)