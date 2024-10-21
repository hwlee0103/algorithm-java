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
