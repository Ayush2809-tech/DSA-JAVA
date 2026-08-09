package leetcode.twoPointers;

import java.util.Scanner;

public class TwoSumII {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();

        System.out.println("Enter the elements of the array in sorted manner:");
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.println("Enter target element:");
        int target = sc.nextInt();

        int left = 0;
        int right = n - 1;
        boolean found = false;

        while (left < right) {

            int sum = numbers[left] + numbers[right];

            if (sum == target) {
                System.out.println("Indices: " + (left + 1) + ", " + (right + 1));
                found = true;
                break;
            }
            else if (sum < target) {
                left++;
            }
            else {
                right--;
            }
        }

        if (!found) {
            System.out.println("Indices: -1, -1");
        }

        sc.close();
    }
}


//Time: O(n)
//Auxiliary Space: O(1)