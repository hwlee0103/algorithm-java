package baekjoononline.primenumbers.blue;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Level : Blue 2
 * Title : 9020 골드바흐의 추측
 * 문제 유형 : 소수 Prime Numbers, 에라토스테네스의 체 Sieve of Eratosthenes
 *
 * Started : 2025-02-11
 * Solved : 2025-02-11
 *
 *
 */
public class boj9020GoldbachsConjecture {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] query = new int[n];
        for(int i = 0; i < n; i++){
            query[i] = input.nextInt();
        }
        boolean[] isPrime = new boolean[10001];
        Arrays.fill(isPrime, true);
        sieveOfEratosthenes(isPrime);

        for(int i = 0; i < query.length; i++){
            int[] answer = goldBachConjecture(query[i], isPrime);
            System.out.println(answer[0] + " " + answer[1]);
        }
    }

    // goldbach's conjecture
    public static int[] goldBachConjecture(int target, boolean[] isPrime) {
        int[] answer = new int[2];
        int diff = 10001;
        for(int i = target / 2; i >= 2; --i) {
            if(isPrime[i]) {
                if(isPrime[target - i]) {
                    if(Math.abs(target - i) < diff) {
                        diff = Math.abs(target - i);
                        answer[0] = target - i;
                        answer[1] = i;
                    }
                }
            }
        }
        Arrays.sort(answer);
        return answer;
    }

    // sieve of eratosthenes
    public static void sieveOfEratosthenes(boolean[] isPrime) {
        for(int i = 2; i * i < isPrime.length; i++) {
            if(isPrime[i]) {
                for(int j = i * i; j < isPrime.length; j+=i) {
                    isPrime[j] = false;
                }
            }
        }
    }
}
