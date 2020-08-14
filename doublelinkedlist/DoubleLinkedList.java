
public class DoubleLinkedList{

    DoubleLinkedListNode head;
    DoubleLinkedListNode tail;
    int size;
    public void addNodeAtEnd(int value){
        DoubleLinkedListNode newNode = new DoubleLinkedListNode(value);
        if(head == null){
            head = newNode;
            tail = newNode;
            size++;
        }else{
            DoubleLinkedListNode tempNode = tail;
            tempNode.nextNode = newNode;
            newNode.prevNode = tempNode;
            tail = newNode;
            System.out.println("VALUE OF HEAD IS:"+head.value);
            System.out.println("VALUE OF TAIL IS:"+tail.value);
            size++;

        }

    }
    public void display(){
        DoubleLinkedListNode tempNode = head;
        System.out.println(tempNode.value);
        while(tempNode!=tail){
            tempNode = tempNode.nextNode;
            System.out.println(tempNode.value);
        }

    }
    public void dispayReverse(){
        DoubleLinkedListNode tempNode = tail;
        System.out.println(tempNode.value);
       
        while (tempNode != head){
            tempNode=tempNode.prevNode;
            System.out.println(tempNode.value);
        }
        

    }

    public void insertNode(int value , int location){
        DoubleLinkedListNode newNode = new DoubleLinkedListNode(value);

        if(location == 0){
            DoubleLinkedListNode temp = head;
            temp.prevNode=newNode;
            head = newNode;
            newNode.nextNode = temp;
            size++;
            
        }else if(location >= size){
            tail.nextNode=newNode;
            newNode.prevNode = tail;
            tail = newNode;
            System.out.println("INSERTED VALUE AT TAIL:"+newNode.value);
            size++;

        }else{
            DoubleLinkedListNode tempNode = head;
            for(int i = 0 ; i < location ; i++){
                tempNode = tempNode.nextNode;
            }
            
            newNode.nextNode = tempNode.nextNode;
            tempNode.nextNode.prevNode = newNode;          
            newNode.prevNode = tempNode;
            tempNode.nextNode = newNode;
            size++;
        }
        
    }

    public boolean doesLinkedListHasValue(int value){
        DoubleLinkedListNode temp = head;
        while(temp!=tail){
            System.out.println("IN IT");
            if(temp.value==value){
            System.out.println("VALUE EXIST");
            return true;                
            }
            temp = temp.nextNode;
        }
        System.out.println("VALUE DOES NOT EXIST");
        return false;
    }

    public void deleteNode(int location){
        if(size > 1){
        if(location == 0){
           head = head.nextNode;
           head.prevNode = null;
        }else if(location >= size){ 
            tail = tail.prevNode;
            tail.nextNode= null;
        }else{
        
        DoubleLinkedListNode temp = head;
        for(int i = 0 ; i < location-1 ; i++){
            temp = temp.nextNode;
        }
        temp.nextNode.nextNode.prevNode = temp;

        temp.nextNode=temp.nextNode.nextNode;

    }


    }else{
        System.out.println("THere are no elemeents in the list");
    }

    }


    public void deleteLinkedList(){
        if(size ==0){
            System.out.println("Linked list does not exist");
        }else{
            if(size == 1){
                head = null;
                tail = null;
            }else{
                DoubleLinkedListNode temp = head;
                while(temp != tail){
                    temp.prevNode = null;
                    System.out.println("NULLED:"+temp.value);
                    temp = temp.nextNode;
                }
                System.out.println("NULLING Head " + head.value);
                head = null;
                System.out.println("NULLING tail " + tail.value);

                tail = null;
            }

        }
        
    }
}