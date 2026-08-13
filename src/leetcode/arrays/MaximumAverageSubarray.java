package leetcode.arrays;

import java.util.Scanner;

public class MaximumAverageSubarray {
    public static double findMaxAverageSubarray(int[] nums, int k) {
        int sum =0;
        for (int i=0; i<k; i++){
            sum+=nums[i];
        }
        int maxSum=sum;

        for(int r=k; r<nums.length; r++){
            sum = sum-nums[r-k]+nums[r];
            maxSum=Math.max(maxSum,sum);
        }
        return (double) maxSum/k;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n = input.nextInt();
        System.out.println("Enter window size: ");
        int k = input.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements in the array");
        for (int i = 0; i < n; i++) {
            nums[i] = input.nextInt();
        }
        double ans = findMaxAverageSubarray(nums, k);
        System.out.println("Maximum Average: "+ans);
    }
}


//Time  = O(n)
//Space = O(1)