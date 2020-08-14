public class LinkedListTreeMain{

    public static void main(String args[]){
        LinkedListTree tree = new LinkedListTree(100);
        tree.rootNode.leftNode = new LinkedListTreeNode(20);
        tree.rootNode.rightNode = new LinkedListTreeNode(40);
        tree.rootNode.leftNode.leftNode =new LinkedListTreeNode(90);
        tree.rootNode.leftNode.leftNode.leftNode =new LinkedListTreeNode(15);
        tree.rootNode.leftNode.rightNode =new LinkedListTreeNode(60);
        //tree.traversePreOrder(tree.rootNode);
       // tree.traverseInOrder(tree.rootNode);
       // tree.traversePostOrder(tree.rootNode);
       System.out.println("BEFORE INSERTING");
        tree.traverseLevelOrder(tree.rootNode);
       // tree.doesValueExist(tree.rootNode,100);
        tree.insertValue(tree.rootNode,1234);
        System.out.println("AFTER INSERT");
        tree.traverseLevelOrder(tree.rootNode);
        System.out.println(tree.getLeafNode(tree.rootNode).value);



    }
}