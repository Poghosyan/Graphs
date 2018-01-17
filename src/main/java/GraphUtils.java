

import java.util.List;
import java.util.Set;

/*
Please do not change the signature of any of the three methods, and please do not create any additional .java files for
your solution; if you need additional classes, you can define them in GraphUtils.java. You may modify
BreadthFirstSearch.java and/or DepthFirstSearch.java as part of your solution but please do not modify any of the other
code that we distributed. Last, please be sure that all code  is in the default package, i.e. there is no “package”
declaration at the top of the source code.
 */

public class GraphUtils {

    /**
     * Given a Graph, this method returns the shortest distance (in terms of number of edges) from the node labeled src
     * to the node labeled dest. The method should return -1 for any invalid inputs, including: null values for the
     * Graph, src, or dest; there is no node labeled src or dest in the graph; there is no path from src to dest. Keep
     * in mind that this method does not just return the distance of any path from src to dest, it must be the shortest
     * path.
     * <p>
     * test your implementation with both directed and undirected graphs.
     *
     * @param graph
     * @param src
     * @param dest
     * @return
     */
    public static int minDistance(Graph graph, String src, String dest) {

        return -2;
    }

    /**
     * Given a Graph, this method returns a Set of the values of all nodes within the specified distance (in terms of
     * number of edges) of the node labeled src, i.e. for which the minimum number of edges from src to that node is
     * less than or equal to the specified distance. The value of the node itself should not be in the Set, even if
     * there is an edge from the node to itself. The method should return null for any invalid inputs, including: null
     * values for the Graph or src; there is no node labeled src in the graph; distance less than 1. However, if
     * distance is greater than or equal to 1 and there are no nodes within that distance (meaning: src is the only
     * node in the graph), the method should return an empty Set.
     * <p>
     * test your implementation with both directed and undirected graphs.
     *
     * @param graph
     * @param src
     * @param distance
     * @return
     */
    public static Set<String> nodesWithinDistance(Graph graph, String src, int distance) {

        return null;
    }

    /**
     * Given a Graph, this method indicates whether the List of node values represents a Hamiltonian Path. A Hamiltonian
     * Path is a valid path through the graph in which every node in the graph is visited exactly once, except for the
     * start and end nodes, which are the same, so that it is a cycle. If the values in the input List represent a
     * Hamiltonian Path, the method should return true, but the method should return false otherwise, e.g. if the path
     * is not a cycle, if some nodes are not visited, if some nodes are visited more than once, if some values do not
     * have corresponding nodes in the graph, if the input is not a valid path (i.e., there is a sequence of nodes in
     * the List that are not connected by an edge), etc. The method should also return false if the input Graph or List
     * is null.
     * <p>
     * test your implementation with both directed and undirected graphs.
     *
     * @param g
     * @param values
     * @return
     */
    public static boolean isHamiltonianPath(Graph g, List<String> values) {

        return true;
    }

}
