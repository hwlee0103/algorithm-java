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
