public class ArrayQueueCustom{

    int[] queue ;
    int startOfQueue = -1;
    int endOfQueue = -1;
    int size = -1;
    public ArrayQueueCustom(int size){
        this.size = size;
        this.queue = new int[size];

    }

    public void enqueue(int value){
        if(endOfQueue<size){
        endOfQueue++;
        queue[endOfQueue] = value;
        }else{
            System.out.println("Queue Full");
        }

    }

    public int dequeue(){
        if(startOfQueue > endOfQueue-1){
            startOfQueue = -1;
            return -2;
        }else{
            startOfQueue++;
            return queue[startOfQueue];

        }

    }


}