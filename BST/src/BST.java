public class BST<E extends Comparable<E>> extends AbstractTree<E> {
    protected TreeNode<E> root;
    protected int size = 0;

    public BST() {

    }

    public BST(E[] objects) {
        for (E object : objects) {
            insert(object);
        }
    }

   public boolean insert(E e) {
       if (root == null) {
           root = createNewNode(e);
       } else {
           TreeNode<E> parent = null;
           TreeNode<E> current = root;
           while (current != null) {
               if (e.compareTo(current.element) < 0) {
                   parent = current;
                   current = current.left;
               } else if (e.compareTo(current.element) > 0) {
                   parent = current;
                   current = current.right;
               } else return false;
           }
           if (e.compareTo(parent.element) < 0) {
               parent.left = createNewNode(e);
           } else {
               parent.  right = createNewNode(e);
           }
       }
       size++;
       return true;
   }



   protected TreeNode<E> createNewNode(E e) {
        return new TreeNode<>(e);
   }

   public int getSize() {
        return this.size;
   }

   @Override
    public void inorder() {
        inorder(root);
   }

   protected void inorder(TreeNode<E> root) {
        if (root == null) return;
        inorder(root.left);
        System.out.println(root.element + " ");
        inorder(root.right);
   }

   protected void postorder(TreeNode<E> root) {
        if (root == null) return;
        postorder(root.left);
        postorder(root.right);
       System.out.println(root.element + " ");;
   }

    public void postorder() {
        postorder(root);
    }


    protected void preorder(TreeNode<E> root) {
        if (root == null) return;
        System.out.println(root.element + " ");;
        postorder(root.left);
        postorder(root.right);

    }

    public void preorder() {
        preorder(root);
    }






}
