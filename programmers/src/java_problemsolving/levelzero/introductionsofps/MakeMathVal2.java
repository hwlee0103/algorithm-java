package java_problemsolving.levelzero.introductionsofps;

import java.util.Scanner;

/**
 * Level : 0
 * Title : 최댓값 만들기 (2)
 * 문제 유형 : 코딩테스트 입문
 *
 * Started : 2024-05-29
 * Solved : 2024-05-29
 *
 * 문제
 * 정수 배열 numbers가 매개변수로 주어집니다.
 * numbers의 원소 중 두 개를 곱해 만들 수 있는 최댓값을 return하도록 solution 함수를 완성해주세요.
 *
 * 제한사항
 * -10,000 ≤ numbers의 원소 ≤ 10,000
 * 2 ≤ numbers 의 길이 ≤ 100
 *
 * 입출력 예
 * numbers	                    result
 * [1, 2, -3, 4, -5]	        15
 * [0, -31, 24, 10, 1, 9]	    240
 * [10, 20, 30, 5, 5, 20, 5]	600
 *
 */
public class MakeMathVal2 {
    public static int solution(int[] numbers) {
        int answer = -100000000;
        for(int i = 0; i < numbers.length; ++i) {
            for(int j = i + 1; j < numbers.length; ++j) {
                answer = Math.max(answer, numbers[i]*numbers[j]);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        String[] spStr = str.split(", ");
        int[] numbers = new int[spStr.length];
        for(int i = 0; i < spStr.length; ++i){
            numbers[i] = Integer.parseInt(spStr[i]);
        }
        System.out.println(solution(numbers));
    }
}
