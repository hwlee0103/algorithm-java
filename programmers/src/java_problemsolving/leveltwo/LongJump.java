package java_problemsolving.leveltwo;

import java.util.Scanner;

/**
 * Level : 2
 * Title : 멀리 뛰기
 * 문제 유형 : 연습문제
 *
 * Started : 2024-08-25
 * Solved : 2024-08-25
 *
 *
 */
public class LongJump {
    public static long solution(int n) {
        long answer = 0;
        long[] arr = new long[20001];
        answer = function(0, n, arr);
        return answer;
    }

    public static long function(int now, int goal, long[] arr) {
        if(arr[now] != 0) return arr[now];
        if(now == goal) {
            return 1;
        } else if(now > goal) {
            return 0;
        }

        arr[now] += function(now+1, goal, arr)%1234567;
        arr[now] += function(now+2, goal, arr)%1234567;

        return arr[now]%1234567;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(solution(scanner.nextInt()));
    }
}
