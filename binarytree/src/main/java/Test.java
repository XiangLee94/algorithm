import java.util.Optional;

/**
 *                              root
 *                            /      \
 *                          /         \
 *                        /            \
 *                      /               \
 *               node1                   node2
 *             /       \                /     \
 *            /         \              /       \
 *       node3          node4       node5     node6
 *                       /             \
 *                      /               \
 *                   node7             node8
 *                                      /
 *                                     /
 *                                  node9
 *                                  /
 *                                 /
 *                              node10
 */


public class Test {
    static   TNode root = new TNode("root");
    static TNode node1 = new TNode("node1");
    static TNode node2 = new TNode("node2");
    static TNode node3 = new TNode("node3");
    static TNode node4 = new TNode("node4");
    static TNode node5 = new TNode("node5");
    static TNode node6 = new TNode("node6");
    static TNode node7 = new TNode("node7");
    static TNode node8 = new TNode("node8");
    static TNode node9 = new TNode("node9");
    static TNode node10 = new TNode("node10");
    static {
        root.left=node1;
        root.right=node2;
        node1.left = node3;
        node1.right = node4;
        node4.left = node7;
        node2.left=node5;
        node2.right = node6;
        node5.right =node8;
        node8.left=node9;
        node9.right = node10;
    }


    public static void main(String[] args) {
        System.out.println(Operation.getTreeHight(node5));
        Operation.preOrder(root);
    }


}
