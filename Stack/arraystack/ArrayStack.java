public class ArrayStack{
    int size ;
    int topOfStack = -1;
    int[] stack;
    public ArrayStack(int size){
        this.size = size;
        this.stack = new int[size];

    }

    public void push(int value){
        if(topOfStack!=size){
        stack[topOfStack+1] = value;
        topOfStack++;
        }else{
            System.out.println("STACK SIZE IS FULL");
        }
    }
    public int pull(){
        int val = Integer.MIN_VALUE;
        if(topOfStack != -1){
            val = stack[topOfStack];
            stack[topOfStack] = Integer.MIN_VALUE;
            topOfStack--;
            return val;
        }else{
            System.out.println("Stack is empty");
        }
        return val;


    }

    public void isStackFull(){
        if(topOfStack == size){
            System.out.println("Stack is full");
        }else{
            System.out.println("Stack is not full");
        }
    }

    public void isStackEmpty(){
        if(topOfStack == -1){
            System.out.println("Stack is empty");
        }else{
            System.out.println("Stack is not empty");
        }
    }

    public void deletStack(){
        stack = null;
    }



}