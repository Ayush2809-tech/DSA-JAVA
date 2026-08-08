package day09Java_Methods;

import java.util.Scanner;



public class ArrayMethods {

    static void printArray(int[] nums){
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }

    static  int arraySum(int[] nums){
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        return sum;
    }

    static int findMax(int[] nums){
        int max = nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max= nums[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size:");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter Array Elements");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        printArray(nums);
        System.out.println();
        int sum = arraySum(nums);
        System.out.println("Sum: "+ sum);
        int max = findMax(nums);
        System.out.println("Max: "+ max);
    }
}
