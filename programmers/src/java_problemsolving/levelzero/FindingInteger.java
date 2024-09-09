package java_problemsolving.levelzero;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Level : 0
 * Title : 정수 찾기
 * 문제 유형 : 조건문 활용
 *
 * Started : 2024-09-09
 * Solved : 2024-09-09
 *
 * 문제
 * 정수 리스트 num_list와 찾으려는 정수 n이 주어질 때,
 * num_list안에 n이 있으면 1을 없으면 0을 return하도록 solution 함수를 완성해주세요.
 *
 * 제한사항
 * 3 ≤ num_list의 길이 ≤ 100
 * 1 ≤ num_list의 원소 ≤ 100
 * 1 ≤ n ≤ 100
 *
 * 입출력 예
 * num_list	            n	result
 * [1, 2, 3, 4, 5]	    3	1
 * [15, 98, 23, 2, 15]	20	0
 *
 * 입출력 예 설명
 * 입출력 예 #1
 * [1, 2, 3, 4, 5] 안에 3이 있으므로 1을 return합니다.
 *
 * 입출력 예 #2
 * [15, 98, 23, 2, 15] 안에 20이 없으므로 0을 return합니다.
 *
 */
public class FindingInteger {
    public static int solution(int[] num_list, int n) {
        int answer = 0;
        for(int num : num_list) {
            if(num == n) {
                answer = 1;
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] num_list = Arrays.stream(input.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        int n = input.nextInt();
        System.out.println(solution(num_list, n));
    }
}
