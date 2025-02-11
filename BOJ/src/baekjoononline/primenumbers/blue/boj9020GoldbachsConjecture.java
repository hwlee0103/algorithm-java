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
        for(int i = target / 2; i >= 2; --i) { // 최적화 1 - 차이가 최소가 되는 수를 찾기 위해서는 2가 아닌 target/2부터 시작해서 숫자를 감소시켜가며 찾기
            if(isPrime[i]) {
                if(isPrime[target - i]) { // 최적화 2 - 소수 + 소수를 찾는 것이기 때문에 i가 소수이면 target-i도 소수여야 답의 후보가 됨. 굳이 이중 반복문을 쓸 필요가 없이 확인 가능
                    if(Math.abs(target - i) < diff) { // Q. 최적화 1 - 그렇다면 diff 판별은 필요 없을까? 찾자마자 return 하면 되는걸까?
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
