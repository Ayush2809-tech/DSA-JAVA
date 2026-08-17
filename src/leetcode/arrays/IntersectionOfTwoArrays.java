package leetcode.arrays;

import java.util.HashSet;

public class IntersectionOfTwoArrays {

    public static int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> set = new HashSet<>();

        // nums1 ke elements Set mein
        for (int num : nums1) {
            set.add(num);
        }

        // Common elements
        HashSet<Integer> result = new HashSet<>();

        for (int num : nums2) {
            if (set.contains(num)) {
                result.add(num);
            }
        }

        // HashSet → int[]
        int[] ans = new int[result.size()];

        int i = 0;

        for (int num : result) {
            ans[i++] = num;
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};

        int[] answer = intersection(nums1, nums2);

        System.out.print("Intersection: ");

        for (int num : answer) {
            System.out.print(num + " ");
        }
    }
}