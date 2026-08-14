package leetcode.SlidingWindow;

public class MinimumSizeSubarraySum {
    public static int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int sum = 0;
        int minLength = nums.length + 1;
        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];
            while (sum >= target) {
                minLength = Math.min(minLength, right - left + 1);
                sum -= nums[left];
                left++;
            }
        }
        if (minLength == nums.length+1){
            return 0;
        }
        return minLength;
    }

    public static void main(String[] args) {
        int target = 7;
        int[] nums = {2, 3, 1, 2, 4, 3};
        int answer = minSubArrayLen(target, nums);
        System.out.println("Minimum Length: " + answer);
    }
}