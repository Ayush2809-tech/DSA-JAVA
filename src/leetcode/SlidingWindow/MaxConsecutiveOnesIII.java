package leetcode.SlidingWindow;

import java.util.Scanner;

public class MaxConsecutiveOnesIII {
    public static int longestOnes(int[] nums, int k){
        int left=0;
        int zeroes=0;
        int maxLength=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                zeroes++;
            }
            while(zeroes>k){
                if(nums[left]==0){
                    zeroes--;
                }
                left++;
            }
            maxLength=Math.max(maxLength,i-left+1);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = in.nextInt();
        int[] nums=new int[n];
        System.out.println("Enter the elements of array:");
        for(int i=0;i<n;i++){
            nums[i]=in.nextInt();
        }
        System.out.println("Enter k: ");
        int k=in.nextInt();
        int ans=longestOnes(nums,k);
        System.out.println("Maximum Consecutive Ones is: "+ans);

        in.close();


    }
}
