public class ArrayStackMain{
    public static void main(String args[]){
        ArrayStack stack = new ArrayStack(10);
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
        System.out.println(stack.pull());


    }
    
}