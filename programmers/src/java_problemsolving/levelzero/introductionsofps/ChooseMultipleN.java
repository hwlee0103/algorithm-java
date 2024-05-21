package java_problemsolving.levelzero.introductionsofps;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Level : 0
 * Title : n의 배수 고르기
 * 문제 유형 : 코딩테스트 입문
 *
 * Started : 2024-05-19
 * Solved : 2024-05-21
 *
 * 문제
 * 정수 n과 정수 배열 numlist가 매개변수로 주어질 때, numlist에서 n의 배수가 아닌 수들을 제거한 배열을 return하도록 solution 함수를 완성해주세요.
 *
 * 제한사항
 * 1 ≤ n ≤ 10,000
 * 1 ≤ numlist의 크기 ≤ 100
 * 1 ≤ numlist의 원소 ≤ 100,000
 *
 * 입출력 예
 * n	numlist	                        result
 * 3	[4, 5, 6, 7, 8, 9, 10, 11, 12]	[6, 9, 12]
 * 5	[1, 9, 3, 10, 13, 5]	        [10, 5]
 * 12	[2, 100, 120, 600, 12, 12]	    [120, 600, 12, 12]
 *
 */
public class ChooseMultipleN {
    public static int[] solution(int n, int[] numlist) {
        int[] answer = {};

        List<Integer> list = new ArrayList<>();
        for(int i = 0;i < numlist.length; ++i) {
            if(numlist[i]%n == 0) list.add(numlist[i]);
        }
        answer = list.stream().mapToInt(i -> i).toArray();

        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        input.reset();
        int n = input.nextInt();
//        input.remove();
        String[] spStr = str.split(", ");
        int[] numlist = new int[spStr.length];
        for(int i = 0; i < spStr.length ; ++i) {
            numlist[i] = Integer.valueOf(spStr[i]);
        }

        int[] ansArr = solution(n, numlist);
        String ans = "[";
        for(int i = 0; i < ansArr.length; ++i) {
            ans += String.valueOf(ansArr[i]);
            if(i != ansArr.length - 1) ans += ", ";
        }
        ans += "]";
        System.out.println(ans);
    }
}
