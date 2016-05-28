/**
 * Created by mona on 5/28/16.
 */

import java.util.LinkedList;
import java.util.Queue;
//add code later on to save the path from root to dest in an array
public class BreathFirstSearch {
    public static void BFS(GraphNode root, int num) {
        if (root.val == num) {
            System.out.println("root contains the number "+num);
        }
        Queue<GraphNode> queue = new LinkedList<>();
        queue.add(root);
        root.visited = true;
        while (!queue.isEmpty()) {
            for (GraphNode g : queue.remove().neighbors) {
                if (!g.visited) {
                    System.out.println(g);
                    if (g.val == num) {
                        System.out.println("Node contains " + num);
                    }
                    g.visited = true;
                    queue.add(g);
                }
            }
        }
    }

    public static void main(String[] args) {
        GraphNode n1 = new GraphNode(1);
        GraphNode n2 = new GraphNode(2);
        GraphNode n3 = new GraphNode(3);
        GraphNode n4 = new GraphNode(4);
        GraphNode n5 = new GraphNode(5);

        n1.neighbors = new GraphNode[] {n2, n4};
        n2.neighbors = new GraphNode[] {n4, n5};
        n3.neighbors = new GraphNode[] {n4};
        n4.neighbors = new GraphNode[] {n1, n5};
        n5.neighbors = new GraphNode[] {n3, n4};

        BFS(n1, 4);

    }
}
