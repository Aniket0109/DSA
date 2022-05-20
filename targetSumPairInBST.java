import java.io.BufferedReader;
import java.io.InputStreamReader;

public class targetSumPairInBST {

    public static void tsp(BinaryTree.Node root,BinaryTree.Node node, int val){

        if(node==null){

            return;

        }

        tsp(root, node.left, val);
        int comp = val - node.data;
        if(node.data<comp) {

            if (sizeSumMaxMinBinarySearchTree.find(root, comp)) {

                System.out.println(node.data + " " + comp);

            }
        }
        tsp(root, node.right, val);

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

        int val = Integer.parseInt(br.readLine());
        BinaryTree.Node root = BinaryTree.construct(arr);
        tsp(root, root, val);
    }
}
