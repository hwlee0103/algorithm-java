package java_problemsolving.levelzero;

import java.util.Scanner;

/**
 * Level : 0
 * Title : 카운트 업
 * 문제 유형 : 코딩 기초 트레이닝
 *
 * Started : 2024-06-30
 * Solved : 2024-06-30
 *
 * 문제
 * 정수 start_num와 end_num가 주어질 때,
 * start_num부터 end_num까지의 숫자를 차례로 담은 리스트를 return하도록 solution 함수를 완성해주세요.
 *
 * 제한사항
 * 0 ≤ start_num ≤ end_num ≤ 50
 *
 * 입출력 예
 * start_num	end_num	result
 * 3	        10	    [3, 4, 5, 6, 7, 8, 9, 10]
 *
 * 입출력 예 #1
 * 3부터 10까지의 숫자들을 담은 리스트 [3, 4, 5, 6, 7, 8, 9, 10]를 return합니다.
 *
 */
public class CountUp {
    public static int[] solution(int start_num, int end_num) {
        int[] answer = new int[end_num - start_num + 1];
        for(int i = start_num ; i <= end_num; ++i) {
            answer[i - start_num] = i;
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
            if(i < answer.length -1 ) System.out.print(", ");
        }
        System.out.println("]");
    }
}
