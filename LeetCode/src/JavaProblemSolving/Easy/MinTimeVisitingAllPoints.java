package JavaProblemSolving.Easy;

/**
 * Level : Easy
 * Title : 1266. Minimum Time Visiting All Points
 * Topic : Array, Math, Geometry, Weekly Contest 164
 *
 * Started : 2026-01-12
 * Solved : 2026-01-
 * Time: -
 * Algorithm: -
 *
 *
 *
 */
public class MinTimeVisitingAllPoints {
    public static void main(String[] args) {

    }

    public int minTimeToVisitAllPoints(int[][] points) {
        int[] dir = {0, 1, 2};
        int ans = 0;

        // 1. 시작 점 - 목적 점(다음 점) : x, y중 한 개라도 같으면 다른 좌표만 움직이면 됨 -> 그 만큼 count
        // 2. 같은 게 없다면, 같은 게 생길 때 까지 대각선 움직임 (x, y 모두 변동) _+ 같아지면 다른거의 차이만큼 + count
        // [[1,1],[3,4],[-1,0]]
        // (1, 1) & [3, 4] -> 같은 게 없음
        //                  -> 3 -1, 4 -1 중에 2가 더 작으므로 2만큼 대각선 이동 -> [1, 1] -> [3, 3]
        //                  -> [3, 3] && [3, 4] -> 다른거 1칸
        // ans += 3; (대각선 2, 수직 1)
        // [3, 4] -> [-1, 0]
        //                  -> -1 -3, -4 -> 둘 다 -4 -> 대각선 4칸 -> ans += 4;
        // ans == 7;


        // move horizontally
        // move vertically
        // move diagonally
        return ans;
    }
}
