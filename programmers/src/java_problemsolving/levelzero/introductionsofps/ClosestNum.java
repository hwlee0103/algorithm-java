package java_problemsolving.levelzero.introductionsofps;

import java.util.Scanner;

import static java.lang.Math.min;

/**
 * Level : 0
 * Title : 가까운 수
 * 문제 유형 : 코딩테스트 입문
 *
 * Started : 2024-05-13
 * Solved : 2024-05-13
 *
 * 문제
 * 정수 배열 array와 정수 n이 매개변수로 주어질 때,
 * array에 들어있는 정수 중 n과 가장 가까운 수를 return 하도록 solution 함수를 완성해주세요.
 *
 *
 * 제한사항
 * 1 ≤ array의 길이 ≤ 100
 * 1 ≤ array의 원소 ≤ 100
 * 1 ≤ n ≤ 100
 * 가장 가까운 수가 여러 개일 경우 더 작은 수를 return 합니다.
 *
 * 입출력 예
 * array	    n	result
 * [3, 10, 28]	20	28
 * [10, 11, 12]	13	12
 *
 */
public class ClosestNum {
    public static int solution(int[] array, int n) {
        int answer = 101;
        int diff = 101;
        for(int item : array) {
            if(Math.abs(n - item) < diff) {
                diff = Math.abs(n - item);
                answer = item;
            } else if(Math.abs(n - item) == diff) {
                answer = Math.min(item, answer);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        String[] spStr = str.split(", ");
        int[] array = new int[spStr.length];
        for(int i = 0;i < spStr.length; ++i) {
            array[i] = Integer.valueOf(spStr[i]);
        }
        input.reset();
        int n = input.nextInt();
        System.out.println(solution(array, n));
    }
}
