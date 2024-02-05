package pertemuan9_graph_2k1;
import java.util.*;   

public class Pertemuan9_Graph_2K1 {
    
    public static void main(String[] args) {
        //creating a List of edges  
        List<Edge> edges = Arrays.asList(new Edge(0, 1), 
                new Edge(1, 2), new Edge(2, 4), 
                new Edge(4, 1), new Edge(3, 2), 
                new Edge(2, 5), new Edge(3, 4), 
                new Edge(5, 4), new Edge(1, 1));  
        // construct a graph from the given list of edges  
        Graph graph = new Graph(edges);  
        //prints the adjacency list that represents graph  
        Graph.showGraph(graph); 
    }    
}
