import java.io.BufferedReader;
import java.io.InputStreamReader;

public class aniketInLinkedList {

    public static class Node{

        int data;
        Node next;

    }

    public static class LinkedList{

        Node head;
        Node tail;
        int size;

        void addLast(int val) {

            Node temp = new Node();
            temp.data = val;
            temp.next = null;

            if(size == 0) {

                head = tail = temp;

            } else {

                tail.next = temp;
                tail = temp;

            }
            size++;
        }

        int size(){

            return size;

        }

        void display(){

            Node temp = head;

            while (temp!=null){

                System.out.print(temp.data+" ");
                temp = temp.next;

            }
            System.out.println();
        }

        void removeFirst(){

            if(size==0){

                System.out.println("List is empty");

            } else if(size==1){

                tail = head = null;
                size = 0;

            } else {

                head = head.next;
                size--;

            }
        }

        public int getFirst(){

            if(size==0){

                System.out.println("List is Empty");
                return -1;

            } else {

                return head.data;

            }
        }

        public int getLast(){

            if(size==0){

                System.out.println("List is Empty");
                return -1;

            } else {

                return tail.data;

            }
        }

        public int getAt(int idx){

            if(idx>=size){

                System.out.println("Invalid Arguments");
                return -1;

            } else {

                Node temp = head;
                while(idx-->0){

                    temp = temp.next;

                }
                return temp.data;
            }
        }

        void addFirst(int val){

            Node temp = new Node();
            temp.data = val;
            temp.next = head;
            head = temp;

            if(size == 0) {

                tail = temp;

            }
            size++;
        }

        void addAt(int idx, int val){

            if(idx>=size||idx<0){

                System.out.println("Invalid Arguments");

            } else {

                if(idx==0){

                    addFirst(val);

                } else if(idx==size-1){

                    addLast(val);

                } else {

                    Node temp = head;
                    Node node = new Node();
                    node.data = val;

                    for(int i=0; i<idx-1; i++){

                        temp = temp.next;

                    }

                    node.next = temp.next;
                    temp.next = node;

                    size++;

                }
            }
        }

        void removeLast(){

            if(size==0){

                System.out.println("List is Empty");

            } else if(size==1){

                head = null;
                tail = null;
                size = 0;

            } else {

                Node temp = head;

                for(int i=0;i<size-2;i++){

                    temp = temp.next;

                }

                tail = temp;
                temp.next = null;
                size--;
            }
        }

        void removeAt(int idx){

            if(idx>=size||idx<0){

                System.out.println("Invalid Arguments");

            } else {

                if(idx==0){

                    removeFirst();

                } else if(idx==size-1){

                    removeLast();

                } else {

                    Node temp = head;

                    for(int i=0; i<idx-1; i++){

                        temp = temp.next;

                    }

                    temp.next = temp.next.next;

                    size--;

                }
            }
        }

        private Node getNodeAt(int idx){

            Node temp = head;

            for(int i=0;i<idx;i++){

                temp = temp.next;

            }

            return temp;
        }

        public void reverseli(){

            int li = 0;
            int ri = size -1;

            while (li<ri){

                Node left = getNodeAt(li);
                Node right = getNodeAt(ri);

                int temp = left.data;
                left.data = right.data;
                right.data = temp;

                li++;
                ri--;

            }
        }

        public void reversepi(){

            if(size <= 1){
                return;
            }

            Node prev = null;
            Node curr = head;
            while(curr != null){
                Node next = curr.next;

                curr.next = prev;
                prev = curr;
                curr = next;
            }

            Node temp = head;
            head = tail;
            tail = temp;

        }
    }

    public static void testList(LinkedList list) {

        for (Node temp = list.head; temp != null; temp = temp.next) {

            System.out.println(temp.data);

        }

        System.out.println(list.size);

        if(list.size > 0){

            System.out.println(list.tail.data);

        }
    }

    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        LinkedList list = new LinkedList();

        String str = br.readLine();
        while (!str.equals("quit")){

            if(str.startsWith("addLast")){

                int val = Integer.parseInt(str.split(" ")[1]);
                list.addLast(val);

            } else if(str.startsWith("size")){

                System.out.println(list.size());

            } else if(str.startsWith("display")){

                list.display();

            } else if(str.startsWith("remove")){

                list.removeFirst();

            } else if(str.startsWith("get first")){

                if(list.getFirst()!=-1){

                    System.out.println(list.getFirst());

                }

            } else if(str.startsWith("get last")){

                if(list.getLast()!=-1){

                    System.out.println(list.getLast());

                }

            } else if(str.startsWith("getAt")){

                int idx = Integer.parseInt(str.split(" ")[1]);

                if(list.getAt(idx)!=-1){

                    System.out.println(list.getAt(idx));

                }
            } else if(str.startsWith("addFirst")){

                int val = Integer.parseInt(str.split(" ")[1]);
                list.addFirst(val);

            } else if(str.startsWith("addAt")){

                int idx = Integer.parseInt(str.split(" ")[1]);
                int val = Integer.parseInt(str.split(" ")[2]);
                list.addAt(idx,val);

            } else if(str.startsWith("removeLast")){

                list.removeLast();

            } else if(str.startsWith("removeAt")){

                int idx = Integer.parseInt(str.split(" ")[1]);
                list.removeAt(idx);

            } else if(str.startsWith("reverseli")){

                list.reverseli();

            } else if(str.startsWith("reversepi")){

                list.reversepi();

            }

            testList(list);

            str = br.readLine();

        }
    }
}
