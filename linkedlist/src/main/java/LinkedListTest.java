public class LinkedListTest {

    static Node node1 = new Node("node1");
    static Node node2 = new Node("node2");
    static Node node3 = new Node("node3");
    static Node node4 = new Node("node4");
    static Node node5 = new Node("node5");
    static Node node6 = new Node("node6");
    static Node node7 = new Node("node7");
    static Node node8 = new Node("node8");
    static Node node9 = new Node("node9");

    static {
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        node7.next = node8;
        node8.next = node9;
    }

    public static void main(String[] args) {
        Node nodeLast = Operation.revengeNode(node1,1,5);
        while(nodeLast != null) {
            System.out.println(nodeLast.value);
            nodeLast = nodeLast.next;
        }
    }
}
