package main.java.tree;

/**
 *               1
 *             /    \
 *            2       3
 *          /   \
 *        4      5
 */

class InPostPreTraversalRecursion
{
    // Root of Binary Tree
    Node root;

    InPostPreTraversalRecursion()
    {
        root = null;
    }

    public void printPreOrder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
        printPreOrder(root.left);
        printPreOrder(root.right);
    }

    private void printInorder(Node root) {
        if(root == null){
            return;
        }
        printInorder(root.left);
        System.out.print(root.data + " ");
        printInorder(root.right);
    }

    private void printPostOrder(Node root) {
        if(root == null){
            return;
        }
        printPostOrder(root.left);
        printPostOrder(root.right);
        System.out.print(root.data + " ");
    }


    // Driver method
    public static void main(String[] args)
    {
        InPostPreTraversalRecursion tree = new InPostPreTraversalRecursion();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Preorder traversal of binary tree is ");
        tree.printPreOrder(tree.root); //1 2 4 5 3

        System.out.println("\nInorder traversal of binary tree is ");
        tree.printInorder(tree.root); //4 2 5 1 3

        System.out.println("\nPostorder traversal of binary tree is ");
        tree.printPostOrder(tree.root); //4 5 2 3 1
    }




}
