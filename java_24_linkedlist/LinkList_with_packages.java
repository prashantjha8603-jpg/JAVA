package java_24_linkedlist;

import java.util.LinkedList;

public class LinkList_with_packages {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.addFirst(" who");
        list.addFirst("exactly");
        list.addFirst("am");
        list.addFirst("I");
        System.out.println(list);
        list.addLast("i");
        list.addLast("think");
        list.addLast("I");
        list.add("am");
        System.out.println(list);

        System.out.println(list.size());

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " -> ");
        }
        System.out.println("null");

        list.removeFirst();
        System.out.println(list);

        list.removeLast();
        System.out.println(list);

        list.remove(3);
        System.out.println(list);

    }
}