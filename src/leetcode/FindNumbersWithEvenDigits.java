package leetcode;

import java.util.Scanner;

public class FindNumbersWithEvenDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int ans = 0;
        for(int i=0;i<n;i++){
            int count = 0;
            int num = a[i];
            while(num > 0){
                num = num/10;
                count++;
            }
            if(count%2==0){
                ans++;
            }
        }
        System.out.println(ans);
    }
}

// TC - O(n)
// AS -O(1)

