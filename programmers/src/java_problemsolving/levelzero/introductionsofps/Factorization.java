package java_problemsolving.levelzero.introductionsofps;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Level : 0
 * Title : 소인수분해
 * 문제 유형 : 코딩테스트 입문
 *
 * Started : 2024-05-07
 * Solved : 2024-05-07
 *
 * 문제
 * 소인수분해란 어떤 수를 소수들의 곱으로 표현하는 것입니다.
 * 예를 들어 12를 소인수 분해하면 2 * 2 * 3 으로 나타낼 수 있습니다.
 * 따라서 12의 소인수는 2와 3입니다.
 * 자연수 n이 매개변수로 주어질 때 n의 소인수를 오름차순으로 담은 배열을 return하도록 solution 함수를 완성해주세요.
 *
 *
 * 제한사항
 * 2 ≤ n ≤ 10,000
 *
 * 입출력 예
 * n	result
 * 12	[2, 3]
 * 17	[17]
 * 420	[2, 3, 5, 7]
 *
 */
public class Factorization {
    public static int[] solution(int n) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i = 2; i <= n; ++i) {
            if(n%i==0) {
                while(n%i==0) {
                    n /= i;
                }
                arr.add(i);
            }
        }
        int[] answer = new int[arr.size()];
        arr.sort(Integer::compareTo);
        for(int i = 0;i < arr.size(); ++i) {
            answer[i] = arr.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] answer = solution(n);
        System.out.print("[");
        for(int i = 0;i < answer.length; ++i) {
            System.out.print(answer[i]);
            if(i < answer.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}
