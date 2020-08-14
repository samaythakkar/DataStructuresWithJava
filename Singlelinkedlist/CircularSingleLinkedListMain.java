public class CircularSingleLinkedListMain{

    public static void main(String args[]){

        CircularSingleLinkedList list = new CircularSingleLinkedList();

        for (int i = 0 ; i < 19 ; i++){
            list.addNode(i);
        }
       list.display();

       // list.searchInNode(12344);
        list.deleteInNode(13);
        list.display();

    }

}