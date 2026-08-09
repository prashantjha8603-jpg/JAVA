package java_23_arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        //ArrayList<String> list2 = new ArrayList<String>();

        list.add(0);
        list.add(3);
        list.add(7);
        System.out.println(list);

        int element=list.get(2);
        System.out.println(element);

        list.add(1,1);
        System.out.println(list);

        list.set(0,5);
        System.out.println(list);

        list.remove(3);
        System.out.println(list);

        int size = list.size();
        System.out.println(size);

        Collections.sort(list);
        System.out.println(list);

    }
}
