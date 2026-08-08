package day09Java_Methods;

import java.util.Arrays;
import java.util.Scanner;

public class reverseArray {

    public void reverse(int[] nums){
        int left=0;
        int right=nums.length-1;
        while(left<right){
            int temp = nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        System.out.println("Enter the elements in the array");
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        reverseArray ra = new reverseArray();
        ra.reverse(nums);

        System.out.println("Reversed array is: ");
        System.out.println(Arrays.toString(nums));
        sc.close();
    }
}

//Time  = O(n)
//Space = O(1)
