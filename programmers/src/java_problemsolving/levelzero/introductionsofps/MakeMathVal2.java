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
