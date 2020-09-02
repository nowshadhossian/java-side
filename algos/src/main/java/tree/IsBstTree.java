/**
* A duplicate is not BST.
* Binary search tree. Left side has to be less than right side. Can have on children
* node at bottom cannot be more/less than grand father. THat's why min/max is used in the method.
*/
class IsBstTree{   
   boolean checkBST(Node root) {
        traverse(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
      
        return isBst;
    }
     boolean isBst  = true;
    public void traverse(Node root, int min, int max){
         if(root == null){
            return ;
        }
        
        if(root.left != null && root.right != null && root.left.data >= root.right.data){
            isBst = false;
            return;
        } else if(root.right != null && root.data >= root.right.data){
            isBst = false;
            return;
        } else if(root.left != null && root.data <= root.left.data){
            isBst = false;
            return;
        } else if(root.data >= max || root.data <= min){
            isBst = false;
            return;
        } else {
            traverse(root.left, min, root.data);
            traverse(root.right, root.data, max);
        }
        
    }
    }
