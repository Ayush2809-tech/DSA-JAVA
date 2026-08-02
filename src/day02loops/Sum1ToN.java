package day02loops;

import java.util.Scanner;

public class Sum1ToN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int sum = 0;
        for (int i=1; i<=n; i++){
            sum+=i;
        }
        System.out.println(sum);
    }
}
// Time Complexity: O(n)
// Space Complexity: O(1)

// without any loop :  int sum = n * (n + 1) / 2;

//Time: O(1)
//Space: O(1)