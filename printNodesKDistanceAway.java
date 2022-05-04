import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class printNodesKDistanceAway {

    static ArrayList< BinaryTree.Node> path;
    public static void printKNodesFar(BinaryTree.Node node, int data, int k) {
        path = new ArrayList<>();
        find(node, data); //1
        for (int i = 0; i < path.size(); i++) { //2
            printKLevelsDown(path.get(i), k - i, i == 0 ? null : path.get(i - 1)); //3
        }

    }

    //**************** FIND FUNCTION ******************

    public static boolean find(BinaryTree.Node node, int data) {
        if (node == null)
            return false;
        if (node.data == data) {
            path.add(node);
            return true;
        }
        boolean filc = find(node.left, data);
        if (filc) {
            path.add(node);
            return true;
        }
        boolean firc = find(node.right, data);
        if (firc) {
            path.add(node);
            return true;
        }
        return false;
    }
    //****************PRINT K LEVELS DOWN****************
    public static void printKLevelsDown(BinaryTree.Node node, int k, BinaryTree.Node blocker) {
        if (node == null || k < 0 || node == blocker)
            return;
        if (k == 0)
            System.out.println(node.data);
        printKLevelsDown(node.left, k - 1, blocker);
        printKLevelsDown(node.right, k - 1, blocker);

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

        int data = Integer.parseInt(br.readLine());
        int k = Integer.parseInt(br.readLine());
        BinaryTree.Node root = BinaryTree.construct(arr);
        printKNodesFar(root, data, k);

    }
}
