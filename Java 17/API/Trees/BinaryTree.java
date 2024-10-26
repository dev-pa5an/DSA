
import java.util.LinkedList;
import java.util.Queue;
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
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);
        TreeNode n6 = new TreeNode(6);
        TreeNode n7 = new TreeNode(7);
        TreeNode n8 = new TreeNode(8);
        TreeNode n9 = new TreeNode(9);
        TreeNode n10 = new TreeNode(10);
        
        root = n1;
        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        n2.right = n5;
        n3.left = n6;
        n3.right = n7;
        n4.left = n8;
        n6.left = n9;
        n6.right = n10;
        
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
    //post order traversal recursive approach
    public void postOrder(TreeNode root){
        if (root != null){
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");
        }
    }
    //post order traversal iterative approach
    public void postOrderIter(TreeNode root){
        System.out.println("This is post-order iterative binary traversal");
        Stack<TreeNode> stack = new Stack<>(); 
        TreeNode current = root; 
        while (!stack.isEmpty() || current != null){
            if (current != null){
                stack.push(current);
                current = current.left; 
            } else {
                TreeNode temp = stack.peek().right; 
                if (temp == null){
                    temp = stack.pop(); //
                    System.out.print(temp.data + " "); 
                    while (!stack.isEmpty() && temp == stack.peek().right){
                        temp = stack.pop();
                        System.out.print(temp.data + " ");
                    }
                } else {
                    current = temp;
                }
            }
        }
    }
    //in-order traversal recursive approach
    public void inOrder(TreeNode root){
        if (root != null){
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }
    }
    //level order traversal
    public void levelOrder(TreeNode root){
        if (root != null){
            Queue<TreeNode> queue = new LinkedList<>();
            queue.offer(root);
            TreeNode current = root;
            while (!queue.isEmpty()){
                current = queue.poll();
                if (current != null){
                    System.out.print(current.data + " ");
                    queue.offer(current.left);
                    queue.offer(current.right);
                } 
            }
        }
    }
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.createBinaryTree();
        bt.preOrderTraversal(bt.root);
        System.out.println();
        bt.inOrder(bt.root);
        System.out.println();
        bt.levelOrder(bt.root);
        System.out.println();
        bt.postOrderIter(bt.root);
        System.out.println();
        
    }
}