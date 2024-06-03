package easy;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal {

    void inOrderUntils(TreeNode node, List<Integer> list) {
        if (node == null) {
            return;
        }
        inOrderUntils(node.left, list);
        list.add(node.val);
        inOrderUntils(node.right, list);
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        inOrderUntils(root, list);
        return list;
    }

    public static void main(String args[]){
        TreeNode tree = new TreeNode(1);
        tree.right = new TreeNode(2);
        tree.right.left = new TreeNode(3);

        BinaryTreeInorderTraversal traversal = new BinaryTreeInorderTraversal();
        List<Integer> list = traversal.inorderTraversal(tree);

        System.out.println(list.toString());
    }
}
