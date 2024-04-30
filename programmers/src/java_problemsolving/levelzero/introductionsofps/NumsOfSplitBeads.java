package java_problemsolving.levelzero.introductionsofps;

import java.util.Scanner;
/**
 * Level : 0
 * Title : 구슬을 나누는 경우의 수
 * 문제 유형 : 코딩테스트 입문
 *
 * Started : 2024-04-30
 * Solved : 2024-04-30
 *
 * 문제
 * 머쓱이는 구슬을 친구들에게 나누어주려고 합니다.
 * 구슬은 모두 다르게 생겼습니다.
 * 머쓱이가 갖고 있는 구슬의 개수 balls와 친구들에게 나누어 줄 구슬 개수 share이 매개변수로 주어질 때,
 * balls개의 구슬 중 share개의 구슬을 고르는 가능한 모든 경우의 수를 return 하는 solution 함수를 완성해주세요.
 *
 * 제한사항
 * 1 ≤ balls ≤ 30
 * 1 ≤ share ≤ 30
 * 구슬을 고르는 순서는 고려하지 않습니다.
 * share ≤ balls
 *
 * 제한사항
 * balls	share	result
 * 3	    2	    3
 * 5	    3	    10
 *
 */
public class NumsOfSplitBeads {
    public static int solution(int balls, int share) {
        int answer = 0;
        answer += pick(balls, share, 0, 0);
        answer += pick(balls, share, 0, 1);
        return answer;
    }

    public static int pick(int balls, int share, int idx, int cnt) {
        int answer = 0;
        if(cnt == share) return 1;
        else if(idx >= balls-1) return 0;
        answer += pick(balls, share, idx+1, cnt+1);
        answer += pick(balls, share, idx+1, cnt);
        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int balls = input.nextInt();
        int share = input.nextInt();
        System.out.println(solution(balls, share));
    }
}
