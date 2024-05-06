package java_problemsolving.levelzero.introductionsofps;

import java.util.Scanner;
/**
 * Level : 0
 * Title : 합성수 찾기
 * 문제 유형 : 코딩테스트 입문
 *
 * Started : 2024-05-06
 * Solved : 2024-05-06
 *
 * 문제
 * 약수의 개수가 세 개 이상인 수를 합성수라고 합니다.
 * 자연수 n이 매개변수로 주어질 때 n이하의 합성수의 개수를 return하도록 solution 함수를 완성해주세요.
 *
 * 제한사항
 * 1 ≤ n ≤ 100
 *
 * 입출력 예
 * n	result
 * 10	5
 * 15	8
 *
 */
public class FindingCompositeNum {
    public static int solution(int n) {
        int answer = 0;
        int cnt = 0;
        for(int i = 4; i <= n; ++i) {
            cnt = 0;
            for(int j = 1; j <= i; ++j) {
                if(i%j==0) cnt++;
            }
            if(cnt >= 3) answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(solution(n));
    }
}
