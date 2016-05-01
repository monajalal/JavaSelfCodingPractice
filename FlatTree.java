/**
 * Created by mona on 5/1/16.
 */
public class FlatTree {

    public class Solution {
        public TreeNode flatten(TreeNode a) {
            TreeNode newRoot=a;
            if (a==null){
                return null;
            }
            newRoot.val= a.val;
            newRoot.left=null;
            if (a.left!=null){
                flatten(a.left);
            }
            if (a.right!=null){
                flatten(a.right);
            }
            return newRoot;
        }
    }
}
