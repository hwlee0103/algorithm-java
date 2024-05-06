package java_problemsolving.levelzero.introductionsofps;

import java.util.Scanner;
/**
 * Level : 0
 * Title : 최댓값 만들기(1)
 * 문제 유형 : 코딩테스트 입문
 *
 * Started : 2024-05-06
 * Solved : 2024-05-06
 *
 * 문제
 * 정수 배열 numbers가 매개변수로 주어집니다.
 * numbers의 원소 중 두 개를 곱해 만들 수 있는 최댓값을 return하도록 solution 함수를 완성해주세요.
 *
 * 제한사항
 * 0 ≤ numbers의 원소 ≤ 10,000
 * 2 ≤ numbers의 길이 ≤ 100
 *
 * 입출력 예
 * numbers	                result
 * [1, 2, 3, 4, 5]	        20
 * [0, 31, 24, 10, 1, 9]	744
 *
 */
public class MakingMaxVal {
    public static int solution(int[] numbers) {
        int answer = 0;
        for(int i = 0;i < numbers.length-1 ; ++i) {
            for(int j = i+1; j < numbers.length; ++j ) {
                answer = Math.max(answer, numbers[i]*numbers[j]);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        str = str.replace("[", "");
        str = str.replace("]", "");
        String[] spStr = str.split(", ");
        int[] numbers = new int[spStr.length];
        for(int i = 0; i < spStr.length; ++i) {
            numbers[i] = Integer.valueOf(spStr[i]);
        }

        System.out.println(solution(numbers));
    }
}
