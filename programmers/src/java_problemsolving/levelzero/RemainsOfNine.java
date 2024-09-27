package java_problemsolving.levelzero;

import java.util.Scanner;

/**
 * Level : 0
 * Title : 9로 나눈 나머지
 * 문제 유형 : 코딩 기초 트레이닝 - 문자열
 *
 * Started : 2024-07-07
 * Solved : 2024-07-07
 *
 *
 */
public class RemainsOfNine {
    public static int solution(String number) {
        int answer = 0;
        for(Character item : number.toCharArray()) {
            answer += Integer.valueOf(String.valueOf(item));
        }

        return answer%9;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String number = input.nextLine();
        System.out.println(solution(number));
    }
}
