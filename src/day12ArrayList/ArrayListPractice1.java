package day12ArrayList;

import java.util.ArrayList;

public class ArrayListPractice1 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println("Print List:");
        System.out.println(list);
        System.out.println("Element at index 2: " + list.get(2));
        System.out.println("Size: " + list.size());
        list.remove(1);
        System.out.println("Final List: " + list);
    }
}


//Operation	Complexity
//add(x)	O(1) amortized
//get(index)	O(1)
//set(index, x)	O(1)
//size()	O(1)
//remove(index)	O(n)
//Search contains(x)	O(n)