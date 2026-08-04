package day04loops;

import java.util.*;

public class ArrayBasics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for  (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
        System.out.println("Third Element: "+a[2]);
    }
}
