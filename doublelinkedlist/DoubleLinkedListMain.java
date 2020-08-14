public class DoubleLinkedListMain{
    public static void main(String args[]){
        DoubleLinkedList list = new DoubleLinkedList();
        for(int i = 0 ; i < 20 ; i++){
        list.addNodeAtEnd(i);
        }

        list.insertNode(1234, 6);
        list.insertNode(999, 25);
        list.insertNode(111, 0);
        // System.out.println("AFTER INSERT:");
        // list.dispayReverse();
        // System.out.println("--------------------");
        // list.display();
        System.out.println("-------BEFORE DELETE-----------");
        list.display();
        // list.deleteNode(0);
        // System.out.println("AFTER DELET");
        // list.display();
        // list.dispayReverse();
        list.deleteLinkedList();
        System.out.println("AFTER DELET");
       // list.display();

        
    }
}