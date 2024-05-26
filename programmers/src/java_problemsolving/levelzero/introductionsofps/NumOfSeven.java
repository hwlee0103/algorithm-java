package java_problemsolving.levelzero.introductionsofps;

import java.util.Scanner;

/**
 * Level : 0
 * Title : 7의 개수
 * 문제 유형 : 코딩테스트 입문
 *
 * Started : 2024-05-26
 * Solved : 2024-05-26
 *
 * 문제
 * 머쓱이는 행운의 숫자 7을 가장 좋아합니다.
 * 정수 배열 array가 매개변수로 주어질 때, 7이 총 몇 개 있는지 return 하도록 solution 함수를 완성해보세요.
 *
 * 제한사항
 * 1 ≤ array의 길이 ≤ 100
 * 0 ≤ array의 원소 ≤ 100,000
 *
 * 입출력 예
 * array	    result
 * [7, 77, 17]	4
 * [10, 29]	    0
 *
 */
public class NumOfSeven {
    public static int solution(int[] array) {
        int answer = 0;
        String arrStr = "";
        for(int i = 0; i < array.length; ++i) {
            arrStr += String.valueOf(array[i]);
        }
        for(int i = 0; i <arrStr.length(); ++i) {
            if(arrStr.charAt(i) == '7') answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        str = str.replace("[", "");
        str = str.replace("]", "");
        String[] spStr = str.split(", ");
        int[] num_list = new int[spStr.length];
        for(int i = 0; i < spStr.length; ++i) {
            num_list[i] = Integer.valueOf(spStr[i]);
        }

        System.out.println(solution(num_list));
    }


}
