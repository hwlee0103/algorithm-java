package java_problemsolving.levelzero;

import java.util.Scanner;
/**
 * Level : 0
 * Title : 접미사인지 확인하기
 * 문제 유형 : 코딩 기초 트레이닝 - 문자열
 *
 * Started : 2024-07-11
 * Solved : 2024-07-11
 *
 *
 */
public class IsSuffix {
    public static int solution(String my_string, String is_suffix) {
        int answer = 0;
        for(int i = my_string.length() - 1; i >= 0 ; --i) {
            if(is_suffix.equals(my_string.substring(i, my_string.length()))) {
                answer = 1;
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String my_string = input.nextLine();
        String is_suffix = input.nextLine();
        System.out.println(solution(my_string, is_suffix));
    }
}
