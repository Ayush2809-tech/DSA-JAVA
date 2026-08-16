package leetcode.prefixsum;

public class SubarraysDivByK {
    public static int subarraysDivByK(int[] nums, int k) {
        int[] remainderCount = new int[k];
        remainderCount[0] = 1;

        int sum = 0;
        int count = 0;
        for (int num : nums) {
            sum += num;
            int rem = ((sum % k) + k) % k;
            count += remainderCount[rem];
            remainderCount[rem]++;
        }
        return count;
    }
    public static void main(String[] args) {
        int[] nums = {4, 5, 0, -2, -3, 1};
        int k = 5;
        int answer = subarraysDivByK(nums, k);
        System.out.println("Subarrays divisible by K: " + answer);
    }
}