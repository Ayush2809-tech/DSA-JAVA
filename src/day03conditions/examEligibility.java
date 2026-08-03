package day03conditions;

import java.util.Scanner;

public class examEligibility {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int attendance = sc.nextInt();
        boolean hasAdmitCard = true;
        if (attendance>=75 && hasAdmitCard){
            System.out.println("Eligible");
        }
        else{
            System.out.println("Not Eligible");
        }

    }
}
