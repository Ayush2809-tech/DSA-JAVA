package day03conditions;

import java.util.Scanner;

public class AndPractice {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age = sc.nextInt();
        boolean eligible = age>=18 && age<=60;
        if(eligible){
            System.out.println(eligible  + " eligible");
        }
        else {
            System.out.println(eligible + " not eligible");
        }
    }
}
