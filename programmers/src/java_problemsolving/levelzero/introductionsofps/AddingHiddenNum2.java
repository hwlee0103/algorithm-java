package java_problemsolving.levelzero.introductionsofps;

import java.util.Scanner;

/**
 * Level : 0
 * Title : 숨어있는 숫자의 덧셈 (2)
 * 문제 유형 : 코딩테스트 입문
 *
 * Started : 2024-06-02
 * Solved : 2024-06-02
 *
 *
 */
public class AddingHiddenNum2 {
    public static int solution(String my_string) {
        int answer = 0;
        my_string = my_string.replaceAll("[a-zA-Z]", " ");
        String[] str = my_string.split(" ");
        for(String a : str) {
            if(a.equals("")) continue;
            else answer += Integer.valueOf(a);
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String my_string = input.nextLine();
        System.out.println(solution(my_string));
    }
}
