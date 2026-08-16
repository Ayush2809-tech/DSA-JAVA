package leetcode.prefixsum;
import java.util.HashMap;

public class SubarraySumEqualsK {
    public static int subarraySum(int[] nums, int k) {
        int sum = 0;
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            int needed = sum - k;
            count += map.getOrDefault(needed, 0);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1};
        int k = 2;
        int answer = subarraySum(nums, k);
        System.out.println("Number of subarrays: " + answer);
    }
}

//Time → O(n)
//Space → O(n)
