package day03conditions;

import java.util.Scanner;

public class OrPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day =sc.nextInt();
        boolean isWeekend = day ==6 || day ==7;
        if(isWeekend){
            System.out.println("It is a weekend");
        }
        else{
            System.out.println("it is not a weekend");
        }
    }
}
