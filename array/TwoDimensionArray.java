public class TwoDimensionArray{
    int arr[][] = null;

    public TwoDimensionArray(int numberOfRows, int numberOfColumns){
        this.arr = new int[numberOfRows][numberOfColumns];
        for(int i = 0 ; i < numberOfRows ; i++){
            for (int j = 0 ; j < numberOfColumns ; j++){
                arr[i][j] = Integer.MIN_VALUE;
            }
        }

    }

    public void traverseArray(){
        try{

            for(int row = 0 ; row < arr.length ; row++){
                for (int col = 0 ; col < arr[row].length ; col++){
                    System.out.print(arr[row][col] + " ");
                }
                System.out.println("\n");
            }
        }catch(Exception e){
            System.out.println("Exception occured while traversing array :"+e);
        }
    }

    public void insertValueInArray(int value , int row , int col){
        try{
            arr[row][col] = value;
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array length is not proper:"+e);
        }
    }

    public void deleteArray(){
        arr = null;
        System.out.println("Deleted");
    }

    public void searchInArray(int value){
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = 0 ; j < arr[i].length ; j++){
                if (arr[i][j] == value){
                    System.out.println("Value found at index :["+i+"]["+j+"]");
                    return;
                }
            }
        }
        System.out.println("Value not found");
    
    }

    public void deleteValueInArray(int row , int col){
        try{
            arr[row][col] = Integer.MIN_VALUE;
        }catch(Exception e){
            System.out.println("Not able to delete value at given index :" + e);
        }
    }

}