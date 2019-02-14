public class Operation {
    public static Node revengeNode(Node head) {
        if (head == null || head.next == null)
            return head;
        Node node1 = head;
        Node node2 = null;
        while (node1 != null) {
            Node temp = node1.next;
            node1.next = node2;
            node2 = node1;
            node1 = temp;
        }
        return node2;
    }

    public static Node revengeNode(Node head, int from, int to) {
        int len = 0;
        Node node1 = head;
        Node fPre = null;
        Node tPos = null;
        while (node1 != null) {
            len++;
            fPre = len == from - 1 ? node1 : fPre;
            tPos = len == to + 1 ? node1 : tPos;
            node1 = node1.next;
        }
        if (from > to || from < 1 || to > len) {
            return head;
        }
        node1 = fPre == null ? head : fPre.next;
        Node node2 = node1.next;
        node1.next = tPos; //先将翻转之前的第一个节点连接后半段
        Node temp;
        while (node2 != tPos) {
            temp = node2.next;
            node2.next = node1;
            node1 = node2;
            node2 = temp;
        }
        if (fPre != null) {
            fPre.next = node1;//将前半段和翻转之后的第一个节点连接
            return head;
        }
        return node1;

    }


}
