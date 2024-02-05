package pertemuan8_tree_2a1;
import java.util.LinkedList;
import java.util.List;

public class Tree 
{
    private String value;
    private List<Tree> childNodes;
    

    public Tree(String value) {
      this.value = value;
      this.childNodes = new LinkedList<>();
    }

    public void addChild(Tree childNode) {
      this.childNodes.add(childNode);
    }

    public void showTreeNodes() {
      BFS_Tree.printNodes(this);
    }

    public String getValue() {
      return value;
    }

    public List<Tree> getChildNodes() {
      return childNodes;
    }
}

