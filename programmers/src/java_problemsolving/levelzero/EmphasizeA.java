package java_problemsolving.levelzero;

import java.util.Scanner;

/**
 * Level : 0
 * Title : A 강조하기
 * 문제 유형 : 문자열
 *
 * Started : 2024-08-09
 * Solved : 2024-08-09
 *
 *
 */
public class EmphasizeA {
    public static String solution(String myString) {
        String answer = "";
        char[] chars = myString.replaceAll("a", "A").toCharArray();

        for(int i = 0;i < chars.length;i++) {
            if(chars[i] == 'A') {
                answer += String.valueOf(chars[i]);
            } else {
                answer += String.valueOf(chars[i]).toLowerCase();
            }
        }

        return answer;

        // 다른 방법
//        myString = myString.toLowerCase();
//        myString = myString.replaceAll("a", "A");
//        return myString;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(solution(scanner.nextLine()));
    }
}
