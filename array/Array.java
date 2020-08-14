
public class Array{

    public static void main(String args[]){
        
        // int[] arr1 = new int[10];
        // for(int i:arr1){
        //     System.out.println(i);
        // }

      //   SingleDimensionArray sda = new SingleDimensionArray(10);

      // //  sda.traverseArray();
      //   sda.insertValue(1, 1000);
      // //  sda.traverseArray();
      //   sda.deleteValueFromArray(1);
      //   sda.traverseArray();

      TwoDimensionArray tda = new TwoDimensionArray(5,5);
      tda.insertValueInArray(1234, 1, 4);

      tda.traverseArray();

      tda.searchInArray(1234);
          
      tda.deleteValueInArray(1, 4);


        
      tda.traverseArray();

      
      //  System.out.println(arr1);
    }}