/**
 *https://www.hackerrank.com/challenges/tree-postorder-traversal/problem
    1
      \
       2
        \
         5
        /  \
       3    6
        \
         4
 Output: 4 3 6 5 2 1 
 can't use stack.size() in for loop. size was reducing while pop and printed only 3 times. int len = stack.size(); fixed issue
 */
class PortOrderTreeTraversal{
   public static void postOrder(Node root) {
        Stack<Integer> stack = new Stack<>();
        traverse(stack, root);
        int len = stack.size();
        //using stack.size() in for loop reduces upon iteration. Thus took in separate variable.
        for(int i=0; i< len; i++){
            System.out.print(stack.pop() + " ");
        }
    }

    public static void traverse(Stack<Integer> stack, Node root){
        if(root == null){
            return;
        }
        stack.push(root.data);
        if(root.right != null){
            traverse(stack, root.right);
        }
        if(root.left != null){
            traverse(stack, root.left);
        }
    }
}
