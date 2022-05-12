import java.io.BufferedReader;
import java.io.InputStreamReader;

public class sizeSumMaxMinBinarySearchTree {

    public static int size(BinaryTree.Node node) {
        int s=0;
        if(node!=null){
            s++;
            int rs = size(node.right);
            int ls = size(node.left);
            s+=rs+ls;
        }
        return s;
    }

    public static int sum(BinaryTree.Node node) {
        int sum = 0;
        if(node!=null){
            sum+= node.data;
            int rs = sum(node.right);
            int ls = sum(node.left);
            sum+=rs+ls;
        }
        return sum;
    }

    public static int max(BinaryTree.Node node) {
        int max = Integer.MIN_VALUE;
        if(node==null){

            return max;

        }
        int rMax = max(node.right);
        return Math.max(node.data, rMax);
    }

    public static int min(BinaryTree.Node node) {
        int min = Integer.MAX_VALUE;
        if(node==null){

            return min;

        }
        int lMin = min(node.left);
        return Math.min(node.data, lMin);
    }

    public static boolean find(BinaryTree.Node node, int data){
        if(node==null){

            return false;

        }

        if(data>node.data){

            return find(node.right,data);

        } else if(data<node.data){

            return find(node.left,data);

        } else {

            return true;

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

        int data = Integer.parseInt(br.readLine());
        BinaryTree.Node root = BinaryTree.construct(arr);

        int size = size(root);
        int sum = sum(root);
        int max = max(root);
        int min = min(root);
        boolean found = find(root, data);

        System.out.println(size);
        System.out.println(sum);
        System.out.println(max);
        System.out.println(min);
        System.out.println(found);
    }
}
