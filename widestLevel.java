/**
 * Created by mona on 10/23/15.
 */


// Given a tree datastructure with
// multiple levels and children at each level,
// find the level with the most number of nodes
// You are allowed to modify the Node class as you please
// ie add more fields / more methods to it etc
// kbehara@apple.com
/**
 * Finding the level with highest number of nodes
 */
import java.util.HashMap;

class Solution {

    private static HashMap<Integer, Integer> levelCount = new HashMap<>();

    public  void widestLevel(Node root) {

        boolean hasChild;
        if (root.children.size()==0)
            hasChild=false;
        else
            hasChild=true;

        if (hasChild) {
            levelCount.put(root.level + 1, root.children.size());
            for (Node child : root.children) {
                widestLevel(child);

            }
        }


    }

    public int hashMapMaxValue(HashMap<Integer, Integer> hm){
        //get the first key from the hashmap
        int max=(int) hm.keySet().toArray()[0];
        //iterate over the hashmap keyset to see which key has the highest value
        for (int key : hm.keySet()){
            if (hm.get(key)>hm.get(max)){
                max=key;
            }
        }
        //return the key with maximum value
        return max;
    }

    public static void main(String[] args) {
        Node root = new Node(0);
        //creating a tree
        root.addChild(1);
        root.addChild(2);
        root.addChild(3);
        root.children.get(0).addChild(11);
        root.children.get(0).addChild(22);
        root.children.get(0).addChild(33);
        root.children.get(0).addChild(44);
        root.children.get(0).addChild(55);
        root.children.get(0).children.get(0).addChild(111);
        root.children.get(0).children.get(0).addChild(222);
        root.children.get(0).children.get(0).addChild(333);
        root.children.get(0).children.get(0).addChild(444);
        root.children.get(0).children.get(0).addChild(555);
        root.children.get(0).children.get(0).addChild(666);

        //instantiating the Solution class to use its functions
        Solution sln=new Solution();
        //creating the level-count hashmap
        sln.widestLevel(root);
        //printing the key with the maximum value from hashmap
        System.out.println("max is = [" + sln.hashMapMaxValue(levelCount) + "]");
    }
}
