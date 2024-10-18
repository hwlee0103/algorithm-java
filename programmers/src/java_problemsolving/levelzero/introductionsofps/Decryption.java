package java_problemsolving.levelzero.introductionsofps;

import java.util.Scanner;
/**
 * Level : 0
 * Title : 암호 해독
 * 문제 유형 : 코딩테스트 입문
 *
 * Started : 2024-05-15
 * Solved : 2024-05-15
 *
 *
 */
public class Decryption {
    public static String solution(String cipher, int code) {
        String answer = "";
        for(int i = code - 1; i < cipher.length(); i += code) {
            if((i+1)%code == 0) answer += cipher.charAt(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String cipher = input.nextLine();
        input.reset();
        int code = input.nextInt();
        System.out.println(solution(cipher,code));
    }
}
