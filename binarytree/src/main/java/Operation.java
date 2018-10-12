import java.util.Stack;

public class Operation {
    public static int getTreeHight(TNode root){
        if(root == null) return 0;
        return  (getTreeHight(root.left) > getTreeHight(root.right) ? getTreeHight(root.left) : getTreeHight(root.right)) + 1;
    }

    public static void preOrderRec(TNode root){
        if(root != null) {
            System.out.println(root.value);
            preOrderRec(root.left);
            preOrderRec(root.right);
        }
    }

    public static void preOrder(TNode root){
        Stack<TNode> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            TNode node = stack.pop();
            System.out.println(node.value);
            if(node.right != null)
            stack.push(node.right);
            if(node.left != null)
            stack.push(node.left);
        }
    }
}
