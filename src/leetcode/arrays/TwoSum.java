package leetcode.arrays;

import java.util.HashMap;
import java.util.Scanner;

public class TwoSum {
    static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int needed = target - nums[i];
            if (map.containsKey(needed)) {
                return new int[]{map.get(needed), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
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
        System.out.println("Enter target:");
        int target = sc.nextInt();
        int[] result = twoSum(nums, target);
        System.out.println("Indices:");
        for (int index : result) {
            System.out.print(index + " ");
        }
    }
}

//Time: O(n) average
//Space: O(n)