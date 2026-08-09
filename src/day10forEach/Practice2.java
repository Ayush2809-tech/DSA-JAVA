package day10forEach;

import java.util.Scanner;

public class Practice2 {
    static int maxElement(int[] nums){
        int max= nums[0];
        for(int num:nums){
            if(num>max){
                max=num;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int n = sc.nextInt();
        System.out.println("Enter numbers: ");
        int[]  nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        System.out.println("Maximum number is: "+maxElement(nums));
    }
}

// Time: O(n)
//Space: O(1)