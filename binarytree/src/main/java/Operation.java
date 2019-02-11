import java.util.LinkedList;
import java.util.Queue;
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

    public static void cengxuOrder(TNode root){
        Queue<TNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            TNode node = queue.poll();
            System.out.print(node.value+" ");
            if(node.left != null)queue.add(node.left);
            if(node.right != null)queue.add(node.right);
        }
    }

    public static void midOrderRec(TNode root){
        if(root != null){
            midOrderRec(root.left);
            System.out.println(root.value);
            midOrderRec(root.right);
        }
    }

    public static void midOrder(TNode root){

    }
}
