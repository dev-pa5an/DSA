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
        
        root = n1;
        n1.left = n2;
        n1.right = n3;
    }
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.createBinaryTree();
        
    }
}