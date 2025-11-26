package JavaProblemSolving.Hard;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Level : Hard
 * Title : 2435. Paths in Matrix Whose Sum Is Divisible by K
 * Topic : Array, Dynamic Programming, Matrix, Weekly Contest 314
 *
 * Started : 2025-11-26
 * Solved : 2025-11-
 * Time: 15 min 05 sec -ing
 * Algorithm: DP
 *
 *
 *
 */
public class DivisibleMatrixPaths {
    public static void main(String[] args) {

    }

    // Matrix index, DP
    // path modulo -> (nowSum % k)%(1000000000 + 7);
    // visited 없어도 됨 -> right, down 방향만 탐색
    public int numberOfPaths(int[][] grid, int k) {
        int ans = 0;
        int[][] dp = new int[grid.length][grid[0].length];
        int[] dx = {0, 1};
        int[] dy = {1, 0};

        int now = 0; // 현 위치까지 계산된 값의 모듈로 결과
        // start = (0, 0)
        // end = (m - 1, n - 1)
        // queue -> position / 각 결과도
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[] {0, 0}); // start
        dp[0][0] = grid[0][0];

        while (!q.isEmpty()) {

        }

        return 0;
    }
}
