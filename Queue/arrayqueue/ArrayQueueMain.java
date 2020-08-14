public class ArrayQueueMain{
    
    public static void main(String args[]){
       // ArrayQueueCustom queue = new ArrayQueueCustom(10);
       CircularArrayQueue queue = new CircularArrayQueue(10);
       System.out.println(queue.isQueueEmpty());

        for(int i = 0 ; i < queue.size ; i++){
            queue.enqueue(i);
        }
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        queue.enqueue(1000);

        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        queue.enqueue(2000);

        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        queue.enqueue(3000);


        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());

        System.out.println(queue.isQueueFull());
        System.out.println(queue.isQueueEmpty());

        // System.out.println(queue.dequeue());
        // System.out.println(queue.dequeue());
        // System.out.println(queue.dequeue());
        // System.out.println(queue.dequeue());
        // System.out.println(queue.dequeue());


    }
}