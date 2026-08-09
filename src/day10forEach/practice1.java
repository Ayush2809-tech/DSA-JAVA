package day10forEach;

import java.util.Scanner;

public class practice1 {
    static void printArray(int[] nums){
        for(int num : nums){
            System.out.print(num+" ");
        }
        System.out.println();
    }
    static int sumArray(int[] nums){
        int sum=0;
        for(int num : nums){
            sum+=num;
        }
//        System.out.println(sum);
        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size:");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        printArray(nums);
        System.out.println("Sum of elements: "+sumArray(nums));

    }
}
