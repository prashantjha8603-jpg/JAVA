package java_24_linkedlist;

public class implementation {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static class linkedlist {
        Node head = null;
        Node tail = null;

        void insertAtHead(int val) {
            Node temp = new Node(val);
            if (head == null) {
                insertAtEnd(val);
            } else {
                temp.next = head;
                head = temp;
            }
        }

        void insertAtEnd(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = temp;
            } else {
                tail.next = temp;
            }
            tail = temp;
        }

        void insertAt(int idx, int val) {
            Node t = new Node(val);
            Node temp = head;
            if (idx == size()) {
                insertAtEnd(val);
                return;
            }
            if (idx == 0) {
                insertAtHead(val);
                return;
            }
            for (int i = 1; i < idx; i++) {
                temp = temp.next;
            }
            t.next = temp.next;
            temp.next = t;
        }

        int getAt(int idx) {
            Node temp = head;
            for (int i = 1; i <= idx; i++) {
                temp = temp.next;
            }
            return temp.data;
        }

        void deleteAt(int idx) {
            Node temp = head;
            if (idx == 0) {
                head = head.next;
                return;
            }
            for (int i = 1; i < idx; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if (idx == size()) {
                tail = temp;
            }
        }

        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        int size() {
            Node temp = head;
            int count = 0;
            while (temp != null) {
                count++;
                temp = temp.next;
            }
            return count;
        }

        public static void main(String[] args) {
            linkedlist ll = new linkedlist();
            ll.insertAtEnd(4);
            ll.insertAtEnd(5);
            ll.insertAtEnd(6);
            ll.insertAtEnd(7);
            ll.display();
            System.out.println(ll.size());
            ll.insertAtHead(76);
            ll.display();
            ll.insertAt(5, 98);
            ll.display();
            System.out.println(ll.tail.data);
            ll.insertAt(0, 100);
            ll.display();
            System.out.println(ll.getAt(4));
            ll.deleteAt(6);
            ll.display();
            System.out.println(ll.tail.data);
        }
    }
}