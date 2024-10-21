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
