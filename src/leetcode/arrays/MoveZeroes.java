package leetcode.arrays;

import java.util.Scanner;

// leetcode 08
public class MoveZeroes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n = sc.nextInt();
        System.out.println("enter the numbers of the array");
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        int k = 0;
        for(int i = 0; i < n; i++){
            if(nums[i] != 0){
                int temp = nums[k];
                nums[k] = nums[i];
                nums[i] = temp;
                k++;
            }
        }
        System.out.println("Final array is:");
        for(int i = 0; i < n; i++){
            System.out.print(nums[i] + " ");
        }
    }
}

// Time: O(n)
//Auxiliary Space: O(1)ohk