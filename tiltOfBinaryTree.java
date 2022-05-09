import java.io.BufferedReader;
import java.io.InputStreamReader;

public class tiltOfBinaryTree {

    static int tilt = 0;
    public static int tilt(BinaryTree.Node node){

        if(node == null){

            return 0;

        }

        int ls = tilt(node.left);
        int rs = tilt(node.right);
        int localT = Math.abs(ls-rs);
        tilt += localT;
        return ls+rs+ node.data;

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

        tilt(root);
        System.out.println(tilt);

    }
}
