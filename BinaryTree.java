import java.util.Stack;

public class BinaryTree {

    public static class binaryTree{


    }

    private static class Node{

        int data;
        Node left;
        Node right;

        Node(int data, Node left, Node right){

            this.data = data;
            this.left = left;
            this.right = right;

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

    public static void main(String[] args){

        Integer[] arr = {50, 25, 12, null, null, 37, 30, null, null, null, 75, 62, null, 70, null, null, 87, null, null};
        Node root = new Node(arr[0], null, null);
        Pair rootPair = new Pair(root, 1);
        Stack<Pair> st = new Stack<>();
        st.push(rootPair);

        int idx =0;
        while(st.size()>0){

            Pair top = st.peek();

            if(top.state==1){

                st.push(new Pair(top.node.left, 1));
                top.state++;

            } else if(top.state==2){

                st.push(new Pair(top.node.right, 1));
                top.state--;

            } else {

                st.pop();

            }
        }
    }
}
