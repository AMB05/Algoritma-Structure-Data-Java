package pertemuan_8_tree_2_2a1;


public class Pertemuan_8_Tree_2_2A1 {

    
    public static void main(String[] args) 
    {
        BinaryTree tree = new BinaryTree();
//        BinaryTree tree = new BinaryTree(1);
//        BinaryTree binaryTree = new BinaryTree(2);

        // Create root
        tree.root = new Tree_Node(2);
        /* Following is the tree after above statement
         1
        / \
     null null
        */

        tree.root.left = new Tree_Node(4);
        tree.root.right = new Tree_Node(3);
        /* 2 and 3 become left and right children of 1
                 1
                /  \
               2    3
              / \  / \
            null null null null */
        tree.root.left.left = new Tree_Node(1);
        /* 4 becomes left child of 2
                 1
                / \
               2   3
              / \ / \
             4 null null null
            / \
         null null
        */
        System.out.println(tree.root.left.left = new Tree_Node(1));
    }
    
}
