public class Operation {
    public static void revengeNode(Node root){
        if(root == null || root.next == null)
            return;
        Node p = root;
        Node q = null;
        while (p != null){
            Node temp = p.next;
            p.next = q;
            q = p;
            p = temp;
        }
    }

}
