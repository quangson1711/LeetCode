package easy;

public class ConvertSortedArrayToBinarySearchTree {
    /**
     * ý tưởng :
     * Chia đôi mảng lấy phần tử ở giữa làm root
     * Tiếp tục chia đôi mảng con ở bên trái lấy phần tử ở giữa làm root trái
     * Tiếp tục chia đôi mảng con ở bên phải lấy phần tử ở giữa làm root phải
     * Điểm dùng là khi mảng có 1 phần tử
     */

    public TreeNode sortedArrayToBST(int[] nums) {
        int start = 0, end = nums.length - 1;
        TreeNode root = sortedArrayToBST(nums, start, end);
        return root;
    }

    private TreeNode sortedArrayToBST(int[] nums, int start, int end) {
        if (start > end) return null;

        int mid = (start + end) / 2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = sortedArrayToBST(nums, start, mid - 1);
        node.right = sortedArrayToBST(nums, mid + 1, end);
        return node;
    }
}
