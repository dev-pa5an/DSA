
import java.util.Stack;

public class BinaryTree{
    private TreeNode root;

    private class TreeNode{
        private TreeNode left;
        private TreeNode right;
        private final int data;

        public TreeNode(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public BinaryTree(){
        this.root = null;
    }
    public void createBinaryTree(){
        TreeNode n1 = new TreeNode(9);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        
        root = n1;
        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        
    }
    //pre-order traversal recursive approach
    public void preOrderTraversal(TreeNode root){
        if (root == null){
            return;
        }
        System.out.print(root.data + " ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }
    //pre-order traversal iterative approach
    public void preOrder(TreeNode root){
        if (root == null) return;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()){
            TreeNode temp = stack.pop();
            System.out.println(temp.data + " ");
            if (temp.right != null) stack.push(temp.right);
            if (temp.left != null) stack.push(temp.left);
        }
    }
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.createBinaryTree();
        bt.preOrderTraversal(bt.root);
        
    }
}