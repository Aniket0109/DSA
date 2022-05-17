import java.io.BufferedReader;
import java.io.InputStreamReader;

public class replaceSumOfLargerInBST {

    static int sum = 0;
    public static void rwsol(BinaryTree.Node node){
        if(node ==null){

            return;

        }

        rwsol(node.right);
        int k = node.data;
        node.data = sum;
        sum += k;
        rwsol(node.left);

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

        rwsol(root);

        displayBinaryTree.displayBinaryT(root);
    }
}
