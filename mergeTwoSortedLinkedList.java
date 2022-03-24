import java.io.*;

public class mergeTwoSortedLinkedList {

    public static class Node {
        int data;
        Node next;
    }

    public static class LinkedList {
        Node head;
        Node tail;
        int size;

        void addLast(int val) {
            Node temp = new Node();
            temp.data = val;
            temp.next = null;

            if (size == 0) {
                head = tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }

            size++;
        }

        public int size() {
            return size;
        }

        public void display() {
            for (Node temp = head; temp != null; temp = temp.next) {
                System.out.print(temp.data + " ");
            }
            System.out.println();
        }

        public static LinkedList mergeTwoSortedLists(LinkedList l1, LinkedList l2) {
            LinkedList merged = new LinkedList();

            Node comp1 = l1.head;
            Node comp2 = l2.head;

            while(comp1!=null && comp2!=null){

                if(comp1.data>comp2.data){

                    merged.addLast(comp1.data);
                    comp1 = comp1.next;

                } else {

                    merged.addLast(comp2.data);
                    comp2 = comp2.next;

                }

            }

            while(comp2!=null){

                merged.addLast(comp2.data);
                comp2 = comp2.next;

            }

            while(comp1!=null){

                merged.addLast(comp1.data);
                comp1 = comp1.next;

            }

            return merged;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n1 = Integer.parseInt(br.readLine());
        LinkedList l1 = new LinkedList();
        String[] values1 = br.readLine().split(" ");
        for (int i = 0; i < n1; i++) {
            int d = Integer.parseInt(values1[i]);
            l1.addLast(d);
        }

        int n2 = Integer.parseInt(br.readLine());
        LinkedList l2 = new LinkedList();
        String[] values2 = br.readLine().split(" ");
        for (int i = 0; i < n2; i++) {
            int d = Integer.parseInt(values2[i]);
            l2.addLast(d);
        }

        LinkedList merged = LinkedList.mergeTwoSortedLists(l1, l2);
        merged.display();
        l1.display();
        l2.display();
    }
}
