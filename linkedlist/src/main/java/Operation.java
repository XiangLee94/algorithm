public class Operation {
    public static Node revengeNode(Node head){
        if(head == null || head.next == null)
            return head;
        Node p = head;
        Node q = null;
        while (p != null){
            Node temp = p.next;
            p.next = q;
            q = p;
            p = temp;
        }
        return q;
    }

}
