package leetcode;

import java.util.Scanner;

public class RangeSumQuery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements: ");
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println("Enter the range: ");
        int left = sc.nextInt();
        int right = sc.nextInt();
        int[] prefix;
        prefix = new int[n];
        prefix[0] = nums[0];
        for(int i=1; i<n; i++){
            prefix[i] = prefix[i-1]+nums[i];
        }
        int ans;
        if(left==0){
            ans=prefix[right];
        }
        else{
            ans= prefix[right] - prefix[left-1];
        }
        System.out.println("Range Sum: "+ans);
    }
}


// Time = O(n)
//Auxiliary Space = O(n)

//"I preprocess the array using prefix sums in
// O(n) time and O(n) auxiliary space. After preprocessing,
// each range-sum query can be answered in O(1) time."