import apple.laf.JRSUIUtils;

import java.util.logging.Level;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by mona on 3/3/16.
 */
public class Traversal {

    //Preorder traversal of a binary tree
    public static void Preorder(TreeNode root){

        if (root!=null){
                System.out.print(root.data + " ");
                Preorder(root.left);
                Preorder(root.right);
            }
        }

    public static void Postorder(TreeNode root) {
        if (root!=null){

            Postorder(root.left);
            Postorder(root.right);
            System.out.print(root.data+" ");
        }

    }

    public static void LevelOrder(TreeNode root){
        Queue <TreeNode> q = new LinkedList <TreeNode>();
        TreeNode tmp=root;
        while (tmp!=null) {
            q.add(tmp);
            if (root.left!=null) {
                q.add(tmp.left);
            }
            if (root.left!=null) {
                q.add(tmp.right);
            }
            System.out.print(q.remove().data + " ");
            tmp=q.peek();
        }

    }
    public static int height(TreeNode root){
        if (root!=null) {

            return(Math.max(height(root.left), height(root.right)) + 1);
        }
        else return 0;

    }

    public static void TopView(TreeNode root){
        if (root!=null) {
            if (root.left!=null){
                root.left.right=null;
                TopView(root.left);
            }

            System.out.println(root.data+" ");
            if (root.right!=null){
                root.right.left=null;
                TopView(root.right);
            }
        }
    }






    public static void main(String[] args){
        TreeNode root=new TreeNode();
        TreeNode n1=new TreeNode();
        TreeNode n2=new TreeNode();
        TreeNode n3=new TreeNode();
        TreeNode n4=new TreeNode();
        TreeNode n5=new TreeNode();
        TreeNode n6=new TreeNode();

        root.left=n1;
        root.right=n2;
        n1.left=n3;
        n2.left=n4;
        n2.right=n6;

        root.data=3;
        n1.data=5;
        n2.data=2;
        n3.data=1;
        n4.data=6;
        n6.data=4;


        //Preorder(root);
        //System.out.println(height(root));
        //TopView(root);
        LevelOrder(root);
    }
}
