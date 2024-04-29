package java_problemsolving.levelzero.introductionsofps;

import java.util.Scanner;
/**
 * Level : 0
 * Title : 진료 순서 정하기
 * 문제 유형 : 코딩테스트 입문
 *
 * Started : 2024-04-29
 * Solved : 2024-04-29
 *
 * 문제
 * 외과의사 머쓱이는 응급실에 온 환자의 응급도를 기준으로 진료 순서를 정하려고 합니다.
 * 정수 배열 emergency가 매개변수로 주어질 때 응급도가 높은 순서대로 진료 순서를 정한 배열을 return하도록 solution 함수를 완성해주세요.
 *
 * 제한사항
 * 중복된 원소는 없습니다.
 * 1 ≤ emergency의 길이 ≤ 10
 * 1 ≤ emergency의 원소 ≤ 100
 *
 * emergency	            result
 * [3, 76, 24]	            [3, 1, 2]
 * [1, 2, 3, 4, 5, 6, 7]	[7, 6, 5, 4, 3, 2, 1]
 * [30, 10, 23, 6, 100]	    [2, 4, 3, 5, 1]
 *
 */
public class OrderOfTreatment {
    public static int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];

        for(int i = 0; i < emergency.length ; ++i) {
            for(int j = i+1; j < emergency.length; ++j) {
                if(emergency[i] < emergency[j]) {
                    answer[i]++;
                }else {
                    answer[j]++;
                }
            }
            answer[i]++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        String[] spStr = str.split(", ");
        int[] emergency = new int[spStr.length];
        for(int i = 0; i < spStr.length ; ++i) {
            emergency[i] = Integer.valueOf(spStr[i]);
        }

        int[] ansArr = solution(emergency);
        String ans = "[";
        for(int i = 0; i < ansArr.length; ++i) {
            ans += String.valueOf(ansArr[i]);
            if(i != ansArr.length - 1) ans += ", ";
        }
        ans += "]";
        System.out.println(ans);
    }
}
