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
