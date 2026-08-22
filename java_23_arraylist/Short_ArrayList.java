package java_23_arraylist;

import java.util.*;

public class Short_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(43);
        list.add(34);
        list.add(41);
        list.add(22);
        list.add(97);
        System.out.println("Original list " + list);
        Collections.sort(list);
        System.out.println("Ascending order " + list);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Descending order " + list);

        ArrayList<String> l1 = new ArrayList<>();
        l1.add("I");
        l1.add("Am");
        l1.add("A");
        l1.add("Student");
        l1.add("Of");
        l1.add("CSE");

        System.out.println("Original list " + l1);
        Collections.sort(l1);
        System.out.println("Ascending order " + l1);
        Collections.sort(l1, Collections.reverseOrder());
        System.out.println("Descending order " + l1);
        
    }
}
