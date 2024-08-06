package datastructures.binarySearchTree;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree myBST = new BinarySearchTree();
        myBST.rInsert(2);
        myBST.rInsert(1);
        myBST.rInsert(4);
        System.out.println(myBST.rContains(4));
        System.out.println(myBST.rContains(3));
        System.out.println("MinValue = "+myBST.minValue(myBST.root));
        myBST.deleteNode(2);

        System.out.println("Root = "+myBST.root.value);
        System.out.println("\nRoot->Left: " + myBST.root.left.value);
        System.out.println("\nRoot->Right: " + myBST.root.right.value);

    }
}
