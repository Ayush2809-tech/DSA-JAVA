package day12ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class SearchElement {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        Scanner input = new Scanner(System.in);
        System.out.println("Enter target: ");
        int target = input.nextInt();
        boolean found = false;
        for (int i = 0; i<list.size();i++){
            if(list.get(i).equals(target)){
                System.out.println("Target found at index: "+i);
                found = true;
                break;
            }
        }
        if(!found) {
            System.out.println("Not found");
        }
    }
}

//Time: O(n)
//Space: O(1)