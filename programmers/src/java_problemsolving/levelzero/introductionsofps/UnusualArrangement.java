package java_problemsolving.levelzero.introductionsofps;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

/**
 * Level : 0
 * Title : 특이한 정렬
 * 문제 유형 : 코딩테스트 입문
 *
 * Started : 2024-06-10
 * Solved : 2024-06-
 *
 * 문제
 * 정수 n을 기준으로 n과 가까운 수부터 정렬하려고 합니다.
 * 이때 n으로부터의 거리가 같다면 더 큰 수를 앞에 오도록 배치합니다.
 * 정수가 담긴 배열 numlist와 정수 n이 주어질 때 numlist의 원소를 n으로부터 가까운 순서대로 정렬한 배열을 return하도록 solution 함수를 완성해주세요.
 *
 * 제한사항
 * 1 ≤ n ≤ 10,000
 * 1 ≤ numlist의 원소 ≤ 10,000
 * 1 ≤ numlist의 길이 ≤ 100
 * numlist는 중복된 원소를 갖지 않습니다.
 *
 * 입출력 예
 * numlist	                        n	result
 * [1, 2, 3, 4, 5, 6]	            4	[4, 5, 3, 6, 2, 1]
 * [10000,20,36,47,40,6,10,7000]	30	[36, 40, 20, 47, 10, 6, 7000, 10000]
 *
 */
public class UnusualArrangement {
    public static int[] solution(int[] numlist, int n) {
        int[] answer = new int[numlist.length];
        int[] differ = new int[numlist.length];

        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] numlist = new int[size];
        for(int i = 0; i < size; ++i) {
            numlist[i] = input.nextInt();
        }
        int n = input.nextInt();

        int[] answer = solution(numlist, n);
        System.out.print("[");
        for(int i = 0; i < size; ++i) {
            System.out.print(answer[i]);
            if(i < size - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
        System.out.println();
    }
}
