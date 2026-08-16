package leetcode.prefixsum;
import java.util.HashMap;

public class ContiguousArray {
    public static int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);

        int sum = 0;
        int maxLen = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                sum--;
            } else {
                sum++;
            }
            if (map.containsKey(sum)) {
                int len = i - map.get(sum);
                maxLen = Math.max(maxLen, len);
            } else {
                map.put(sum, i);
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 1};
        int answer = findMaxLength(nums);
        System.out.println("Longest Balanced Subarray: " + answer);
    }
}