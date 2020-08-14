public class DoubleLinkedListNode{

    DoubleLinkedListNode prevNode;
    DoubleLinkedListNode nextNode;
    int value;

    public DoubleLinkedListNode(int value){
        this.prevNode = null;
        this.nextNode = null;
        this.value = value;
    }
}