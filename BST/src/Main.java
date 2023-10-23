public class Main {
    public static void main(String[] args) {
        BST<String> tree = new BST<>();
        tree.insert("2");
        tree.insert("1");
        tree.insert("3");
//        tree.insert("Adam");
//        tree.insert("Jones");
//        tree.insert("Peter");
//        tree.insert("Daniel");

        System.out.println("Inorder (sorted):");
        tree.inorder();
        System.out.println("The number of nodes is " + tree.getSize());

        System.out.println();

        System.out.println("Postorder (sorted):");
        tree.postorder();

        System.out.println();

        System.out.println("Preorder (sorted):");
        tree.preorder();
    }
}
