import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree{
    private TreeNode root;

    private class TreeNode{
        private final int data;
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
    private TreeNode insert(TreeNode root, int value){
        if (root == null){
            root = new TreeNode(value);
            return root;
        }
        if (value < root.data) root.left = insert(root.left, value);
        else root.right = insert(root.right, value);
        return root;
    }
    private void inOrder(TreeNode root){
        if (root == null) return;
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }
    public void inOrder(){
        inOrder(root);
    }
    private void levelOrderTraversal(TreeNode root){
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
    public void levelOrderTraversal(){
        levelOrderTraversal(root);
    }
    private TreeNode search(int key){
        return search(root, key);
    }
    private TreeNode search(TreeNode root, int key){
        if (root == null || root.data == key) return root;
        if (key < root.data) return search(root.left, key);
        else return search(root.right, key);
    }
    public boolean isValid(){
        return isValid(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    private boolean isValid(TreeNode root, long min, long max){
        if (root == null) return true;
        if (root.data < min || root.data > max) return false;
        boolean left = isValid(root.left, min, root.data);
        if (left){
            boolean right = isValid(root.right, root.data, max);
            return right;
        }
        return false;
    }
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(4);
        bst.insert(2);
        bst.insert(5);
        System.out.print("This is level-order traversal: ");
        bst.levelOrderTraversal();
        System.out.println();
        System.out.print("This is in-rder traversal: ");
        bst.inOrder();
        System.out.println();
        int key = 3;
        if (bst.search(3) != null) System.out.println(key + " is found");
        else System.out.println(key + " is not found");
        if (bst.isValid()) System.out.println("this is a valid bst");
    }
}