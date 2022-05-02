import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class iterativePrePostInOrderTraversals {

    public static void iterativeOrdersTraversals(BinaryTree.Node node){

        Stack<BinaryTree.Pair> st = new Stack<>();
        BinaryTree.Pair rootPair = new BinaryTree.Pair(node, 1);
        st.push(rootPair);
        String pre = "Pre : ", in = "In : ", post = "Post : ";

        while (st.size()>0){

            BinaryTree.Pair top = st.peek();
            if(top.state==1){

                pre += top.node.data + "";
                top.state++;

                if(top.node.left!=null){

                    BinaryTree.Pair lp = new BinaryTree.Pair(top.node.left, 1);
                    st.push(lp);
                }

            } else if(top.state==2){

                in += top.node.data + "";
                top.state++;

                if(top.node.right!=null){

                    BinaryTree.Pair rp = new BinaryTree.Pair(top.node.right, 1);
                    st.push(rp);
                }

            } else {

                post += top.node.data+"";
                st.pop();

            }
        }
        System.out.println(pre+"\n"+in+"\n"+post);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Integer[] arr = new Integer[n];
        String[] values = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            if (!values[i].equals("n")) {
                arr[i] = Integer.parseInt(values[i]);
            } else {
                arr[i] = null;
            }
        }

        BinaryTree.Node root = BinaryTree.construct(arr);
        iterativeOrdersTraversals(root);

    }
}
