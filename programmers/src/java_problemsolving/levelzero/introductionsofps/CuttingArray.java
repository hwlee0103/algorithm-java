package java_problemsolving.levelzero.introductionsofps;

import java.util.Scanner;

/**
 * Level : 0
 * Title : 배열 자르기
 * 문제 유형 : 코딩테스트 입문
 *
 * Started : 2024-04-29
 * Solved : 2024-04-29
 *
 * 문제
 * 정수 배열 numbers와 정수 num1, num2가 매개변수로 주어질 때, numbers의 num1번 째 인덱스부터 num2번째 인덱스까지 자른 정수 배열을 return 하도록 solution 함수를 완성해보세요.
 *
 * 제한사항
 * 2 ≤ numbers의 길이 ≤ 30
 * 0 ≤ numbers의 원소 ≤ 1,000
 * 0 ≤num1 < num2 < numbers의 길이
 *
 * numbers	        num1	num2	result
 * [1, 2, 3, 4, 5]	1	    3	    [2, 3, 4]
 * [1, 3, 5]	    1	    2	    [3, 5]
 *
 */
public class CuttingArray {
    public static int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[num2-num1+1];
        for(int i = 0; i < num2-num1+1; ++i) {
            answer[i] = numbers[num1+i];
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        String[] spStr = str.split(", ");
        int[] numbers = new int[spStr.length];
        for(int i = 0; i < spStr.length ; ++i) {
            numbers[i] = Integer.valueOf(spStr[i]);
        }
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        int[] ansArr = solution(numbers, num1, num2);
        String ans = "[";
        for(int i = 0; i < ansArr.length; ++i) {
            ans += String.valueOf(ansArr[i]);
            if(i != ansArr.length - 1) ans += ", ";
        }
        ans += "]";
        System.out.println(ans);
    }
}
