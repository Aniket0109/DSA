import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

public class iterableAndIterator {

    public static class GenericTree implements Iterable<Integer>{

        Node root;

        GenericTree(Node root){

            this.root = root;

        }

        public Iterator<Integer> iterator(){

            Iterator<Integer> obj = new GenericTreePreorderIterator(root);
            return obj;

        }
    }

    public static class GenericTreePreorderIterator implements Iterator<Integer>{

        Integer nextVal = null;
        Stack<Pair> st;

        GenericTreePreorderIterator(Node root){

            st = new Stack<>();
            st.push(new Pair(root, -1));
            next();
        }

        public boolean hasNext(){

            if(nextVal==null){

                return false;

            } else
                return true;

        }

        public Integer next(){

            Integer fr = nextVal;

            // returns the value and update next value
            nextVal = null;
            while (st.size()>0) {
                Pair top = st.peek();
                if (top.state == -1) {

                    nextVal = top.node.data;
                    top.state++;
                    break;

                } else if (top.state == top.node.children.size()) {


                    st.pop();

                } else {

                    Pair cp = new Pair(top.node.children.get(top.state), -1);
                    st.push(cp);
                    top.state++;

                }
            }

            return fr;
        }
    }

    public static class Pair{

        Node node;
        int state;

        Pair(Node node, int state){

            this.node = node;
            this.state = state;

        }
    }
    private static class Node {
        int data;
        ArrayList<Node> children = new ArrayList<>();
    }

    public static void display(Node node) {
        StringBuilder str = new StringBuilder(node.data + " -> ");
        for (Node child : node.children) {
            str.append(child.data).append(", ");
        }
        str.append(".");
        System.out.println(str);

        for (Node child : node.children) {
            display(child);
        }
    }

    public static Node construct(int[] arr) {
        Node root = null;

        Stack<Node> st = new Stack<>();
        for (int j : arr) {
            if (j == -1) {
                st.pop();
            } else {
                Node t = new Node();
                t.data = j;

                if (st.size() > 0) {
                    st.peek().children.add(t);
                } else {
                    root = t;
                }

                st.push(t);
            }
        }

        return root;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        String[] values = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(values[i]);
        }

        Node root = construct(arr);
        GenericTree gt = new GenericTree(root);

        System.out.println("First Loop: ");
        for(int val: gt){ //dependent on iterable

            System.out.print(val+" ");

        }
        System.out.println();

        Iterator<Integer> gti = gt.iterator();

        System.out.println("Second Loop: ");
        while(gti.hasNext()){

            System.out.print(gti.next()+" ");

        }
    }
}
