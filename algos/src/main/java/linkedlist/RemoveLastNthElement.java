package main.java.linkedlist;

/**
 * https://leetcode.com/problems/remove-nth-node-from-end-of-list/
 * For linkedlist trick is have dummy node to return head easily.
 * Have runner and walker(optional) pointer to traverse list
 */
public class RemoveLastNthElement {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count =0;
        ListNode previous = new ListNode(0);
        previous.next = head;

        ListNode walk = previous;
        ListNode runner = previous;

        for(int i=1; i<= n; i++){
            runner = runner.next;
        }

        while(runner.next != null)   {
            runner = runner.next;
            walk = walk.next;
        }

        walk.next = walk.next.next;

        return previous.next;
    }

}
