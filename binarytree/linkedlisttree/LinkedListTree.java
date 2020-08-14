import java.util.LinkedList;
import java.util.Queue;

public class LinkedListTree{

    LinkedListTreeNode rootNode;

    public LinkedListTree(int rootValue){
        this.rootNode = new LinkedListTreeNode(rootValue);
    }

    public LinkedListTree(){
        this.rootNode = null;
    }

    public void traversePreOrder(LinkedListTreeNode root){
        if(root== null){
            System.out.println("No childs");
        }else{
            System.out.println(root.value);
            traversePreOrder(root.leftNode);
            traversePreOrder(root.rightNode);

        }
    }

    public void traverseInOrder(LinkedListTreeNode root){
        if(root==null){
        }else{
            traverseInOrder(root.leftNode);
            System.out.println(root.value);
            traverseInOrder(root.rightNode);
        }
    }

    public void traversePostOrder(LinkedListTreeNode root){
        if(root==null){

        }else{
            traversePostOrder(root.leftNode);
            traversePostOrder(root.rightNode);
            System.out.println(root.value);

        }
    }

    public void traverseLevelOrder(LinkedListTreeNode root){
       Queue<LinkedListTreeNode> queue = new LinkedList<LinkedListTreeNode>() ;
        queue.add(root);
        while(!queue.isEmpty()){
            LinkedListTreeNode tempNode= queue.poll();
            System.out.println(tempNode.value);
            if(tempNode.leftNode!= null){
                queue.add(tempNode.leftNode);
            }
            if(tempNode.rightNode!=null){
                queue.add(tempNode.rightNode);
            }
            
        }

    }

    public boolean doesValueExist(LinkedListTreeNode root, int valueToFind){
        Queue<LinkedListTreeNode> queue = new LinkedList<LinkedListTreeNode>();
        queue.add(root);
        while(!queue.isEmpty()){
            LinkedListTreeNode tempNode = queue.poll();
            if(tempNode.value == valueToFind){
                System.out.println("Value found");
                return true;
            }
            if(tempNode.leftNode != null){
                queue.add(tempNode.leftNode);
            }
            if(tempNode.rightNode != null){
                queue.add(tempNode.rightNode);
            }
            
        }
        System.out.println("Value not found");
        return false;
    }

    public void insertValue(LinkedListTreeNode root ,int value){
        LinkedListTreeNode newNode = new LinkedListTreeNode(value);
        // if(rootNode == null){
        //     rootNode = newNode;
        // }else{
            LinkedListTreeNode tempNode = root;
            Queue<LinkedListTreeNode> queue = new LinkedList<LinkedListTreeNode>();
            queue.add(rootNode);
            while(!queue.isEmpty()){
                System.out.println("INSIDE WHILE");
                tempNode = queue.poll();
                if(tempNode.leftNode == null){
                    System.out.println("INSERTING IN LEFT SIDE");
                    tempNode.leftNode = newNode;
                    break;
                }else{
                    queue.add(tempNode.leftNode);
                }
                if(tempNode.rightNode == null){
                    System.out.println("INSERTING IN RIGHT SIDE");
                    tempNode.rightNode = newNode;
                    break;
                }else{
                    queue.add(tempNode.rightNode);
                }
            }
                }

       //     }
            
        

    public void deleteValue(LinkedListTreeNode root, int value){
        // LinkedListTreeNode tempNode = root;
        // Queue<LinkedListTreeNode> queue = new LinkedList();
        
        // while(tempNode.value != value){
            
        // }

    
    }

    public LinkedListTreeNode getLeafNode(LinkedListTreeNode root){
        LinkedListTreeNode tempNode = root;
        Queue<LinkedListTreeNode> queue = new LinkedList<LinkedListTreeNode>();
        queue.add(root);
        LinkedListTreeNode leafNode =null;
        if(root!= null){
            while(tempNode.leftNode != null && tempNode.rightNode !=null){
                tempNode=queue.poll();
                System.out.println("VALUE OF TEMP NDOE IS"+tempNode.value);

                if(tempNode.leftNode != null){
                queue.add(tempNode.leftNode);
                }
                if(tempNode.rightNode !=null){
                queue.add(tempNode.rightNode);
                }
        }
    
        leafNode = tempNode;
            
        }
        return leafNode;


    }

    // public isLeaftNode(LinkedListTreeNode node){

        

    // }
    }