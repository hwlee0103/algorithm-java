package JavaProblemSolving.Easy;

/**
 * Level : Easy
 * Title : 106. Maximum Depth of Binary Tree
 * Topic : Tree, Depth-First Search, Breadth-First Search, Binary Tree
 *
 * Started : 2025-11-07
 * Solved : 2025-11-07
 * Time: 03 min 06 sec
 * Algorithm: DFS 탐색 사용
 *
 *
 *
 */
public class MaximumDepthOfBinaryTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        int leftHeight = maxDepth(root.left);
        int rightHeight = maxDepth(root.right);
        return (leftHeight >= rightHeight ? leftHeight : rightHeight) + 1;
    }
}
