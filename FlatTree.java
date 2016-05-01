/**
 * Created by mona on 5/1/16.
 */
/*
import java.util.Stack;

public class FlatTree {

    get back to this tomorrow


    public class Solution {
        public TreeNode flatten(TreeNode a) {
            if (a==null){
                return null;
            }
            if (a.right!=null) {
                if (a.left!=null) {
                    TreeNode rightTree = a.left;
                    a.left = null;
                    a.right = rightTree;
                }
                else{
                    a.left=null;
                }
            }





            flatten(a.left);
            flatten(a.right);
            return tmpTree;





        }
    }
}

//127 47 42 52 41 44 50 64 40 -1 43 45 49 51 63 77 -1 -1 -1 -1 -1 46 48 -1 -1 -1 55 -1 75 88 -1 -1 -1 -1 53 58 69 76 81
// 94 -1 54 56 60 68 73 -1 -1 79 87 92 100 -1 -1 -1 57 59 61 66 -1 72 74 78 80 85 -1 89 93 96 102 -1 -1 -1 -1 -1 62 65
// 67 71 -1 -1 -1 -1 -1 -1 -1 84 86 -1 90 -1 -1 95 99 101 -1 -1 -1 -1 -1 -1 -1 70 -1 83 -1 -1 -1 -1 91 -1 -1 98 -1 -1 -1
// -1 -1 82 -1 -1 -1 97 -1 -1 -1 -1 -1

*/
