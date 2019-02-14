package zeroplus;

public class Solution2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 ==null || l2 ==null)
            return null;
        int carry = 0;
        ListNode listNode1 = new ListNode(0);
        ListNode listNode = listNode1;
        while(l1 != null && l2 != null){
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            listNode.next = new ListNode(sum % 10);
            listNode = listNode.next;
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        return listNode;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}