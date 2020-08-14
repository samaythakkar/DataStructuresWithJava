
class CircularDoubleLinkedList{

    DoubleLinkedListNode head = null;
    DoubleLinkedListNode tail = null;
    int size = 0;

    public void addValue(int value){
        DoubleLinkedListNode newNode = new DoubleLinkedListNode(value);
        if(head == null){
        head = newNode;
        tail = newNode;
        newNode.nextNode = newNode;
        newNode.prevNode = newNode;
        }else{
            DoubleLinkedListNode tempNode = head;
            while(tempNode != tail){
                tempNode = tempNode.nextNode;
            }
            tempNode.nextNode = newNode;
            newNode.prevNode = tempNode;
            newNode.nextNode = head;
            head.prevNode = newNode;
            tail = newNode;
        }
        size++;
        

    }

    public void insertValue(int value, int location){
        DoubleLinkedListNode newNode = new DoubleLinkedListNode(value);
        if(location==0){
            newNode.prevNode = tail;
            newNode.nextNode = head;
            head.prevNode = newNode;
            tail.nextNode = newNode;
            head = newNode;
            size++;

        }else if(location >= size){
            tail.nextNode = newNode;
            newNode.nextNode = head;
            newNode.prevNode = tail;
            head.prevNode=newNode;
            tail = newNode;
            size++;

        }else{
            DoubleLinkedListNode tempNode = head;
            for(int i = 0 ; i < location ; i++){
                tempNode = tempNode.nextNode;
            }
            newNode.prevNode = tempNode;
            newNode.nextNode = tempNode.nextNode;
            tempNode.nextNode.prevNode = newNode;
            tempNode.nextNode = newNode;
            size++;

            
        }
    }

    public void display(){
        DoubleLinkedListNode tempNode = head;
        while(tempNode != tail){
            System.out.println(tempNode.value);
            tempNode = tempNode.nextNode;
        }
        System.out.println(tempNode.value);


    }
    
    public void displayReverse(){
        DoubleLinkedListNode tempNode = tail;
        System.out.println("TAIL IS :"+tail.value);
        while(tempNode != head){
            System.out.println(tempNode.value);
            tempNode = tempNode.prevNode;
        }
        System.out.println(tempNode.value);
    }
    
    public void searchValue(int value){
        if(head.value == value){
            System.out.println("Value found at index 0");
            return;
        }else if(tail.value == value){
            System.out.println("Value found at index"+size);
            return;
        }else{
            DoubleLinkedListNode tempNode = head;
            while(tempNode!=tail){
                if(tempNode.value==value){
                    System.out.println("VALUE FOUND");
                    
                    return;
                }
                tempNode=tempNode.nextNode;
            }
            System.out.println("VALUE NOT FOUND");

        }
    }

    public void deleteNode(int index){
        if(size == 1){
            head.nextNode = null;
            head.prevNode = null;
            head = null;
            tail = null;
            System.out.println("THE ONLY NODE DELETED");
            return;
        }
        if(index == 0){
            tail.nextNode = head.nextNode;
            head = head.nextNode;
            head.prevNode = tail;
            System.out.println("NODE DELETED AT HEAD");
        }else if(index >= size){
            
            head.prevNode = tail.prevNode;
            tail.prevNode.nextNode = head;
            tail.nextNode = null;
            tail = tail.prevNode;
            System.out.println("NODE DELETED AT TAIL");
            return;

        }else{
            DoubleLinkedListNode tempNode = head;
            for(int i = 0 ; i < index ; i++){
                tempNode = tempNode.nextNode;
            }
            tempNode.nextNode = tempNode.nextNode.nextNode;
            tempNode.nextNode.prevNode = tempNode;
            System.out.println("NODE DELETED AT LOCATION:"+index);
            return;
        }
        
    }

    public void deleteTheCircularLinkedList(){
        if(size == 0){
            System.out.println("List does not exist");
        }else if(size == 1){

            head.nextNode = null;
            head.prevNode = null;
            head = null;
            tail = null;

        }else{
            tail.nextNode = null;
            DoubleLinkedListNode tempNode = head;
            while(head != tail){
                tempNode.prevNode = null;
                tempNode = tempNode.nextNode;
            }
        }
    }

}