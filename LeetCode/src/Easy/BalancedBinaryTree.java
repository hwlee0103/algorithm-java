package Easy;

/**
 * Level : Easy
 * Title : 110. Balanced Binary Tree
 * Topic : Tree, Depth-First Search, Binary Tree
 *
 * Started : 2025-11-07
 * Solved : 2025-11-07
 * Time: 30 min 00 sec
 * Algorithm: DFS 탐색 사용
 *
 *
 *
 */
public class BalancedBinaryTree {
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
        }s
    }

    public boolean isBalanced(TreeNode root) {
        // 모든 노드(서브노드)에서 좌 우 서브트리 높이 차가 1 이하
        // + 두 서브트리 자체도 균형일 때 => 균형잡힌 이진트리
        // 모든 노드에서 bfs로 좌/우 서브트리 탐색 & 높이 확인
        // post-order : left-right-root 순서 탐색
        // 하나라도 높이차가 2 이상일 경우 탐색 중단 & return false
        return heightDfs(root) == -1 ? false : true;
    }

    private int heightDfs(TreeNode root) {
        if (root == null)
            return 0;
        //System.out.println("now: " + root.val);
        //System.out.println("left: " + (root.left == null ? "null" : root.left.val));
        //System.out.println("right: " + (root.right == null ? "null" : root.right.val));
        int leftHeight = heightDfs(root.left);
        //System.out.println("leftHeight: " + leftHeight);
        if (leftHeight == -1)
            return -1;
        int rightHeight = heightDfs(root.right);
        //System.out.println("rightHeight: " + rightHeight);
        if (rightHeight == -1)
            return -1;

        return Math.abs(leftHeight - rightHeight) > 1 ? -1 : Math.max(leftHeight, rightHeight) + 1;
    }

}
