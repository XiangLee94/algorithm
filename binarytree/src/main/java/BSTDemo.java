public class BSTDemo {

    public static String searchFromBST(TreeNode root,Integer value){
        if(root == null) return null;
        while(root !=null){
            if(value == root.getValue())
                return root.getName();
            else if(value > root.getValue()){
                searchFromBST(root.getLeft(),value);
            }else {
                searchFromBST(root.getRight(),value);
            }
        }
        return null;
    }

    public static void main(String[] args) {

    }
}
