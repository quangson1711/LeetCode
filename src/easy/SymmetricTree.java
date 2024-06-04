package easy;

public class SymmetricTree {

    public boolean isSymmetricTwoTree(TreeNode a, TreeNode b) {
        if (a == null && b == null){
            return true;
        }

        if (a != null && b != null)
            if(a.val == b.val)
                if(isSymmetricTwoTree(a.left, b.right))
                    if(isSymmetricTwoTree(a.right, b.left))
                    return true;
        return false;
    }

    public boolean isSymmetric(TreeNode root) {
        return isSymmetricTwoTree(root.left, root.right);
    }
}
