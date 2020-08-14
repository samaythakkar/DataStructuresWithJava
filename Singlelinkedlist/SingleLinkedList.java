
public class SingleLinkedList{
 
    SingleLinkedListNode head  = null;
    SingleLinkedListNode tail = null;
    int size = 0;

    public void addNode(int data){
        SingleLinkedListNode newnode = new SingleLinkedListNode(data);
        if(this.head == null){
            this.head = newnode;
            this.tail = newnode;
            size += 1;
        }else{
            this.tail.nextNode = newnode;
            this.tail = newnode;
            size += 1;
        }
        
    }

    public void display(){
        SingleLinkedListNode current = head;
        if(head == null){
            System.out.println("No node in the lists");
        }else{
            while(current != null){
                System.out.println(current.value);
                current = current.nextNode;
            }
        }
    }

    public void insertNewNode(int value , int location){
        SingleLinkedListNode newNode = new SingleLinkedListNode(value);
        if(location == 0){
            newNode.nextNode = head;
            head = newNode;
            size += 1;
            return;
        }
        else if(location >= size){
            tail.nextNode = newNode;
            tail = tail.nextNode;
            size += 1;
            System.out.println("VALUE OF TAIL HAS CHANGED TO " +tail.value);
            return;
        }
        else{
            SingleLinkedListNode current = head;
            for(int i = 0 ; i < location-1 ; i++){
                current = current.nextNode;
            }
            newNode.nextNode = current.nextNode;
            current.nextNode = newNode;
            return;
        }

        
    }

    public void searchValue(int value){
        SingleLinkedListNode tempNode = head;
        for(int i = 0 ; i < this.size ; i++){
            if(tempNode.value == value){
                System.out.println("Value foun at index "+i);
                return;
            }
            else{
                tempNode = tempNode.nextNode;
                
            }
        }
        System.out.println("Value not in the list");
    }

    public void deleteNode(int value){
        System.out.println("VALUE OF TAIL :"+tail.value);

        if(size == 1){
            if(head.value == value){
                head = null;
                tail = null;
                System.out.println("Value deleted at head");
                return;
            }else{
                System.out.println("Value not in the list");
                return;

            }

        }else{
            if(head.value == value){
                head = head.nextNode;

                return;

            }
            else if(tail.value == value){
                SingleLinkedListNode tempNode = head;
                for(int i = 0 ; i < size-1 ; i++){
                    tempNode = tempNode.nextNode;
                }
                tempNode.nextNode = null;
                System.out.println("Node deleted at tail :"+value);
                return;
            }else{
                SingleLinkedListNode tempNode = head;
                for(int i = 0 ; i < size ; i++){
                    tempNode = tempNode.nextNode;
                    if(tempNode.nextNode.value == value){
                        tempNode.nextNode = tempNode.nextNode.nextNode;
                        System.out.println("Node deleted in mid:"+value);
                        return;
                    }
                }
            }
        }


        

    }
}