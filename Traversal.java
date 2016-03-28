
import java.util.LinkedList;
import java.util.Queue;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by mona on 3/3/16.
 */
public class Traversal {

    static List<String> paths= new ArrayList<>();

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
        /*
        Queue <TreeNode> q = new LinkedList <>();
        TreeNode tmp=root;
        q.add(tmp);
        while (!q.isEmpty()) {
            System.out.print(q.remove().data + " ");
            if (tmp.left!=null) {
                q.add(tmp.left);
            }
            if (tmp.left!=null) {
                q.add(tmp.right);
            }
                tmp = q.peek();
        }
        */
        /*
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            TreeNode tmp = q.poll();
            if (tmp == null) {
                continue;
            }
            System.out.print(tmp.data + " ");
            q.add(tmp.left);
            q.add(tmp.right);
        }
        */
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            TreeNode tmp = q.remove();
            //need more thoughts here
            if (tmp == null) {
                continue;
            }

            System.out.print(tmp.data + " ");
            q.add(tmp.left);
            q.add(tmp.right);
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



    public static List<String> binaryTreePaths(TreeNode root) {
        // Write your code here
        if (root==null){
            return null;

        }
        else if (root.left==null && root.right==null) {
            System.out.print(root.data);
            paths.add(Integer.toString(root.data));
        }

        else if (root.left!=null && root.right!=null){
            System.out.print(root.data+"->");
            paths.addAll(binaryTreePaths(root.left));
            System.out.print(root.data+"->");
            paths.addAll(binaryTreePaths(root.right));
        }
        else if (root.left==null && root.right!=null){
            System.out.print(root.data+"->");
            paths.addAll(binaryTreePaths(root.right));
        }

        else if (root.left!=null && root.right==null){
            System.out.print(root.data+"->");
            paths.addAll(binaryTreePaths(root.left));
        }


        /*
        else if (root.left!=null ){
            System.out.print(root.val+"->");
            paths.addAll(binaryTreePaths(root.left));
            if (root.right!=null){
                paths.addAll(binaryTreePaths(root.right));

            }

        }
        else if (root.right!=null){
            System.out.print(root.val+"->");
            paths.addAll(binaryTreePaths(root.right));
            if (root.left!=null ){
                paths.addAll(binaryTreePaths(root.left));
            }

        }
        */


        return paths;


    }
    public static boolean isMirror(TreeNode left, TreeNode right){
        if (left==null && right==null){
            return true;
        }
        if (left!=null && right!=null) {
            if (left.data == right.data) {
                //return (isMirror(left.left, left.right) && isMirror(right.left, right.right));
                return (isMirror(left.left, right.right) && isMirror(left.right, right.left));
            }

        }
        return false;

    }

    public static boolean isSymmetric(TreeNode root){
        if (root==null){
            return true;
        }
        return isMirror(root.left, root.right);
    }


    public static void main(String[] args){
        TreeNode root=new TreeNode();
        TreeNode n1=new TreeNode();
        TreeNode n2=new TreeNode();
        TreeNode n3=new TreeNode();
       // TreeNode n4=new TreeNode();
        //TreeNode n5=new TreeNode();
        //TreeNode n6=new TreeNode();

        root.left=n1;
        root.right=n2;
        n1.left=n3;
      //  n2.right=n4;


        root.data=1;
        n1.data=2;
        n2.data=3;
        n3.data=5;
       // n4.data=1;

        binaryTreePaths(root);

        //Preorder(root);
        //System.out.println(height(root));
        //TopView(root);
        //LevelOrder(root);
      //  System.out.println(isSymmetric(root));
    }
}
