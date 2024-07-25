package datastructures.binarySearchTree;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree myBST = new BinarySearchTree();
        myBST.insert(2);
        myBST.insert(1);
        myBST.insert(4);
        System.out.println(myBST.contains(4));
        System.out.println(myBST.contains(3));

        System.out.println("Root = "+myBST.root.value);
        System.out.println("\nRoot->Left: " + myBST.root.left.value);
        System.out.println("\nRoot->Right: " + myBST.root.right.value);

    }
}
