/**
 * Created by mona on 3/26/16.
 */
/**
 * Definition of a Vertex to be used with the Graph class.
 *
 * The distance field is designed to hold the length of the
 * path from the source of the traversal to this vertex
 *
 * The predecessor field refers to the previous field on
 * the path from the source (i.e. the vertex one edge
 * closer to the source).
 *
 */

//Vertex class for GraphHashMap
public class Vertex implements Comparable<Vertex> {
    // label
    public String name;

    // the next three boolean variables for search
    public boolean processed;
    public boolean discovered;
    public Vertex predecessor; // previous vertex

    // the next variable for path length of shortest path from source
    public int distance;

    // Infinite distance indicates that there is no path from the source to this vertex
    public static final int INFINITY = Integer.MAX_VALUE;

    public Vertex(String v)
    {
        name = v;

        predecessor = null;
        processed = false;
        discovered = false;
        distance = INFINITY; // start as infinity away
    }

    /*
     * The name of the Vertex is assumed to be unique, so it is used as a HashCode
     * @see java.lang.Object#hashCode()
     */
    public int hashCode() {
        return name.hashCode();
    }

    public String toString(){
        return name;
    }

    /**
     * Compare on the basis of distance from source first and
     * then lexicographically
     */
    public int compareTo(Vertex other)
    {
        int diff = distance - other.distance;
        if (diff != 0)
            return diff;
        else
            return name.compareTo(other.name);
    }
}