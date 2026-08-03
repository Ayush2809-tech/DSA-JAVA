package day03conditions;

import java.util.Scanner;

public class NumberClassification {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if (n>0){
            System.out.println("Positive");
        } else if (n==0) {
            System.out.println("Zero");
        }
        else  {
            System.out.println("Negative");
        }
    }
}
