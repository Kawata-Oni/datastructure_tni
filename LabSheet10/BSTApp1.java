public class BSTApp1 {

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
		tree.sampleTree1();
		tree.printTree(tree.getRoot(),0);

        // 3
        System.out.println();
        System.out.println("Minimum node: " + tree.findMinimum(tree.getRoot()));
        System.out.println("Maximum node: " + tree.findMaximum(tree.getRoot()));

        // 5
        int target = 40;
        System.out.println("Is " + target + " in BST => " + tree.findSpecificData(target));
        
        // 7
        int delNode = 60;
		tree.searchDeleteNode(delNode);
		System.out.println("Parent is " + tree.getParent().data);
		System.out.println("Delete Node is " + tree.getDeleteNode().data);

        // 9
        tree.delete(delNode);
		tree.printTree(tree.getRoot(),0);


    }

}
