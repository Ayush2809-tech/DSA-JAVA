package leetcode.arrays;

import java.util.Scanner;

public class BestTimeToBuySellStock {
    static int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int maxProfit = 0;

        for(int price : prices){
            if(price<minPrice){
                minPrice = price;
            }
            int profit = price-minPrice;

            if(profit > maxProfit){
                maxProfit = profit;
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size: ");
        int n = sc.nextInt();
        System.out.println("Enter Pricea: ");
        int[] price = new int[n];
        for(int i = 0; i < n; i++){
            price[i] = sc.nextInt();
        }

        System.out.println("Maximum Profit: "+maxProfit(price));
    }
}

// Time: O(n)
//Space: O(1)
