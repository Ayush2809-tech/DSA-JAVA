package day15SlidingWindow;

import java.util.HashSet;

public class HashSetPractice {
    public static void main(String[] args) {
        HashSet<Character> set = new HashSet<>();
        set.add('a');
        set.add('b');
        set.add('c');
        set.add('a');
        System.out.println(set);
        System.out.println(set.contains('b'));
        System.out.println(set.contains('x'));
        set.remove('b');
        System.out.println(set);
        System.out.println(set.size());

    }
}
