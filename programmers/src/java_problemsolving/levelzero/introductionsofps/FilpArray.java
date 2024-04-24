package java_problemsolving.levelzero.introductionsofps;

import java.util.Scanner;
/**
 * Level : 0
 * Title : 배열 뒤집기
 * 문제 유형 : 코딩테스트 입문
 *
 * Started : 2024-04-24
 * Solved : 2024-04-24
 *
 * 문제
 * 정수가 들어 있는 배열 num_list가 매개변수로 주어집니다. num_list의 원소의 순서를 거꾸로 뒤집은 배열을 return하도록 solution 함수를 완성해주세요.
 *
 * 제한사항
 * 1 ≤ num_list의 길이 ≤ 1,000
 * 0 ≤ num_list의 원소 ≤ 1,000
 *
 * 입출력 예
 * num_list	                result
 * [1, 2, 3, 4, 5]	        [5, 4, 3, 2, 1]
 * [1, 1, 1, 1, 1, 2]	    [2, 1, 1, 1, 1, 1]
 * [1, 0, 1, 1, 1, 3, 5]	[5, 3, 1, 1, 1, 0, 1]
 *
 */
public class FilpArray {
    public static int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        int idx = 0;
        for(int i = num_list.length - 1; i >= 0; --i) {
            answer[idx++] = num_list[i];
        }
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
