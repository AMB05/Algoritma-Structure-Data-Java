package pertemuan8_tree_2a1;


public class Pertemuan8_Tree_2A1 {

    
    public static void main(String[] args) 
    {
        Tree rootTreeNode = new Tree("CEO");
        Tree vpNode = new Tree("Vice President");
        Tree managerNode = new Tree("Manager");
        Tree dev1Node = new Tree("Developer 1");
        Tree dev2Node = new Tree("Developer 2");
        Tree dev3Node = new Tree("Developer 3");
        
        rootTreeNode.addChild(vpNode);
        vpNode.addChild(managerNode);
        managerNode.addChild(dev1Node);
        managerNode.addChild(dev2Node);
        managerNode.addChild(dev3Node);

        rootTreeNode.showTreeNodes();
    }
    
}
