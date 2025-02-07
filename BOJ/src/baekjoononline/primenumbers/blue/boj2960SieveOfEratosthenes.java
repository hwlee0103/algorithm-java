package baekjoononline.primenumbers.blue;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Level : Blue 4
 * Title : 2960 에라토스테네스의 체
 * 문제 유형 : 소수 Prime Numbers, 에라토스테네스의 체 Sieve of Eratosthenes
 *
 * Started : 2025-02-07
 * Solved : 2025-02-07
 *
 *
 */

public class boj2960SieveOfEratosthenes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();
        int[] primes = new int[n + 1];
        Arrays.fill(primes, -1);
        eratosthenes(primes);

        int answer = 0;
        for(int i = 2; i < primes.length; i++) {
            if(primes[i] == k) {
                answer = i;
            }
        }

        System.out.println(answer);
    }

    public static void eratosthenes(int[] arr) {
        // false 대신 지워진 순서 저장
        int cnt = 1;
        for(int i = 2; i < arr.length; i++) {
            if(arr[i] == -1) {
                for(int j = i; j < arr.length; j += i) {
                    if(arr[j] == -1) {
                        arr[j] = cnt;
                        cnt++;
                    }
                }
            }
        }
    }
}
