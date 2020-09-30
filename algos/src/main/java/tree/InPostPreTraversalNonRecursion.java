package main.java.tree;


import java.util.Stack;

/**
 *               1
 *             /    \
 *            2       3
 *          /   \
 *        4      5
 */

public class InPostPreTraversalNonRecursion {
    Node root;

    InPostPreTraversalNonRecursion()
    {
        root = null;
    }

    private void printPreOrder(Node root) {
        System.out.print(root.data + " ");
        Stack<Node> stack = new Stack<>();
        stack.add(root);
        Node current = root;
        while(!stack.isEmpty()){
            while(current.left != null){
                current = current.left;
                System.out.print(current.data + " ");
                stack.add(current);
            }
            while(current.right == null && !stack.isEmpty()){
                current = stack.pop();
            }
            if(current.right != null){
                current = current.right;
                System.out.print(current.data + " ");
            }
        }
    }

    private void printInorder(Node root) {
        //System.out.print(root.data + " ");
        /**
         * while !isEMtp
         *   while(left != null)
         *      current = left
         *      stack.add(current)
         *   current = pop
         *   print
         *
         *   while current.right == null
         *      current = pop
         *      print current
         *   if current.right != null
         *       current = current.right
         *       stack.add current
         */

        Stack<Node> stack = new Stack<>();
        stack.add(root);
        Node current = root;
        while(!stack.isEmpty()){
            while(current.left != null){
                current = current.left;
                stack.add(current);
            }

            current = stack.pop();
            System.out.print(current.data + " ");
            while(current.right == null && !stack.isEmpty()){
                current = stack.pop();
                System.out.print(current.data + " ");
            }
            if(current.right != null){
                current = current.right;
                stack.add(current);
            }

        }
    }

    private void printPostOrder(Node root) {
        /**
         *               1
         *             /    \
         *            2       3
         *          /   \
         *        4      5
         */
        /**
         *  1 2
         *  p: 4 5
         *  while !isEmpty
         *     while left != null
         *        current = left
         *        stack.add
         *     current = stack.pop
         *     print current
         *     current = stack.ppeek
         *
         *     print if right is notNull current = right; stack.add
         *
         *
         *   print current
         *
         *
         */

     /*   Stack<Node> stack = new Stack<>();
        stack.add(root);
        Node current = root;
        while(!stack.isEmpty()){
            while(current.left != null) {
                current = current.left;
                stack.add(current);
            }
            stack.pop();
            current = stack.pop();
            System.out.print(current.left.data + " ");
            if(current.right != null){
                //System.out.print(current.right.data + " ");
            }
            current = stack.pop();
        }
        System.out.print(current.data + " ");*/
    }


    // Driver method
    public static void main(String[] args)
    {
        InPostPreTraversalNonRecursion tree = new InPostPreTraversalNonRecursion();
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
