


public class SingleLinkedListMain{

    

    public static void main(String args[]){
        SingleLinkedList list = new SingleLinkedList();
        for (int i = 0 ; i < 15 ; i++){
            list.addNode(i);


        }
        
        list.insertNewNode(1234, 15);
        list.insertNewNode(12345, 15);
        list.insertNewNode(1234567, 0);
        list.searchValue(1234567);
        System.out.println("LIST BEFORE:");
        list.display();
        list.deleteNode(1234);
        System.out.println("LIST AFTER:");
        list.display();
        
    }
}