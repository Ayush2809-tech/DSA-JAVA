package leetcode.basics;

import java.util.Scanner;

// leetcode 09
public class RunningSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the array");
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        for(int j=1;j<n;j++){
            nums[j] = nums[j]+nums[j-1];
        }
        System.out.println("Prefix Sum Array");
        for(int k=0;k<n;k++){
            System.out.print(nums[k]+" ");
        }
    }
}


// Time: O(n)
// Auxiliary Space: O(1)