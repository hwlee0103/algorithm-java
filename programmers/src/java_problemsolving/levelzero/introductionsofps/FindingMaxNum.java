package java_problemsolving.levelzero.introductionsofps;

import java.util.Scanner;

/**
 * Level : 0
 * Title : 가장 큰 수 찾기
 * 문제 유형 : 코딩테스트 입문
 *
 * Started : 2024-05-17
 * Solved : 2024-05-17
 *
 *
 */
public class FindingMaxNum {
    public static int[] solution(int[] array) {
        int[] answer = new int[2];
        for(int i = 0; i < array.length ; ++i) {
            if(answer[0] < array[i]) {
                answer[0] = array[i];
                answer[1] = i;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        String[] spStr = str.split(", ");
        int[] array = new int[spStr.length];
        for(int i = 0; i < spStr.length ; ++i) {
            array[i] = Integer.valueOf(spStr[i]);
        }

        int[] ansArr = solution(array);
        String ans = "[";
        for(int i = 0; i < ansArr.length; ++i) {
            ans += String.valueOf(ansArr[i]);
            if(i != ansArr.length - 1) ans += ", ";
        }
        ans += "]";
        System.out.println(ans);
    }
}
