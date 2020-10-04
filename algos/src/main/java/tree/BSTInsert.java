package main.java.tree;

/**
 * https://www.hackerrank.com/challenges/binary-search-tree-insertion/problem
 * tree addition. Check the link
 */
public class BSTInsert {
    public static Node insert(Node root,int data) {
        if(root == null){
            root = new Node(data);
            return root;
        }
        if(data < root.data){
            if(root.left == null){
                Node left = new Node(data);
                root.left = left;
            }
            insert(root.left, data);

        } else if(data > root.data){
            if(root.right == null){
                Node right = new Node(data);
                root.right = right;
            }
            insert(root.right, data);

        }
        return root;
    }


}
