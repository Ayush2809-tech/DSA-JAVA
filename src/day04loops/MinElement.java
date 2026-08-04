package day04loops;

import java.util.Scanner;

public class MinElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = input.nextInt();
        }
        int min = a[0];
        for(int i=0; i<n; i++){
            if(a[i]<min){
                min = a[i];
            }
        }
        System.out.println(min);
    }
}
