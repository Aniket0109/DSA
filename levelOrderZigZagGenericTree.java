import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;

public class levelOrderZigZagGenericTree {

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

    public static int size(Node node) {
        int s = 0;

        for (Node child : node.children) {
            s += size(child);
        }
        s += 1;

        return s;
    }

    public static int max(Node node) {
        int m = Integer.MIN_VALUE;

        for (Node child : node.children) {
            int cm = max(child);
            m = Math.max(m, cm);
        }
        m = Math.max(m, node.data);

        return m;
    }

    public static int height(Node node) {
        int h = -1;

        for (Node child : node.children) {
            int ch = height(child);
            h = Math.max(h, ch);
        }
        h += 1;

        return h;
    }

    public static void traversals(Node node){
        System.out.println("Node Pre " + node.data);

        for(Node child: node.children){
            System.out.println("Edge Pre " + node.data + "--" + child.data);
            traversals(child);
            System.out.println("Edge Post " + node.data + "--" + child.data);
        }

        System.out.println("Node Post " + node.data);
    }

    public static void levelOrderLinewiseZZ(Node node){
        Stack<Node> ms = new Stack<>();
        Stack<Node> cs = new Stack<>();
        ms.push(node);
        boolean level=false;

        while(ms.size()>0){

            node = ms.pop();
            System.out.print(node.data+" ");

            if(!level){

                for(int i=0; i<node.children.size(); i++){

                    Node child = node.children.get(i);
                    cs.push(child);

                }

            } else {

                for(int i = node.children.size()-1; i>=0; i--){

                    Node child = node.children.get(i);
                    cs.push(child);

                }

            }

            if(ms.size()==0){

                ms = cs;
                level = true;
                cs = new Stack<>();
                System.out.println();

            }
        }
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
        levelOrderLinewiseZZ(root);
    }
}