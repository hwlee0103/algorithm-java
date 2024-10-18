package java_problemsolving.levelzero.introductionsofps;

import java.util.Scanner;

/**
 * Level : 0
 * Title : 짝수는 싫어요
 * 문제 유형 : 코딩테스트 입문
 *
 * Started : 2024-04-23
 * Solved : 2024-04-23
 *
 *
 */
public class DontLikeEvenNum {
    public static int[] solution(int n) {
        int[] answer = {};
        if(n%2==0) answer = new int[n/2];
        else answer = new int[n/2+1];

        int idx = 0;
        for(int i = 1; i <= n ; ++i) {
            if(i%2==1) answer[idx++] = i;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] answer = solution(n);
        System.out.print("[");
        for(int i = 0;i < answer.length; ++i) {
            System.out.print(answer[i]);
            if(i < answer.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}
