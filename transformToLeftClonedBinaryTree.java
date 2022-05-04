import java.io.BufferedReader;
import java.io.InputStreamReader;

public class transformToLeftClonedBinaryTree {

    public static BinaryTree.Node createLeftCloneTree(BinaryTree.Node node){

        if(node==null){

            return null;

        }

        BinaryTree.Node leftChildRoot = createLeftCloneTree(node.left);
        BinaryTree.Node rightChildRoot = createLeftCloneTree(node.right);

        node.left = new BinaryTree.Node(node.data, leftChildRoot, null);
        node.right = rightChildRoot;

        return node;
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

        root = createLeftCloneTree(root);
        displayBinaryTree.displayBinaryT(root);

    }
}
