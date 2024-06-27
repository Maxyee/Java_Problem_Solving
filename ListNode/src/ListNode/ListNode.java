package ListNode;

import java.io.*;

public class ListNode {
    int val;
    ListNode next;

    ListNode(){}
    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next)
    {
        this.val = val;
        this.next = next;
    }

}

class GFG {
    // lst1 = 1->3->5  && // lst2 = 0->2->4
    public static ListNode mergeTwoLists(ListNode lst1, ListNode lst2){
        ListNode result = new ListNode(-1);
        ListNode p = result;

        while(lst1 != null && lst2 != null){
            if (lst1.val <= lst2.val){
                p.next = lst1;
                lst1 = lst1.next;
            }

            else {
                p.next = lst2;
                lst2 = lst2.next;
            }

            p = p.next;
        }

        if (lst1 == null){
            p.next = lst2;
        }
        else if (lst2 == null){
            p.next = lst1;
        }

        return result.next;
    }


    static void printList(ListNode node)
    {
        while(node != null){
            System.out.print(node.val + " ");
            node = node.next;
        }
    }

    public static void main(String [] args){
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(3);
        head1.next.next = new ListNode(5);
        // 1 -> 3 -> 5 LinkedList Created

        ListNode head2 = new ListNode(0);
        head2.next = new ListNode(2);
        head2.next.next = new ListNode(4);
        // 0 -> 2 -> 4 LinkedList Created

        ListNode mergedhead = mergeTwoLists(head1, head2);
        printList(mergedhead);
    }
}


