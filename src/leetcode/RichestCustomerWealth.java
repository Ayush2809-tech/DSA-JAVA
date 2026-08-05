package leetcode;

import java.util.Scanner;

public class RichestCustomerWealth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int maxWealth = 0;

        int[][] accounts = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                accounts[i][j] = sc.nextInt();
            }
        }

        for (int i=0; i<m; i++){
            int wealth = 0;
            for (int j=0; j<n; j++){
                wealth += accounts[i][j];
            }
            if(wealth>maxWealth){
                maxWealth=wealth;
            }
        }
        System.out.println("Maximum Wealth: "+ maxWealth);
    }
}
