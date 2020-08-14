public class BinaryTreeDemo1{

    int tree[] = new int[20];

    public void insertRoot(int value){
        tree[1] = value;
    }

    public int insertLeft(int parentIndex , int value){
        indexToInsert = 2 * parentIndex;
        tree[indexToInsert] = value;
        return indexToInsert;
    }

    public int insertRight(int parentIndex , int value){
        indexToInsert = (2 * parentIndex) + 1;
        tree[indexToInsert] = value;
        return indexToInsert;
    }

    


}