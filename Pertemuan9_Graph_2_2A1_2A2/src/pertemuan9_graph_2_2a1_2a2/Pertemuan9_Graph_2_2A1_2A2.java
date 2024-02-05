package pertemuan9_graph_2_2a1_2a2;

public class Pertemuan9_Graph_2_2A1_2A2 {

    public static void main(String[] args) {
        // Object of graph is created.
        graph_2<Integer> g = new graph_2<Integer>();
 
        // edges are added.
        // Since the graph is bidirectional,
        // so boolean bidirectional is passed as true.
        g.addEdge(0, 1, true);
        g.addEdge(0, 4, true);
        g.addEdge(1, 2, true);
        g.addEdge(1, 3, true);
        g.addEdge(1, 4, true);
        g.addEdge(2, 3, true);
        g.addEdge(3, 4, true);
 
        // Printing the graph
        System.out.println("Graph:\n"
                           + g.toString());
 
        // Gives the no of vertices in the graph.
        g.getVertexCount();
 
        // Gives the no of edges in the graph.
        g.getEdgesCount(true);
 
        // Tells whether the edge is present or not.
        g.hasEdge(3, 4);
 
        // Tells whether vertex is present or not
        g.hasVertex(5);
    }
    
}
