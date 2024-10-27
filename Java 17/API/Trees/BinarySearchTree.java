import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree{
    private TreeNode root;

    private class TreeNode{
        private int data;
        private TreeNode left;
        private TreeNode right;

        public TreeNode(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public void insert(int value){
        this.root = insert(root, value);
    }
    public TreeNode insert(TreeNode root, int value){
        if (root == null){
            root = new TreeNode(value);
            return root;
        }
        if (value < root.data) root.left = insert(root.left, value);
        else root.right = insert(root.right, value);
        return root;
    }
    public void levelOrderTraversal(TreeNode root){
        if (root == null) return;
        Queue<TreeNode> q = new LinkedList<>();
        TreeNode current = root;
        q.offer(current);
        while (!q.isEmpty()){
            current = q.poll();
            System.out.print(current.data + " ");
            if (current.left != null) q.offer(current.left);
            if (current.right != null) q.offer(current.right);

        }
    }
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(4);
        bst.insert(bst.root, 2);
        bst.insert(bst.root, 5);
        bst.levelOrderTraversal(bst.root);
        
    }
}