package leetcode.basics;

import java.util.Scanner;

public class ShuffleTheArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[2*n];
        for (int i = 0; i < 2*n; i++) {
            nums[i] = sc.nextInt();
        }

        int[] ans = new int[2*n];
        for (int i = 0; i < n; i++) {
            ans[2*i] = nums[i];
            ans[2*i+1] = nums[n+i];
        }

        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
    }
}


//TC - O(n)
// SC - O(n)