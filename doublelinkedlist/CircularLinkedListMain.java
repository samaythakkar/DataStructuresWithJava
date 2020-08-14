public class CircularLinkedListMain{
    
    public static void main(String args[]){
        CircularDoubleLinkedList list = new CircularDoubleLinkedList();
        for(int i = 0 ; i < 20 ; i ++){
            list.addValue(i);            
        }

        list.insertValue(1234, 0);
        list.insertValue(999, 111);
        list.insertValue(555, 4);
        System.out.println("DISPLAY FROM HEAD TO TAIL");
        list.display();
        //  System.out.println("DISPLAY FROM TAIL TO HEAD");
        //list.displayReverse();
        // list.searchValue(10);
        // list.searchValue(1234);
        // list.searchValue(999);
        // list.searchValue(19);
        // list.deleteNode(0);
        // list.deleteNode(23);
        // list.deleteNode(5);
        // System.out.println("AFTER DELETE");
        // System.out.println("DISPLAY FROM HEAD TO TAIL");
        // list.display();
        // System.out.println("DISPLAY FROM TAIL TO HEAD");
        // list.displayReverse();
        

    }
}