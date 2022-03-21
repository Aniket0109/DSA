import java.io.BufferedReader;
import java.io.InputStreamReader;

public class aniketInLinkedList {

    public static class Node{

        int data;
        Node next;

    }

    public  static class LinkedList{

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

        void remove(){

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

                list.remove();

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

            }

            testList(list);

            str = br.readLine();

        }
    }
}
