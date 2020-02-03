package main.java.tree;

public class TreeUtils {
    public static Node makeTree(int [] values) {

        Node tree = new Node(values[0]);
        for(int i=1; i< values.length; i++){
            makeTree(tree, values[i]);
        }

       return tree;
    }

    private static void makeTree(Node current, int value){
        if(current.value > value){
            Node left = new Node(value);
            current.left = left;
        } else if(current.value < value){
            Node right = new Node(value);
            current.right = right;
        }

    }


    public static Node dfs(Node node, int value){
        if(node == null){
            return null;
        }
        if(node.value == value){
            return node;
        } else if(node.value > value){
            dfs(node.left, value);
        } else {
            dfs(node.right, value);
        }
        return null;
    }

    public static Node bfs(Node node, int value){
        if(node == null){
            return null;
        }
        if(node.value == value){
            return node;
        } else if(node.value > value){
            dfs(node.left, value);
        } else {
            dfs(node.right, value);
        }
        return null;
    }


}
