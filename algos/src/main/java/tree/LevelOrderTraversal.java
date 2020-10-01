package main.java.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 *    1
 *       \
 *        2
 *         \
 *          5
 *         /  \
 *        3    6
 *         \
 *          4
 * Sample Output
 *
 * 1 2 5 3 6 4
 * stack goes deep inside below the tree. Queue goes left to right
 */
public class LevelOrderTraversal {
    public static void levelOrder(Node root) {
        if(root == null){
            return;
        }
        /**
         while !queue.isEMtp
             node = stack.pop;
             list.add(n.left) list.add n.right
             stack.add left
             stack.add right
         */
        List<Integer> data = new ArrayList();
        Queue<Node> q = new LinkedList();
        q.add(root);
        data.add(root.data);
        while(!q.isEmpty()){
            Node current = q.poll();
            if(current.left != null){
                data.add(current.left.data);
                q.add(current.left);
            }
            if(current.right != null){
                data.add(current.right.data);
                q.add(current.right);
            }
        }
        for(Integer a: data){
            System.out.print(a + " ");
        }
    }

}
