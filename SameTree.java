/**
 * Created by mona on 3/5/16.
 */
public class SameTree {
    public static boolean isSameTree(TreeNode p, TreeNode q) {

        if (p.data==q.data){
            if (p.left!=null && q.left!=null) {
                if (isSameTree(p.left, q.left)) {
                    if (p.right != null && q.right != null) {
                        return isSameTree(p.right, q.right);
                    }
                }
            }
        }
        return false;

    }

    public static void main(String[] args){
        TreeNode p=new TreeNode();
        TreeNode p1=new TreeNode();
        TreeNode p2=new TreeNode();

        p.data=5;
        p.left=p1;
        p.right=p2;
        p1.data=2;
        p2.data=3;


        TreeNode q=new TreeNode();
        TreeNode q1=new TreeNode();
        TreeNode q2=new TreeNode();

        q.data=5;
        q.left=q1;
        q.right=q2;
        q1.data=2;
        q2.data=3;

        System.out.println(isSameTree(p, q));
    }
}
