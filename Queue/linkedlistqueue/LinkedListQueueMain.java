public class LinkedListQueueMain{

    public static void main(String args[]){

        LinkedListQueue queue = new LinkedListQueue();
        for(int i = 0 ; i < 10 ; i++){
            queue.enqueue(i);

        }

        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        queue.enqueue(1000);
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        queue.enqueue(1000);
        queue.enqueue(1000);
        queue.enqueue(1000);
        

        queue.enqueue(1000);
        queue.enqueue(1000);

        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());



    }
}