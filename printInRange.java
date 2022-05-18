import java.io.BufferedReader;
import java.io.InputStreamReader;

public class printInRange {

    public static void pir(BinaryTree.Node node, int d1, int d2) {

        if(node==null){

            return;

        }

        if(d1<node.data&&d2<node.data){

            pir(node.left, d1, d2);

        }else if(d1>node.data&&d2>node.data){

            pir(node.right, d1, d2);

        } else {

            pir(node.left, d1, d2);
            System.out.println(node.data);
            pir(node.right, d1, d2);

        }
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

        int d1 = Integer.parseInt(br.readLine());
        int d2 = Integer.parseInt(br.readLine());
        BinaryTree.Node root = BinaryTree.construct(arr);
        pir(root, d1, d2);

    }
}
