package java_problemsolving.levelzero.introductionsofps;

import java.util.Scanner;

/**
 * Level : 0
 * Title : 문자열 계산하기
 * 문제 유형 : 코딩테스트 입문
 *
 * Started : 2024-05-17
 * Solved : 2024-05-17
 *
 *
 */
public class CalculateString {
    public static int solution(String my_string) {
        int answer = 0;
        String[] items = my_string.split(" ");
        answer = Integer.valueOf(items[0]);

        for(int i = 1; i < items.length - 1; i += 2) {
            if(items[i].equals("+")) {
                answer += Integer.valueOf(items[i + 1]);
            } else if(items[i].equals("-")){
                answer -= Integer.valueOf(items[i + 1]);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String my_string = input.nextLine();
        System.out.println(solution(my_string));
    }
}
