package z28;

import java.util.HashSet;
import java.util.TreeSet;

public class HashTree {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(7);
        hashSet.add(6);
        hashSet.add(1);
        hashSet.add(4);
        hashSet.add(11);

        TreeSet<Integer> treeSet = new TreeSet<>(hashSet);

        System.out.println("TreeSet: " + treeSet);
    }
}

