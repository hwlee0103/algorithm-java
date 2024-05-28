package java_problemsolving.levelzero.introductionsofps;

import java.util.Scanner;

/**
 * Level : 0
 * Title : 머쓱이보다 키 큰 사람
 * 문제 유형 : 코딩테스트 입문
 *
 * Started : 2024-05-28
 * Solved : 2024-05-28
 *
 * 문제
 * 머쓱이는 학교에서 키 순으로 줄을 설 때 몇 번째로 서야 하는지 궁금해졌습니다.
 * 머쓱이네 반 친구들의 키가 담긴 정수 배열 array와 머쓱이의 키 height가 매개변수로 주어질 때,
 * 머쓱이보다 키 큰 사람 수를 return 하도록 solution 함수를 완성해보세요.
 *
 * 제한사항
 * 1 ≤ array의 길이 ≤ 100
 * 1 ≤ height ≤ 200
 * 1 ≤ array의 원소 ≤ 200
 *
 * 입출력 예
 * array	            height	result
 * [149, 180, 192, 170]	167	    3
 * [180, 120, 140]	    190	    0
 *
 */
public class TallerThanMusseuk {
    public static int solution(int[] array, int height) {
        int answer = 0;
        for(int now : array) {
            if(now > height) answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String strArr = input.nextLine();
        strArr = strArr.replace("[", "");
        strArr = strArr.replace("]", "");
        String[] spStr = strArr.split(", ");
        int[] array = new int[spStr.length];
        for(int i = 0; i < spStr.length; ++i) {
            array[i] = Integer.parseInt(spStr[i]);
        }
        int height = input.nextInt();
        System.out.println(solution(array, height));
    }

}
