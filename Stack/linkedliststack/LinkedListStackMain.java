public class LinkedListStackMain{

    public static void main(String args[]){

        LinkedListStack stack = new LinkedListStack();
        for(int i = 0 ; i < 10 ; i++){
            stack.push(i);
        }

        System.out.println(stack.pull());
        System.out.println(stack.pull());
        System.out.println(stack.pull());
        System.out.println(stack.pull());
        System.out.println(stack.pull());
        System.out.println(stack.pull());
        System.out.println(stack.pull());
        System.out.println(stack.pull());
        System.out.println(stack.pull());
        System.out.println(stack.pull());
        System.out.println(stack.pull());

    }
}