import java.io.BufferedReader;
import java.io.InputStreamReader;

public class pathToLeafFromRoot {

    public static void pathToLeafFromRootBinaryTree(BinaryTree.Node node, String path, int sum, int lo, int hi){

        if(node==null){

            return;

        }

        if(node.left==null&&node.right==null) {
            sum+=node.data;
            if (sum >= lo && sum <= hi) {

                System.out.println(path+node.data);

            }
            return;
        }
        pathToLeafFromRootBinaryTree(node.left,path + node.data+" ",sum + node.data,lo,hi);
        pathToLeafFromRootBinaryTree(node.right, path + node.data+" ", sum + node.data, lo, hi);

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

        int lo = Integer.parseInt(br.readLine());
        int hi = Integer.parseInt(br.readLine());

        BinaryTree.Node root = BinaryTree.construct(arr);
        pathToLeafFromRootBinaryTree(root, "", 0, lo, hi);

    }
}
