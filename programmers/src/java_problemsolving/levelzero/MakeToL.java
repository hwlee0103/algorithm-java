package java_problemsolving.levelzero;

import java.util.Scanner;

/**
 * Level : 0
 * Title : l로 만들기
 * 문제 유형 : 반복문 활용
 *
 * Started : 2024-09-12
 * Solved : 2024-09-12
 *
 *
 */
public class MakeToL {
    public static String solution(String myString) {
        String answer = "";
        char[] strC = myString.toCharArray();
        for(int i = 0; i < myString.length(); i++) {
            if(strC[i] - 'l' < 0) {
                strC[i] = 'l';
            }
            answer += strC[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(solution(input.nextLine()));
    }
}
