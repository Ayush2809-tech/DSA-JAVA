package day04loops;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        int s = sc.nextInt();

        for(int i=0; i<n; i++){
            if(a[i]==s){
                System.out.println("Found at index "+i);
                break;
            }
        }

    }
}
