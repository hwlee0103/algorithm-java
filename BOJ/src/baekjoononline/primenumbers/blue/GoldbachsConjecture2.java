package baekjoononline.primenumbers.blue;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Level : Blue 1
 * Title : 6588 골드바흐의 추측
 * 문제 유형 : 소수 Prime Numbers, 에라토스테네스의 체 Sieve of Eratosthenes
 *
 * Started : 2025-02-12
 * Solved : 2025-02-
 *
 *
 */
public class GoldbachsConjecture2 {
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


        // 답이 없으면
        answer = "Goldbach's conjecture is wrong.";

        return answer;
    }

    public static void SieveOfEratosthenes(boolean[] isPrime) {
        for(int i = 2; i * i < isPrime.length; i++) {
            if(isPrime[i]) {
                for(int j = i * i; j < isPrime.length; j += i) {
                    isPrime[j] = false;
                }
            }
        }
    }
}
