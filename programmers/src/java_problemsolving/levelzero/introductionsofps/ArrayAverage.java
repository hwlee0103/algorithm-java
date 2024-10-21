package java_problemsolving.levelzero.introductionsofps;

import java.util.Scanner;
/**
 * Level : 0
 * Title : 배열의 평균값
 * 문제 유형 : 코딩테스트 입문
 *
 * Started : 2024-04-23
 * Solved : 2024-04-23
 *
 *
 */
public class ArrayAverage {
    public static double solution(int[] numbers) {
        double answer = 0;
        for(int i = 0; i < numbers.length ; ++i) {
            answer += (double) numbers[i];
        }
        answer /= numbers.length;
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
        System.out.println(solution(numbers));
    }
}
