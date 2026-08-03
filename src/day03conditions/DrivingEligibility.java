package day03conditions;

import java.util.Scanner;

public class DrivingEligibility {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = input.nextInt();
        System.out.print("Do you have a license? (ans in true/false): ");
        boolean hasLicense = input.nextBoolean();

        boolean isAgeEligible = age >= 18;
        boolean canDrive = isAgeEligible && hasLicense;

        if (canDrive) {
            System.out.println("Can Drive");
        } else {
            System.out.println("Cannot Drive");
        }
    }
}