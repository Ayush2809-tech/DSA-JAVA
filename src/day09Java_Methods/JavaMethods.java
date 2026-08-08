package day09Java_Methods;

import java.util.Scanner;
class Square{
    static int square(int n){
        return n*n;
    }
}
class Cube{
    static int cube(int n){
        return n*n*n;
    }
}

class EvenOrOdd{
    static void evenOrOdd(int n) {
        if (n % 2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
}

public class JavaMethods {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a No: ");
        int n = input.nextInt();
        System.out.println("Square is: " + Square.square(n));
        System.out.println("Cube is: " + Cube.cube(n));
        System.out.println("Even or Odd result ");
        EvenOrOdd.evenOrOdd(n);
        input.close();
    }
}
