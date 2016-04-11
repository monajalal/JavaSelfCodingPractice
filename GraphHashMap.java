/**
 * Created by mona on 3/26/16.
 */
/**
 *  Undirected, unweighted simple graph data type
 *  Parallel edges are not allowed
 *  Self loops are allowed
 *  This Graph class was adapted from
 *  <a href="http://www.cs.princeton.edu/introcs/45graph/Graph.java">Graph.java</a>
 */
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class GraphHashMap {
    // from name to vertex, using HashMap
    private HashMap<String, Vertex> vertices;

    // Adjacent list is a set of vertices represented by a search tree: TreeSet<Vertex>

    // from vertex to adjacent list, using HashMap
    private HashMap<Vertex, TreeSet<Vertex>> adjList;

    private int numVertices;
    private int numEdges;

    // EMPTY_SET is a constant:
    private static final TreeSet<Vertex> EMPTY_SET = new TreeSet<>();
    public static final int INFINITY = Integer.MAX_VALUE;

    // Construct an empty Graph
    public GraphHashMap() {
        adjList = new HashMap<>();
        vertices = new HashMap<>();
        numVertices = numEdges = 0;
    }

    // Add a new vertex name with no neighbors (if vertex does not yet exist)
    public Vertex addVertex(String name) {
        Vertex v;
        v = vertices.get(name);
        if (v == null) {
            v = new Vertex(name);
            vertices.put(name, v);
            adjList.put(v, new TreeSet<Vertex>());
            numVertices += 1;
        }
        return v;
    }

    /**
     * Returns the Vertex matching v
     * @param name a String name of a Vertex that may be in
     * this Graph
     * @return the Vertex with a name that matches v or null
     * if no such Vertex exists in this Graph
     */
    public Vertex getVertex(String name) {
        return vertices.get(name);
    }

    /**
     * Returns true iff v is in this Graph, false otherwise
     * @param name a String name of a Vertex that may be in
     * this Graph
     * @return true iff v is in this Graph
     */
    public boolean hasVertex(String name) {
        return vertices.containsKey(name);
    }

    /**
     * Is from-to, an edge in this Graph. The graph is
     * undirected so the order of from and to does not
     * matter.
     * @param from the name of the first Vertex
     * @param to the name of the second Vertex
     * @return true iff from-to exists in this Graph
     */
    public boolean hasEdge(String from, String to) {
        Vertex v1 = vertices.get(from);
        Vertex v2 = vertices.get(to);
        if (v1 == null || v2 == null) return false;
        return adjList.get(v1).contains(v2);
    }

    /**
     * Add to to from's set of neighbors, and add from to to's
     * set of neighbors. Does not add an edge if another edge
     * already exists
     * @param from the name of the first Vertex
     * @param to the name of the second Vertex
     */
    public void addEdge(String from, String to) {
        Vertex v, w;
        if (hasEdge(from, to)) return;  // no duplicate edges
        numEdges += 1;
        if ((v = getVertex(from)) == null)
            v = addVertex(from);
        if ((w = getVertex(to)) == null)
            w = addVertex(to);
        adjList.get(v).add(w);
        adjList.get(w).add(v);  // undirected graph only
    }

    /**
     * Return an iterator over the neighbors of Vertex named v
     * @param name the String name of a Vertex
     * @return an Iterator over Vertices that are adjacent
     * to the Vertex named v, empty set if v is not in graph
     */
    public Iterable<Vertex> adjacentTo(String name) {
        Vertex v = getVertex(name);
        if (v == null) return EMPTY_SET;
        return adjList.get(getVertex(name));
    }

    /**
     * Return an iterator over the neighbors of Vertex v
     * @param v the Vertex
     * @return an Iterator over Vertices that are adjacent
     * to the Vertex v, empty set if v is not in graph
     */
    public Iterable<Vertex> adjacentTo(Vertex v ) {
        if (!adjList.containsKey(v)) return EMPTY_SET;
        return adjList.get(v);
    }

    /**
     * Returns an Iterator over all Vertices in this Graph
     * @return an Iterator over all Vertices in this Graph
     */
    public Iterable<Vertex> getVertices() {
        return vertices.values();
    }

    public int numVertices() {
        return numVertices;
    }

    public int numEdges(){
        return numEdges;
    }


    /*
     * Returns adjacency-list representation of graph
     */
    @Override
    public String toString() {
        String s = "";
        for (Vertex v : vertices.values()) {
            s += v + ": ";
            for (Vertex w : adjList.get(v)) {
                s += w + " ";
            }
            s += "\n";
        }
        return s;
    }

    private String escapedVersion(String s) {
        return "\'"+s+"\'";

    }

    public void outputGDF(String fileName)
    {
        HashMap<Vertex, String> idToName = new HashMap<>();
        try {
            FileWriter out = new FileWriter(fileName);
            int count = 0;
            out.write("nodedef> name,label,distance\n");
            // write vertices
            for (Vertex v: vertices.values())
            {
                String id = "v"+ count++;
                idToName.put(v, id);
                out.write(id + ", " + escapedVersion(v.name));
                out.write(", "+v.distance+"\n");
            }
            out.write("edgedef> node1,node2,color\n");
            // write edges
            for (Vertex v : vertices.values())
                for (Vertex w : adjList.get(v))
                    if (v.compareTo(w) < 0) {
                        out.write(idToName.get(v)+", "+
                                idToName.get(w) + ", ");
                        if (v.predecessor == w ||
                                w.predecessor == v)
                            out.write("blue");
                        else
                            out.write("gray");
                        out.write("\n");
                    }
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void initSearch() {
        for (Vertex v : this.getVertices()) {
            v.processed = v.discovered = false;
            v.predecessor = null;
            v.distance = INFINITY;
        }
    }

    public void BFS(Vertex s) {
        this.initSearch();
        s.distance = 0;
        s.discovered = true;

        Queue<Vertex> q = new LinkedList<Vertex>();
        q.add(s);
        while (!q.isEmpty()) {
            Vertex v = q.remove();
            System.out.println("visit " + v);
            for (Vertex w : this.adjacentTo(v))
                if (!w.discovered) {
                    w.distance = v.distance+1;
                    w.discovered = true;
                    w.predecessor = v;
                    q.add(w);
                }
            v.processed = true;
        }
    }

    public void DFS(Vertex s) {
        this.initSearch();
        s.distance = 0;
        s.discovered = true;
        recDFS(s);
    }

    public void recDFS(Vertex v) {
        System.out.println("visit " + v);
        for (Vertex w : this.adjacentTo(v))
            if (!w.discovered) {
                w.distance = v.distance+1;
                w.discovered = true;
                w.predecessor = v;
                recDFS(w);
            }
        v.processed = true;
    }

    public void DFS2(Vertex s) {
        this.initSearch();
        s.distance = 0;
        s.discovered = true;

        Stack<Vertex> q = new Stack<Vertex>();
        q.push(s);
        while (!q.isEmpty()) {
            Vertex V = q.pop();
            for (Vertex v : this.adjacentTo(V)) {
                if (!v.processed) {
                    v.distance = V.distance+1;
                    v.discovered = true;
                    v.predecessor = V;
                    q.add(v);
                }
            }
            V.processed = true;
        }
    }

    public static void main(String[] args) {
        GraphHashMap G = new GraphHashMap();
        G.addEdge("A", "B");
        G.addEdge("A", "C");
        G.addEdge("B", "C");
        G.addEdge("C", "D");
        G.addEdge("D", "E");
        G.addEdge("D", "G");
        G.addEdge("E", "G");
        G.addVertex("H");

        // print out graph
        System.out.println(G);

        // G.BFS(G.getVertex("A"));
        G.DFS2(G.getVertex("A"));

        // print out graph again by iterating over vertices and edges
        for (Vertex v : G.getVertices()) {
            System.out.print(v + ": ");
            for (Vertex w : G.adjacentTo(v.name)) {
                System.out.print(w + " ");
            }
            System.out.println();
        }
        G.outputGDF("graph.txt");
    }
}