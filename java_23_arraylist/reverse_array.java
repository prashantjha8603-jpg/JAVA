package java_23_arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class reverse_array {

    // static void reverseList(ArrayList<Integer> list) {
    //     int i = 0, j = list.size() - 1;
    //     while (i < j) {

    //         Integer temp = Integer.valueOf(list.get(i));
    //         list.set(i, list.get(j));
    //         list.set(j, temp);

    //         i++;
    //         j--;
    //     }

    // }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println("Original list " + list);
        Collections.reverse(list);
        System.out.println("Reversed List " + list);
    }
}
