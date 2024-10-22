package java_problemsolving.levelzero.introductionsofps;

import java.util.Scanner;

/**
 * Level : 0
 * Title : 인덱스 바꾸기
 * 문제 유형 : 코딩테스트 입문
 *
 * Started : 2024-05-15
 * Solved : 2024-05-15
 *
 *
 */
public class ChangingIndex {
    public static String solution(String my_string, int num1, int num2) {
        String answer = "";
        answer += my_string.substring(0, num1);
        answer += my_string.substring(num2, num2+1);
        answer += my_string.substring(num1+1, num2);
        answer += my_string.substring(num1, num1+1);
        answer += my_string.substring(num2+1, my_string.length());
        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String my_string = input.nextLine();
        input.reset();
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        System.out.println(solution(my_string,num1,num2));
    }
}
