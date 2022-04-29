public class displayBinaryTree {

    public static void displayBinaryT(BinaryTree.Node node){

        if(node==null){
            return;
        }
        String str = "";
        str += node.left==null? ".":node.left.data+"";
        str +=" <- "+node.data+" -> ";
        str += node.right==null? ".":node.right.data+"";
        System.out.println(str);

        displayBinaryT(node.left);
        displayBinaryT(node.right);
    }
}
