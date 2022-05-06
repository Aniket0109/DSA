import java.io.BufferedReader;
import java.io.InputStreamReader;

public class diameterOfBinaryTree {

    public static int diameter1(BinaryTree.Node node) {

        if(node==null){

            return 0;

        }

        int ld = diameter1(node.left);
        int rd = diameter1(node.right);
        int f = maxSizeSumHeightBinaryTree.height(node.left)+maxSizeSumHeightBinaryTree.height(node.right)+2;

        return Math.max(f, Math.max(ld, rd));
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
        int diameter;
        diameter = diameter1(root);
        System.out.println(diameter);
    }
}
