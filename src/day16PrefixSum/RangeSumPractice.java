package day16PrefixSum;

public class RangeSumPractice {
    public static void main(String[] args) {
        int[] nums = {5,2,4,1,3};
        int[] prefix = new int[nums.length];
        prefix[0] = nums[0];
        for(int i=1; i<nums.length; i++){
            prefix[i]= prefix[i-1]+nums[i];
        }
        // prefix = [5,7,11,12,15]
        int left=2;
        int right=4;
        int sum;

        if(left == 0){
            sum=prefix[right];
        }else{
            sum = prefix[right]-prefix[left-1];
            //sum = 15-7 =8
        }
        System.out.println("Range Sum: "+sum);

    }
}
