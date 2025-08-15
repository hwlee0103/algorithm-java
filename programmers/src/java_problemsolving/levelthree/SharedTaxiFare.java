package java_problemsolving.levelthree;

import java.util.Arrays;

/**
 * Level : 3
 * Title : 합승 택시 요금
 * 문제 유형 : 플로이드 워셜 (+ 다익스트라)
 *
 * Started : 2025-08-15
 * Solved : 2025-08-15
 *
 *
 */

public class SharedTaxiFare {
    static final int INF = 1_000_000_000;

    public static void main(String[] args) {

    }

    public int solution(int n, int s, int a, int b, int[][] fares) {
        int[][] dist = new int[n+1][n+1];

        for(int i = 1;i <= n; ++i) {
            Arrays.fill(dist[i], INF);
            dist[i][i] = 0;
        }
        for(int[] f: fares) {
            int u = f[0], v = f[1], w = f[2];
            dist[u][v] = w;
            dist[v][u] = w;
        }

        // 플로이드-워셜
        for(int k = 1; k <= n;++k) {
            for(int i = 1; i <= n; ++i) {
                if(dist[i][k] == INF) continue;
                for(int j = 1; j <= n; ++j) {
                    if(dist[k][j] == INF) continue;
                    int nowDist = dist[i][k] + dist[k][j];
                    if(nowDist < dist[i][j]) dist[i][j] = nowDist;
                }
            }
        }

        long ans = Long.MAX_VALUE;
        for(int k = 1; k <= n;++k) {
            ans = Math.min(ans, 0L + dist[s][k] + dist[k][a] + dist[k][b]);
        }

        return (int) ans;
    }
}
