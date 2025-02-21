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
            System.out.println(goldbachPartition(query, isPrime));
        }
    }

    // 골드바흐 파티션
    public static int goldbachPartition(int query, boolean[] isPrime) {
        int answer = 0;
        // 두 소수의 순서만 다른 것은 같은 파티션이다. -> query/2 까지만 탐색
        for(int i = 2; i <= query/2; i++) {
            if(isPrime[i]) {
                int pair = query - i;
                if(isPrime[query - i]) {
                    answer++;
                }
            }
        }

        return answer;
    }

    // 소수판별 - 에라토스테네스의 체
    public static void sieveOfEratosthenes(boolean[] isPrime) {
        for(int i = 2; i * i < isPrime.length; ++i) {
            if(isPrime[i]) {
                for(int j = i * i; j < isPrime.length; j += i) {
                    isPrime[j] = false;
                }
            }
        }
    }
}
