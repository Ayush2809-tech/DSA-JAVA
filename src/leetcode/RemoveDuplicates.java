package leetcode;

import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter length of array : ");
        int n = input.nextInt();
        System.out.println("Enter no  of array:  ");
        int[] nums = new int[n];
        for(int i=0; i<n; i++){
            nums[i] = input.nextInt();
        }
        int k=1;
        for (int i=1; i<n; i++){
            if(nums[i] != nums[k-1]){
                nums[k]= nums[i];
                k++;
            }
        }
        System.out.println("No of unique elements: "+ k);
        for(int j=0; j<k; j++){
            System.out.print(nums[j]+" ");
        }
    }
}


//Time Complexity: O(n)
// Auxiliary Space: O(1)