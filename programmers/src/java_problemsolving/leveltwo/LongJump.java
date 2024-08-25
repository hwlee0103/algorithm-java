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
 * 문제
 * 효진이는 멀리 뛰기를 연습하고 있습니다.
 * 효진이는 한번에 1칸, 또는 2칸을 뛸 수 있습니다.
 * 칸이 총 4개 있을 때, 효진이는
 * (1칸, 1칸, 1칸, 1칸)
 * (1칸, 2칸, 1칸)
 * (1칸, 1칸, 2칸)
 * (2칸, 1칸, 1칸)
 * (2칸, 2칸)
 * 의 5가지 방법으로 맨 끝 칸에 도달할 수 있습니다.
 * 멀리뛰기에 사용될 칸의 수 n이 주어질 때,
 * 효진이가 끝에 도달하는 방법이 몇 가지인지 알아내,
 * 여기에 1234567를 나눈 나머지를 리턴하는 함수,
 * solution을 완성하세요.
 * 예를 들어 4가 입력된다면, 5를 return하면 됩니다.
 *
 * 제한 사항
 * n은 1 이상, 2000 이하인 정수입니다.
 *
 * 입출력 예
 * n	result
 * 4	5
 * 3	3
 *
 * 입출력 예 설명
 * 입출력 예 #1
 * 위에서 설명한 내용과 같습니다.
 *
 * 입출력 예 #2
 * (2칸, 1칸)
 * (1칸, 2칸)
 * (1칸, 1칸, 1칸)
 * 총 3가지 방법으로 멀리 뛸 수 있습니다.
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
