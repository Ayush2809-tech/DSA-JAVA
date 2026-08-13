package day13TwoPointer;

public class SlindingWindowPractice {
    public static void main(String[] args) {
        int[] nums = {4,2,1,7,8,1,2};
        int k= 3;

        int sum =0;
        for(int i=0; i<k; i++){
            sum+=nums[i];
        }
        int maxSum=sum;

        for(int j=k; j<nums.length; j++){
            sum=sum-nums[j-k]+nums[j];
            maxSum = Math.max(maxSum,sum);
        }
        System.out.println("Maxomum Sum: "+maxSum);
    }
}
