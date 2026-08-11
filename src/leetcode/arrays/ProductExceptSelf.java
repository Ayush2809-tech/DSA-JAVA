package leetcode.arrays;

import java.util.Scanner;

public class ProductExceptSelf {
    static  int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        int prefix=1;
        int suffix=1;
        //for left
        for(int i=0;i<nums.length;i++){
            ans[i]=prefix;
            prefix*=nums[i];
        }
        //for right
        for(int i=nums.length-1;i>=0;i--){
            ans[i]*=suffix;
            suffix*=nums[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter Array elements: ");
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        int[] ans = productExceptSelf(nums);
        System.out.println("Product Except Self: ");
        for(int num:ans){
            System.out.print(num+" ");
        }
    }
}

//Time  = O(n)
//Space = O(1) extra