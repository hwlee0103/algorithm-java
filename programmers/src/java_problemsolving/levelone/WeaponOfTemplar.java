package java_problemsolving.levelone;

import java.util.Scanner;

/**
 * Level : 1
 * Title : 기사단원의 무기
 * 문제 유형 : 연습문제
 *
 * Started : 2024-10-16
 * Solved : 2024-10-16
 *
 *
 */
public class WeaponOfTemplar {
    public static int solution(int number, int limit, int power) {
        int answer = 0;

        for(int i = 1; i <= number; ++i) {
            int cnt = getCnt(i);
            if(cnt > limit) answer += power;
            else answer += cnt;
        }

        return answer;
    }

    public static int getCnt(int num) {
        int cnt = 0;
        for(int i = 1; i * i <= num; ++i) {
            if(i * i == num) cnt++;
            else if(num % i == 0) cnt += 2;
        }

        return cnt;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int limit = input.nextInt();
        int power = input.nextInt();
        System.out.println(solution(number, limit, power));
    }
}
