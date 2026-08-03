package leetcode;

import java.util.*;

public class FizzBuzz {
    public static void main(String[] args) {
        List<String> a = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i=1; i<=n; i++){
            if  (i%3==0 && i%5==0) a.add("FizzBuzz");
            else if(i%3==0) a.add("Fizz");
            else if(i%5==0) a.add("Buzz");
            else a.add(Integer.toString(i));
        }
        System.out.println(a);
    }
}
