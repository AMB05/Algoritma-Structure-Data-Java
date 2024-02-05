package pertemuan9_tree_2k1;
import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Queue;
import java.util.Set;

public class BFS_Tree {
    public static void printNodes(Tree node) 
    {
        Queue<Tree> queue = new ArrayDeque<>();
        
        queue.add(node);

        Tree currentNode;
        
        Set<Tree> alreadyVisited = new HashSet<>();
        
        System.out.println("Visited nodes: ");
        while (!queue.isEmpty()) 
        {
            currentNode = queue.remove();
            System.out.println(currentNode.getValue());

            alreadyVisited.add(currentNode);
            queue.addAll(currentNode.getChildNodes());
            queue.removeAll(alreadyVisited);
        }
   }
}
