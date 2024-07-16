package java_problemsolving.levelzero;

import java.util.Scanner;

/**
 * Level : 0
 * Title : 카운트 다운
 * 문제 유형 : 리스트(배열)
 *
 * Started : 2024-07-16
 * Solved : 2024-07-16
 *
 * 문제
 * 정수 start_num와 end_num가 주어질 때, start_num에서 end_num까지 1씩 감소하는 수들을 차례로 담은 리스트를 return하도록 solution 함수를 완성해주세요.
 *
 * 제한사항
 * 0 ≤ end_num ≤ start_num ≤ 50
 *
 * 입출력 예
 * start_num	end_num	result
 * 10	        3	    [10, 9, 8, 7, 6, 5, 4, 3]
 *
 * 입출력 예 설명
 * 입출력 예 #1
 * 10부터 3까지 1씩 감소하는 수를 담은 리스트는 [10, 9, 8, 7, 6, 5, 4, 3]입니다.
 *
 */
public class CountDown {
    public static int[] solution(int start_num, int end_num) {
        int[] answer = new int[start_num - end_num + 1];
        int idx = 0;
        for(int i = start_num ; i >= end_num; --i) {
            answer[idx++] = i;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int start_num = input.nextInt();
        int end_num = input.nextInt();
        int[] answer = solution(start_num, end_num);
        System.out.print("[");
        for(int i = 0; i < answer.length; ++i) {
            System.out.print(answer[i]);
            if(i < answer.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}
