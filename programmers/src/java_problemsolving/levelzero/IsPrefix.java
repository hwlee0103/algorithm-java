package java_problemsolving.levelzero;

import java.util.Scanner;

/**
 * Level : 0
 * Title : 접두사인지 확인하기
 * 문제 유형 : 코딩 기초 트레이닝 - 문자열
 *
 * Started : 2024-07-12
 * Solved : 2024-07-12
 *
 * 
 *
 */
public class IsPrefix {
    public static int solution(String my_string, String is_prefix) {
        int answer = 0;
        for(int i = 1; i < my_string.length(); ++i) {
            if(is_prefix.equals(my_string.substring(0, i))) {
                answer = 1;
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String my_string = input.nextLine();
        String is_prefix = input.nextLine();
        System.out.println(solution(my_string, is_prefix));
    }
}
