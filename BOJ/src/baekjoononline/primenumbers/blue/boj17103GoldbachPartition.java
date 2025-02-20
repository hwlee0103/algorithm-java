package baekjoononline.primenumbers.blue;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Level : Blue 2
 * Title : 17103 골드바흐 파티션
 * 문제 유형 : 소수 Prime Numbers, 에라토스테네스의 체 Sieve of Eratosthenes
 *
 * Started : 2025-02-20
 * Solved : 2025-02-
 *
 *
 */

public class boj17103GoldbachPartition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        int[] queries = new int[t];
        int maxNum = 0;
        for(int i = 0; i < t; i++) {
            queries[i] = input.nextInt();
            maxNum = Math.max(maxNum, queries[i]);
        }

        boolean[] isPrime = new boolean[maxNum + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;
        sieveOfEratosthenes(isPrime);

        for(int query: queries) {

        }
    }

    // 골드바흐 파티션
    public static int goldbachPartition(int query, boolean[] isPrime) {
        int answer = 0;
        // TODO: 골드바흐 파티션 판별
        
        return answer;
    }

    // 소수판별 - 에라토스테네스의 체
    public static void sieveOfEratosthenes(boolean[] isPrime) {
        for(int i = 2; i * i <= isPrime.length; ++i) {
            if(isPrime[i]) {
                for(int j = i * i; j <= isPrime.length; ++j) {
                    isPrime[j] = false;
                }
            }
        }
    }
}
