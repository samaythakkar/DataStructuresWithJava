public class LinkedListStack{


    LinkedListStackNode head = null;
    LinkedListStackNode tail = null;
    int size = 0;
    
    public void push(int value){
        LinkedListStackNode newNode = new LinkedListStackNode(value);
        
        if(head== null){
            head = newNode;
            tail = newNode;
            this.size++;
        }else{
            tail.nextNode = newNode;
            tail = newNode;
            this.size++;

        }
        
    }
    
    public int pull(){
        LinkedListStackNode tempNode = head;
        if(tempNode.nextNode!= null){
        while(tempNode.nextNode != tail){
            tempNode = tempNode.nextNode;
        }
  
        int val = tail.value;
        tail = tempNode;
        tail.nextNode = null;
        return val;
    }else{
        int val = head.value;
        head = tail = null;
        return val;
    }
    }

}