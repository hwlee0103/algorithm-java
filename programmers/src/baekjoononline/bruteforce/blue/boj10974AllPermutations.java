package baekjoononline.bruteforce.blue;

import java.util.Scanner;

/**
 * Level : Blue 3
 * Title : 모든 순열
 * 문제 유형 : Bruteforcing
 *
 * Started : 2024-11-11
 * Solved : 2024-11-11
 *
 *
 */
public class boj10974AllPermutations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        boolean[] check = new boolean[n];
        int[] answer = new int[n];
        permut(n, 0, check, answer);
    }

    public static void permut(int n, int nowIdx, boolean[] check, int[] answer) {
        if(nowIdx > n) return;
        if(nowIdx == n) {
//            System.out.println(Arrays.toString(answer));
            for(int i = 0; i < answer.length; i++) {
                if(i == answer.length - 1) {
                    System.out.println(answer[i]);
                } else {
                    System.out.print(answer[i] + " ");
                }
            }
            return;
        }

        for(int i = 0; i < n; ++i) {
            if(check[i]) continue;
            check[i] = true;
            answer[nowIdx] = i + 1;
            permut(n, nowIdx + 1, check, answer);
            check[i] = false;
            answer[nowIdx] = 0;
        }
    }
}
