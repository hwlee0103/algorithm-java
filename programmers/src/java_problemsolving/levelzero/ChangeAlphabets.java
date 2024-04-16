package java_problemsolving.levelzero;

import java.util.Scanner;

/**
 * Level : 0
 * Title : 대소문자 바꿔서 출력하기
 *
 * Started : 2024-03-17
 * Solved : 2024-03-17
 *
 */
public class ChangeAlphabets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String answer = "";

        // 모범답안
        for(Character c : a.toCharArray()) {
            if(Character.isUpperCase(c)) {
                answer += Character.toLowerCase(c);
            } else {
                answer += Character.toUpperCase(c);
            }
        }
        System.out.println(answer);

        // 내 답안
//        for(int i = 0; i < a.length(); ++i ){
//            int tmp = (int)a.charAt(i);
//
//            // ASCII 대문자
//            if(tmp >= 65 && tmp <= 90) {
//                answer += (char)(tmp + 32);
//            } else if (tmp >= 97 && tmp <= 122) {
//                answer += (char)(tmp - 32);
//            }
//        }
//        System.out.println(answer);
    }
}
