package array;

public class SingleDimensionArray{

    int arr[] = null;
    public SingleDimensionArray(int size){
        arr = new int[size];
        for(int i = 0 ; i < size ; i++){
            arr[i] = Integer.MIN_VALUE;
        }
    }

    public void traverseArray(){
        try{
            for (int i  = 0 ; i < arr.length ; i++){
                System.out.println(arr[i]);
            }
        }catch(Exception e){
            System.out.println("Execption while traversing the array : " + e);
        }
    }

    public void insertValue(int location , int value){
        try{
            if (arr[location] == Integer.MIN_VALUE){
                arr[location] = value;

            }else{
                System.out.println("Value at that point is already defined");
            }
        }catch(Exception e){
            System.out.println("Error while inserting the value at location ");
        }
    }

    public void accessCellAtLocation(int location){
        try{
            System.out.println("Value of cell at location " +location+ " is " +arr[location]);
        }catch(Exception e){
            System.out.println("Exception while acessing cell : " + e);
        }
    }

    public void searchInArray(int value){
        try{
            for(int i = 0 ; i < arr.length ; i++){
                if(arr[i] == value){
                    System.out.println("Value found at index :"+i);
                }
            }
        }catch(Exception e){
            System.out.println(("Error found whle searching value in an array"));
        }

    }

    public void deleteValueFromArray(int location){
        try{
            arr[location] = Integer.MIN_VALUE;
        }catch(Exception e){
            System.out.println("Error while deleteing the value :"+ e);
        }
    }
    
}
