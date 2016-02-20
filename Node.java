/**
 * Created by mona on 10/24/15.
 */
import java.util.ArrayList;
import java.util.List;

/**
 * Class representing a node in a tree with one more children
 */
class Node {
    int value;
    List<Node> children = new ArrayList<>();
    int level;

    Node(int value) {
        this.value = value;
    }


    public Node addChild(int value) {
        Node n = new Node(value);
        children.add(n);
        //when adding a node, increase its
        //level +1 by that of its parent
        n.level=this.level +1;
        return n;
    }

}
