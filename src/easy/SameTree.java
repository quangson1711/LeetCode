package easy;

import java.util.ArrayList;
import java.util.List;

public class SameTree {

    boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null)
            return true;
        if (p != null && q != null)
            if (p.val == q.val)
                if (isSameTree(p.left, q.left))
                    if (isSameTree(p.right, q.right))
                        return true;
        return false;

    }

    public static void main(String args[]) {
        TreeNode tree = new TreeNode(1);
        tree.left = new TreeNode(1);

        TreeNode tree1 = new TreeNode(1);
        tree1.right = new TreeNode(1);

        SameTree sameTree = new SameTree();

        System.out.println(sameTree.isSameTree(tree, tree1));
    }
}
