package binary.tree;

public class BinaryTree {

    Node root;

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.add(8);
        tree.add(7);
        tree.add(12);
        tree.add(15);
        tree.add(2);
        tree.add(5);

        tree.print();
    }

    private void add(int value) {

        root = add(root, value);
    }

    private Node add(Node root, int value) {
        if (root == null) {
            root = new Node(value);
        } else if (value < root.value) {
            root.left = add(root.left, value);
        } else {
            root.right = add(root.right, value);
        }
        return root;
    }

    //Inorder
    private void print(){
        printInorder(root);
    }

    private void printInorder(Node root){

        if(root != null){
            printInorder(root.left);
            System.out.print(root.value+ " ");
            printInorder(root.right);
        }
    }

}
