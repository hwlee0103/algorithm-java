package java_problemsolving.levelzero.introductionsofps;

import java.util.Scanner;

/**
 * Level : 0
 * Title : 배열 두배 만들기
 * 문제 유형 : 코딩테스트 입문
 *
 * Started : 2024-04-22
 * Solved : 2024-04-22
 *
 * 문제
 * 정수 배열 numbers가 매개변수로 주어집니다.
 * numbers의 각 원소에 두배한 원소를 가진 배열을 return하도록 solution 함수를 완성해주세요.
 *
 * 제한사항
 * -10,000 ≤ numbers의 원소 ≤ 10,000
 * 1 ≤ numbers의 길이 ≤ 1,000
 *
 * 입출력 예
 * numbers	                    result
 * [1, 2, 3, 4, 5]	            [2, 4, 6, 8, 10]
 * [1, 2, 100, -99, 1, 2, 3]	[2, 4, 200, -198, 2, 4, 6]
 *
 */
public class MakeArrayTwoTimes {
    public static int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        for(int i = 0; i < numbers.length; ++i) {
            answer[i] = numbers[i]*2;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        String[] spStr = str.split(", ");
        int[] numbers = new int[spStr.length];
        for(int i = 0;i < spStr.length; ++i) {
            numbers[i] = Integer.valueOf(spStr[i]);
        }
        int[] answer = solution(numbers);
        System.out.print("[");
        for(int i = 0;i < answer.length; ++i) {
            System.out.print(answer[i]);
            if(i < answer.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}
