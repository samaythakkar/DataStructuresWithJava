public class CircularSingleLinkedList{

    SingleLinkedListNode head ;
    SingleLinkedListNode tail ;
    int size = 0;

    public void addNode(int value){
        SingleLinkedListNode newNode = new SingleLinkedListNode(value);
        if(head == null){
            head = newNode;
            tail = newNode;
            newNode.nextNode = head;
            size ++;
            System.out.println("New CLL started with node with value :"+newNode.value);
            return;
        }else{
            // SingleLinkedListNode tempNode = head;
            // while(tempNode.nextNode.nextNode== head){
            //     tempNode = tempNode.nextNode;
            // }
            // tempNode.nextNode=newNode;
            // newNode.nextNode=head;
            // System.out.println("New CLL added node with value :"+newNode.value);

            // return;
            //----------------------INSERT IN BEGINNING
            // SingleLinkedListNode temp = head;
            // head = newNode;
            // newNode.nextNode = temp;
            // tail.nextNode = newNode;
            // System.out.println("TAIL.NEXT NODE:"+tail.nextNode.value);
            // System.out.println("HEAD VALUE:"+head.value);
            
           // tail = newNode.nextNode;
         //   tail.nextNode = newNode;
            size++;
            // ----------- INSERT IN LAST
            // SingleLinkedListNode temp = tail;
            // for(int i = 0 ; i < size-1 ; i++){
            //     temp = temp.nextNode;

            // }
            // temp.nextNode = newNode;
            // tail = newNode;
            // tail.nextNode = head;
            SingleLinkedListNode temp = tail;
         //   temp.nextNode = newNode;
            tail = newNode;
            temp.nextNode = newNode;
            tail.nextNode=head;



            

            
        }
    }
    public void d(){
        SingleLinkedListNode temp = head;
        while(head == head){
            System.out.println(temp.value);
            temp = temp.nextNode;
        }
    }
    public void display(){
        if (head == null){
            System.out.println("NOT EXIST");
            return;
        }
        SingleLinkedListNode tempNode = head;
        System.out.println(tempNode.value);
        while(tempNode != tail){
            tempNode = tempNode.nextNode;
            System.out.println(tempNode.value);

        }
        // for (int i = 0 ; i < size ; i++){
        //     System.out.println(tempNode.value);
        //     tempNode = tempNode.nextNode;
        // }
        // System.out.println("TAIL VAUE IS :"+tail.value);
        
    }

    public void searchInNode(int value){
        SingleLinkedListNode tempNode = head;
        while(tempNode != tail){
            if(tempNode.value == value){
                System.out.println("VALUE FOUND");
                return;
            }
            tempNode=tempNode.nextNode;

          
        }
        System.out.println("VALUE NOT FOUND");


    }

    public void deleteInNode(int value){
        if(head.value == value){
            head = head.nextNode;        
        }else if(tail.value==value){
            System.out.println("DELETING TAIL VALUE");
            SingleLinkedListNode tempNode = head;
            while(tempNode.nextNode != tail){
                tempNode = tempNode.nextNode;
            }
            tempNode.nextNode = head;
            tail = tempNode;
            return;
        }else{
            SingleLinkedListNode tempNode=head;
            while(tempNode.nextNode.value!=value){
                tempNode=tempNode.nextNode;
            }
            tempNode.nextNode = tempNode.nextNode.nextNode;
            return;
        }

    }

    public void deleteCircularLinkedList(){
        head = null;
        tail.nextNode = null;
        tail = null;
    }




    


}