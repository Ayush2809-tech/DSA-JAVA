package day03conditions;

import java.util.Scanner;

public class NotPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean isRaining = input.nextBoolean();
        if(!isRaining){
            System.out.println("It is not Raining");
        }
        else {
            System.out.println("It is Raining");
        }

    }
}
