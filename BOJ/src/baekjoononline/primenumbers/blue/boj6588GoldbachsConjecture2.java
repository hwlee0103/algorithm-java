package baekjoononline.primenumbers.blue;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Level : Blue 1
 * Title : 6588 골드바흐의 추측
 * 문제 유형 : 소수 Prime Numbers, 에라토스테네스의 체 Sieve of Eratosthenes
 *
 * Started : 2025-02-12
 * Solved : 2025-02-13
 *
 *
 */
public class boj6588GoldbachsConjecture2 {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            // input
            StringBuilder sb = new StringBuilder();
            String line;
            while((line = br.readLine()) != null) {
                if(line.equals("0"))break;
                sb.append(line).append("\n");
            }

            // sieve of eratosthenes
            boolean[] isPrime = new boolean[1000001];
            Arrays.fill(isPrime, true);
            SieveOfEratosthenes(isPrime);

            // goldbach's conjecture
            for(String str: sb.toString().split("\n")) {
                String answer = GoldbachsConjecture(isPrime, Integer.parseInt(str));
                System.out.println(answer);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String GoldbachsConjecture(boolean[] isPrime, int target) {
        String answer = String.valueOf(target) + " = ";
        int a = 0;
        int b = 0;
        for(int i = 2 ; i <= target/2; ++i) {
            if(isPrime[i] && i % 2 != 0) {
                if(isPrime[target - i] && (target - i) % 2 != 0) {
                    a = Math.min(i, target - i);
                    b = Math.max(i, target - i);
                    break;
                }
            }
        }
        // 답이 없으면
        if(a == 0) {
            answer = "Goldbach's conjecture is wrong.";
        } else {
            answer += String.valueOf(a) + " + " + String.valueOf(b);
        }

        return answer;
    }

    public static void SieveOfEratosthenes(boolean[] isPrime) {
        for(int i = 2; i < Math.sqrt(isPrime.length); i++) {
            if(isPrime[i]) {
                for(int j = i * i; j < isPrime.length; j += i) {
                    isPrime[j] = false;
                }
            }
        }
    }
}
