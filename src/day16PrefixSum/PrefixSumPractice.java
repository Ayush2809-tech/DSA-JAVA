package day16PrefixSum;

public class PrefixSumPractice {
    public static void main(String[] args) {
        int[] nums = {3,2,5,1,4};
        int[] prefix = new int[nums.length];
        prefix[0]=nums[0];
        for(int i=1; i<nums.length; i++){
            prefix[i] = prefix[i-1]+nums[i];
        }
        for(int i=0; i< prefix.length; i++){
            System.out.print(prefix[i]+" ");
        }
    }
}
