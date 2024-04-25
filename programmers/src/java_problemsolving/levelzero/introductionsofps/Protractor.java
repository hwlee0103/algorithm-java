package java_problemsolving.levelzero.introductionsofps;

import java.util.Scanner;

/**
 * Level : 0
 * Title : 각도기
 * 문제 유형 : 코딩테스트 입문
 *
 * Started : 2024-04-25
 * Solved : 2024-04-25
 *
 * 문제
 * 각에서 0도 초과 90도 미만은 예각, 90도는 직각, 90도 초과 180도 미만은 둔각 180도는 평각으로 분류합니다.
 * 각 angle이 매개변수로 주어질 때 예각일 때 1, 직각일 때 2, 둔각일 때 3, 평각일 때 4를 return하도록 solution 함수를 완성해주세요.
 *
 * 예각 : 0 < angle < 90
 * 직각 : angle = 90
 * 둔각 : 90 < angle < 180
 * 평각 : angle = 180
 *
 * 제한사항
 * 0 < angle ≤ 180
 * angle은 정수입니다.
 *
 * angle	result
 * 70	    1
 * 91	    3
 * 180	    4
 *
 */
public class Protractor {
    public static int solution(int angle) {
        int answer = 0;
        if(angle == 180) answer = 4;
        else if(90 < angle && angle < 180) answer = 3;
        else if(angle == 90) answer = 2;
        else answer = 1;
        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angle = input.nextInt();
        System.out.println(solution(angle));
    }
}
