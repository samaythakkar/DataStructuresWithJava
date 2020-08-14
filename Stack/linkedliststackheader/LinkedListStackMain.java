public class LinkedListStackMain{

    public static void main(String args[]) throws Exception {


        for(int i = 0 ; i < 10 ; i ++){
            stack.push(i);
        }

        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}