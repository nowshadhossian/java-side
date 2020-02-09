package main.java;

import main.java.tree.Node;

import java.util.ArrayList;
import java.util.List;

/**
 * 3 test case didn't match
 * https://www.hackerrank.com/challenges/binary-search-tree-lowest-common-ancestor/problem
 */

public class BstAncestor {
    public static void main(String []a){
        new BstAncestor().de();
    }

    private void de() {
        int[] inp = new int[]{4, 2, 3, 1, 7, 6};
        Node node = null;
        for(int i=0; i< inp.length; i++){
            node = insert(node, inp[i]);
        }
        Node ans = lca(node, 1, 7);
        System.out.println(ans.data);

    }
    public static Node lca(Node root, int v1, int v2) {
        // Write your code here.
        List<Node> v1Parents = search(root, v1);
        List<Node> v2Parents = search(root, v2);


        for(int i = v1Parents.size()-1; i >= 0; i--){
            for(int j = v2Parents.size() - 1; j >=0; j--){
                if(v2Parents.get(j).data == v1Parents.get(i).data){
                    return (v1Parents.get(i));
                }
            }

        }


       // parents.forEach(System.out::print);
        return root;
    }
    static List<Node> parents = new ArrayList<>();
    private static List<Node> search(Node root, int value) {

        if(root.data > value){
            parents.add(root);
            search(root.left, value);
        } else if(root.data < value){
            parents.add(root);
            search(root.right, value);
        }
        return parents;
    }


    public Node insert(Node root, int data) {
        if(root == null) {
            return new Node(data);
        } else {
            Node cur;
            if(data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

}
