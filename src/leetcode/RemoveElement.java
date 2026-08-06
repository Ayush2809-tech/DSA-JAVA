package leetcode;

import java.util.Scanner;

public class RemoveElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k=0;
        int[] nums = new int[n];
        for(int i=0;i<n; i++){
            nums[i] = sc.nextInt();
        }
        int val = sc.nextInt();
        for (int j=0;j<n;j++){
            if(nums[j]!=val){
                nums[k] = nums[j];
                k++;
            }
        }

        System.out.println("New length :"+ k);
        for (int j=0;j<k ;j++){
            System.out.print(nums[j]+" ");
        }
    }
}

// Time Complexity → O(n)
//Auxiliary Space → O(1)