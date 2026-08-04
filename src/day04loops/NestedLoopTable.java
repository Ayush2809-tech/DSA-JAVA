package day04loops;

import java.util.*;

public class NestedLoopTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i=1; i<=n;i++){
            for(int j=1; j<=n; j++){
                System.out.println(i+" "+j);
            }
        }
    }
}

//Time  → O(n²)
//Space → O(1)