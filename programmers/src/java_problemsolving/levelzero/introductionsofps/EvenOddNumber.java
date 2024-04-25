package java_problemsolving.levelzero.introductionsofps;

import java.util.Scanner;

/**
 * Level : 0
 * Title : 짝수 홀수 개수
 * 문제 유형 : 코딩테스트 입문
 *
 * Started : 2024-04-25
 * Solved : 2024-04-25
 *
 * 문제
 * 정수가 담긴 리스트 num_list가 주어질 때, num_list의 원소 중 짝수와 홀수의 개수를 담은 배열을 return 하도록 solution 함수를 완성해보세요.
 *
 * 제한사항
 * 1 ≤ num_list의 길이 ≤ 100
 * 0 ≤ num_list의 원소 ≤ 1,000
 *
 * 입출력 예
 * num_list	        result
 * [1, 2, 3, 4, 5]	[2, 3]
 * [1, 3, 5, 7]	    [0, 4]
 *
 */
public class EvenOddNumber {
    public static int[] solution(int[] num_list) {
        int[] answer = new int[2];
        int oddCnt = 0;
        int evenCnt = 0;
        for(int now : num_list) {
            if(now%2==0) evenCnt++;
            else oddCnt++;
        }
        answer[0] = evenCnt;
        answer[1] = oddCnt;
        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        String[] spStr = str.split(", ");
        int[] num_list = new int[spStr.length];
        for(int i = 0; i < spStr.length ; ++i) {
            num_list[i] = Integer.valueOf(spStr[i]);
        }

        int[] ansArr = solution(num_list);
        String ans = "[";
        for(int i = 0; i < ansArr.length; ++i) {
            ans += String.valueOf(ansArr[i]);
            if(i != ansArr.length - 1) ans += ", ";
        }
        ans += "]";
        System.out.println(ans);
    }

}
