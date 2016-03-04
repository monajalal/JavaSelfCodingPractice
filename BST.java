import apple.laf.JRSUIUtils;

/**
 * Created by mona on 3/3/16.
 */
public class BST {

    public static TreeNode BSTInsert(TreeNode root, int value) {

        if (root==null){
            TreeNode newNode = new TreeNode();
            newNode.data = value;
            return newNode;
        }
        else {
            if (value < root.data) {
                if (root.left != null) {
                    BSTInsert(root.left, value);
                } else {
                    TreeNode newNode = new TreeNode();
                    newNode.data = value;
                    root.left=newNode;
                    return root;
                }
            } else {
                if (root.right != null) {
                    BSTInsert(root.right, value);
                } else {
                    TreeNode newNode = new TreeNode();
                    newNode.data = value;
                    root.right=newNode;
                    return root;
                }
            }
        }

        return root;

    }

    public static void Preorder(TreeNode root) {

        if (root != null) {
            System.out.print(root.data + " ");
            Preorder(root.left);
            Preorder(root.right);
        }
    }

    public static void main(String[] args) {

        TreeNode root = null;
        BSTInsert(root, 3);
        BSTInsert(root, 6);
        Preorder(root);
    }
}
