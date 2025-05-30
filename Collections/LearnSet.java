import java.util.*;
public class LearnSet {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>(); // Unordered, no duplicates
        set.add(10);
        set.add(20);
        set.add(30);
        //System.out.println(set);

        /* Set<Integer> newSet = new HashSet<>();
        newSet.add(40);
        newSet.add(50);
        System.out.println(newSet);
        set.addAll(newSet);
        System.out.println(set);  */

        Set<Integer> newSet = new LinkedHashSet<>(); // Ordered, no duplicates, O(1) for add, remove, contains
        newSet.add(40);
        newSet.add(50);
        newSet.add(10);
        //System.out.println(newSet);

        Set<Integer> treeSet = new TreeSet<>(); // Sorted, no duplicates, O(log n) for add, remove, contains
        treeSet.add(100);
        treeSet.add(60);
        treeSet.add(70);
        System.out.println(treeSet);

    }
}
