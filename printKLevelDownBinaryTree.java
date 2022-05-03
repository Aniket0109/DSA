import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;

public class printKLevelDownBinaryTree {

    public static void printKLevelsDown(BinaryTree.Node node, int k){

        Queue<BinaryTree.Node> mq = new ArrayDeque<>();
        mq.add(node);
        int ko = -1;

        while(mq.size()>0){

            ko++;
            int count = mq.size();
            for(int i=0; i<count; i++){

                node = mq.remove();
                if(ko==k) {
                    System.out.print(node.data+" ");
                }

                if(node.left!=null){
                    mq.add(node.left);
                }
                if(node.right!=null){
                    mq.add(node.right);
                }
            }
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

        int k = Integer.parseInt(br.readLine());

        BinaryTree.Node root = BinaryTree.construct(arr);

        printKLevelsDown(root, k);
        System.out.println();

    }
}
