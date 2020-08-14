public class CircularArrayQueue{

    int[] queue ;
    int startOfQueue = -1;
    int endOfQueue = -1 ;
    int size = -1;
    public CircularArrayQueue(int size){
        this.size = size;
        this.queue = new int[size];
    }

    public void enqueue(int value){
        if(endOfQueue == -1){
            endOfQueue = 0;
            queue[endOfQueue] = value;
            endOfQueue++;
        }else if(endOfQueue == size){
            endOfQueue = 0 ;
            queue[endOfQueue] = value;
            endOfQueue++;


        }else{
            queue[endOfQueue] = value;
            endOfQueue++;

        }
    

    }

    public int dequeue(){
        if(startOfQueue == -1){
            startOfQueue = 0 ;
            int val = queue[startOfQueue];
            queue[startOfQueue] = Integer.MIN_VALUE;
            startOfQueue++;
            return val;
        }else if(startOfQueue == size){
            startOfQueue = 0;
            int val = queue[startOfQueue];
            queue[startOfQueue] = Integer.MIN_VALUE;
            startOfQueue++;
            return val;
        }else{
            int val = queue[startOfQueue];
            queue[startOfQueue] = Integer.MIN_VALUE;
            startOfQueue++;
            return val;
        }
    }

    public boolean isQueueEmpty(){
        if(startOfQueue+1 ==endOfQueue){
            return true;
        }else if(startOfQueue== -1 && endOfQueue==-1){
            return true;

        }else{
            return false;
        }
    }


    public boolean isQueueFull(){
        System.out.println("START OF QUEUE:"+startOfQueue);
        System.out.println("END OF QUEUE:"+endOfQueue);
        if(startOfQueue == 0 && endOfQueue+1 == size){
            return true;
        }else if(endOfQueue+1 == startOfQueue){
            return true;
        }else{
            return false;
        }
    }

    public void deleteQueue(){
        queue = null;
    }

}