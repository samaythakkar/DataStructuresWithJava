public class LinkedListQueue{

    LinkedListQueueNode head = null;
    LinkedListQueueNode tail = null;

    public void enqueue(int value){
        LinkedListQueueNode newNode = new LinkedListQueueNode(value);
        if(head == null ){
            head = newNode;
            tail = newNode;
        }else{
            tail.nextNode = newNode;
            tail = newNode;

        }
    }

    public int dequeue(){
        if(!isEmpty()){
        int val = head.value;
        head = head.nextNode;
        return val;
        }else{
            System.out.println("EMPTY");
            return -1;
        }
    }

    public boolean isEmpty(){
        if(head == null ){
            return true;
        }else{
            return false;
        }
    }

    public void delete(){
        head=tail=null;
    }
}