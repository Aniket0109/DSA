import java.io.BufferedReader;
import java.io.InputStreamReader;

public class printSingleChildNodesBinaryTree {

    public static void printSingleChildNodes(BinaryTree.Node node, BinaryTree.Node parent){

        if(node==null){

            return;

        }
        if(parent!=null&&(parent.left==null||parent.right==null)){

            System.out.println(node.data);

        }
        printSingleChildNodes(node.left, node);
        printSingleChildNodes(node.right, node);
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

        printSingleChildNodes(root, null);
    }
}
