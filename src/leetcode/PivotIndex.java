package leetcode;

import java.util.Scanner;

public class PivotIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array:  ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter the elements of array:  ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int leftSum=0;
        int totalSum=0;

        for (int i = 0; i < n; i++) {
            totalSum+=nums[i];
        }
        int pivot = -1;

        for (int i = 0; i < n; i++) {
            int rightSum = totalSum - leftSum - nums[i];
            if (leftSum == rightSum) {
               pivot=i;
               break;
            }
            leftSum += nums[i];
        }
        System.out.println("Pivot index is: " + pivot);
    }
}


//Time: O(n)
//Auxiliary Space: O(1)