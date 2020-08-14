public class LinkedListStack{

    LinkedListStackNode head = null;
    int size = 0;

    public void push(int value){
        System.out.println("PUSHING:"+value);
        LinkedListStackNode newNode = new LinkedListStackNode(value);
        if(head == null){
            head = newNode;
        }else{
            newNode.nextNode = head;
            head = newNode;
        }
        size++;

    }

    public int pop() throws Exception{
        if(head != null){
        int val = head.value;
        head = head.nextNode;
        System.out.println("POPING :"+val);
        return val;
        }else{
            System.out.println("Stack is empty");
            return 'z';
        }

    }

    public int peek(){
        if(head!=null){
        return head.value;
    }else{
        System.out.println("Stack is empty");
        return 'b';
    }
    }

    public boolean isEmpty(){
        if(head == null){
            return true;
        }else{
            return false;
        }
    }

    public String convertToString() throws Exception{
        String stackStr = "";
        String revStr= "";
        for(int i = 0 ; i < size-1 ; i++){
            stackStr += pop();
        }
        for(int i= 0; i <stackStr.length()-1 ; i++){
            revStr+= stackStr.tointArray()[i];
        }
        return revStr;

    }

}