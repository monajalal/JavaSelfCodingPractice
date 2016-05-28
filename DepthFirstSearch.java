/**
 * Created by mona on 5/28/16.
 */

import java.util.Stack;

public class DepthFirstSearch {
    public static void DFS(GraphNode root, int num) {
        if (root.val == num) {
            System.out.println("root has the value "+num);
        }
        System.out.println(" current value is "+root.val);
        Stack<GraphNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            for (GraphNode g : stack.pop().neighbors) {
                if (!g.visited) {
                    System.out.println(" current value is "+g.val);
                    if (g.val == num) {
                        System.out.println("Found");
                    }
                    g.visited = true;
                    stack.push(g);
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

        n1.neighbors = new GraphNode[] {n2};
        n2.neighbors = new GraphNode[] {n4,n3};
        n3.neighbors = new GraphNode[] {n4};
        n4.neighbors = new GraphNode[] {n5};
        n5.neighbors = new GraphNode[] {};

        DFS(n1, 5);
    }
}
