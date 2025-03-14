package baekjoononline.primenumbers.blue_silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Level : Blue 2
 * Title : 4948 베르트랑 공준
 * 문제 유형 : 소수 Prime Numbers, 에라토스테네스의 체 Sieve of Eratosthenes
 *
 * Started : 2025-02-05
 * Solved : 2025-02-06
 *
 *
 */

public class boj4948BertrandPostulate {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            StringBuilder sb = new StringBuilder();
            String line;
            int maxNum = 0;
            // input
            while((line = br.readLine()) != null) {
                if(line.equals("0")) break;
                maxNum = Math.max(maxNum, Integer.parseInt(line));
                sb.append(line).append("\n");
            }
            maxNum *= 2;
            String[] queries = sb.toString().split("\n");
//            System.out.println(sb);

            // Eratosthenes
            boolean [] eratosArr = new boolean[2 * maxNum + 1];
            Arrays.fill(eratosArr, true);
            eratosArr[0] = eratosArr[1] = false;
            Eratosthenes(maxNum, eratosArr);

            // 테스트케이스 별 탐색
            for(String now : queries) {
                int count = 0;
                int start = Integer.parseInt(now);
                for(int i = start + 1; i <= start * 2; ++i) {
                    if(eratosArr[i]) {
                        count++;
                    }
                }
                System.out.println(count);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 소수판별 - 에라토스테네스의 체
    public static void Eratosthenes(int maxNum, boolean[] eratosArr) {
        for(int i = 2; i * i <= maxNum; ++i) {
            if(eratosArr[i]) {
                for(int j = i * i; j <= maxNum; j += i) {
                    eratosArr[j] = false;
                }
            }
        }
    }
}
